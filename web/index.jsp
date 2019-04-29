<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>Login System</title>
</head>

<body>
<%
    String email=(String)application.getAttribute("email");

    //redirect user to home page if already logged in
    if(email!=null){

        response.sendRedirect("home.jsp");
    }

    String status=request.getParameter("status");

    if(status!=null){
        if(status.equals("false")){
            out.print("Incorrect login details!");
        }
        else{
            out.print("Some error occurred!");
        }
    }
%>

<form action="loginRequestHandler.jsp">
    <table cellpadding="5">
        <tr>
            <td><b>Email:</b></td>
            <td><input type="text" name="email" required/></td>
        </tr>

        <tr>
            <td><b>Password:</b></td>
            <td><input type="password" name="password" required/></td>
        </tr>

        <tr>
            <td colspan="2" align="center"><input type="submit" value="Login"/></td>
        </tr>

    </table>
</form>

</body>
</html>