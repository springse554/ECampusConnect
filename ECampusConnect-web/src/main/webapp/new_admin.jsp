<%-- 
    Document   : new_admin
    Created on : 8 Jun, 2016, 12:30:13 PM
    Author     : Advait
--%>
<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SE554DB",
            "APP", "APP");
    Statement st = con.createStatement();
    ResultSet rs;
    int i = st.executeUpdate
        ("insert into Admin values ('" + id + "','" + name + "','" + email +"','" + username + "','" + password + "'  )"); 


%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Admin</title>
    </head>
    <body>
        <form name="new_admin" action="new_admin.jsp" method="POST">
            Enter ID: <input type="text" name="id"/></br>
            Enter Name: <input type="text" name="name"/></br>
            Enter Email: <input type="text" name="email"/></br>
            Enter Username: <input type="text" name="username"/></br>
            Enter Password: <input type="password" name="password"/></br>
            <input type="SUBMIT" value="CREATE NEW ACCOUNT"/>
        </form>
    </body>
</html>
