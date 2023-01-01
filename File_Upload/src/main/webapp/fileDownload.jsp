<%@ page import="java.net.URLEncoder"%>
<%@ page import="java.io.File"%>
<%@ page import="file.FileDAO" %>
<%@ page import="file.FileDTO" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 파일 압로드</title>
</head>
<body>
	<%
	ArrayList<FileDTO> fileList = new FileDAO().getList();

	for (FileDTO file : fileList) {
		out.write("<a href=\"" + request.getContextPath() + "/downloadAction?file=" + 
		URLEncoder.encode(file.getFileRealName(), "UTF-8") + "\">" + file.getFileName() + 
		"(다운로드 횟수: " + file.getDownloadCount() + ")</a><br>");
	}
	%>
	<p><a href="index.jsp">파일 업로드 페이지 이동</a></p>
</body>
</html>		