<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>include指令(静态包含(编译时包含)，它包含的所有的jsp会编译成一个servlet)</title>
</head>
<body>
      <%@ include file="/public/head.jsp" %>
        aaaaaaaaaaaaaaaaa<br/>
      <%@ include file="/public/foot.jsp" %>
      
      
</body>
</html>