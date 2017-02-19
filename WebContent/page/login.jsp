<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	 
	<!-- 可选的Bootstrap主题文件（一般不使用） -->
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
	 
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	 
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=gbk">
	<title>Please Login</title>
</head>
<body>


	<c:if test="${error != null}">
	   <div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<p class="text-left text-error">
					<em> <font color="#FF0000">  ${error} </font>  </em>
				</p>
			</div>
		</div>
	</div>
	</c:if>


	<form action="login.do" method="post">
		username:<input type="text" name="username" />
		<p>
			password:<input type="password" name="password" />
		<p>
			<input type="submit" value="登陆" />
	</form>
</body>
</html>