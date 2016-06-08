<%-- 
    Document   : professor
    Created on : 8 Jun, 2016, 12:19:53 PM
    Author     : Advait
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Admin</title>
    </head>
    <body>
        <h1 align="center">Welcome to DePaul University Campus Connect</h1>
        <form name="login_form" action="Login" method="POST">
            <table border="1" align="center">
                <tbody>
                    <tr>
                        <td>Enter Username:</td>
                        <td><input type="text" name="username" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Password:</td>
                        <td><input type="password" name="password" value="" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Login" name="login" /></td>
                        
                    </tr>
                    <tr>
                        <td colspan="2"><a href="new_admin.jsp">For new User. Create account</a></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
