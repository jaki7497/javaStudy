<%@page import="java.util.Enumeration"%>
<%@ page import="file.FileDAO"%>
<%@ page import="java.io.File"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 파일 업로드</title>
</head>
<body>
	<%
	// application : 전체 프로제트에 대한 자원을 관리하는 객체
	// race condition attack
	//	String directory = application.getRealPath("/upload/");
	String directory = "C:/Users/USER/Desktop/dev/uploads/";
	// 업로드 최대 용량 제한 설정
	int maxSize = 1024 * 1024 * 100;
	String encoding = "UTF-8";

	MultipartRequest multipartRequest = new MultipartRequest(request, directory, maxSize, encoding,
			new DefaultFileRenamePolicy());

	Enumeration fileNames = multipartRequest.getFileNames();
	while (fileNames.hasMoreElements()) {
		String parameter = (String) fileNames.nextElement();
		String fileName = multipartRequest.getOriginalFileName(parameter);
		String fileRealName = multipartRequest.getFilesystemName(parameter);

		if (fileName == null)
			continue;
		// webshell upload attack
		if (!fileName.endsWith(".jpg") && !fileName.endsWith(".png") && !fileName.endsWith(".txt")
		&& !fileName.endsWith(".zip")) {
			File file = new File(directory + fileRealName);
			file.delete();
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('jpg, png, txt, zip 확장자 파일만 업로드 가능합니다.')");
			script.println("history.back()");
			script.println("</script>");
		} else {
			new FileDAO().upload(fileName, fileRealName);
			out.write("파일명: " + fileName + "<br>");
			out.write("실제 파일명: " + fileRealName + "<br>");
		}
	}
	%>
	<p><a href="index.jsp">파일 업로드 페이지 이동</a></p>
</body>
</html>