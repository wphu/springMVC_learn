<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<!-- �� Bootstrap ���� CSS �ļ� -->
	<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	 
	<!-- ��ѡ��Bootstrap�����ļ���һ�㲻ʹ�ã� -->
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
	 
	<!-- jQuery�ļ��������bootstrap.min.js ֮ǰ���� -->
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	 
	<!-- ���µ� Bootstrap ���� JavaScript �ļ� -->
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
			<input type="submit" value="��½" />
	</form>
</body>
</html>