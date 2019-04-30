<%@page import="fr.eni.enienchere.dal.dao.LoginDAO"%>
<jsp:useBean id="loginBean" class="fr.eni.enienchere.beans.LoginBean" scope="session"/>
<jsp:setProperty name="loginBean" property="*"/>

<%
    String result=LoginDAO.loginCheck(loginBean);

    if(result.equals("true")){
        session.setAttribute("email",loginBean.getEmail());
        response.sendRedirect("home.jsp");
    }

    if(result.equals("false")){
        response.sendRedirect("index.jsp?status=false");
    }

    if(result.equals("error")){
        response.sendRedirect("index.jsp?status=error");
    }

%>