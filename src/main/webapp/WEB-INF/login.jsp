<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  </head>
  
  <body>
    
    <form action="${pageContext.request.contextPath }/login" method="post">
    	<font>用户名:</font><input type="text" name="username"><br/>
    	<font>密码    :</font><input type="text" name="password"><br/>
    	<input type="submit" value="提交">
    </form>
    
  </body>
</html>
