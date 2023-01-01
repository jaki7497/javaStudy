package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/downloadAction")
public class downloadAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fileName = request.getParameter("file");
		// race condition attack
		//	String directory = application.getRealPath("/upload/");
		String directory = "C:/Users/USER/Desktop/dev/uploads/";

		File file = new File(directory + "/" + fileName);

		String mimeType = getServletContext().getMimeType(file.toString());

		if (mimeType == null) {
			response.setContentType("application/octet-stream");
		}

		// IE가 아닌 브라우저로 접속한 경우 UTF-8 로 얻어 8859 로 처리
		String downloadName = null;
		if ((request.getHeader("user-agent").indexOf("MISE") == -1)
				|| (request.getHeader("user-agent").indexOf("Trident") == -1)) {
			downloadName = new String(fileName.getBytes("UTF-8"), "8859_1");
		} else {
			downloadName = new String(fileName.getBytes("EUC-KR"), "8859_1");
		}

		response.setHeader("Content-Disposition", "attachment;filename=\"" + downloadName + "\";");

		FileInputStream fileInputStream = new FileInputStream(file);
		ServletOutputStream servletOutputStream = response.getOutputStream();

		byte b[] = new byte[1024];
		int data = 0;

		while ((data = (fileInputStream.read(b, 0, b.length))) != -1) {
			servletOutputStream.write(b, 0, data);
		}
		
		new FileDAO().hit(fileName);

		servletOutputStream.flush();
		servletOutputStream.close();
		fileInputStream.close();
	}

}
