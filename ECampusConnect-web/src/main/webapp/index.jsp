<%-- 
    Document   : index
    Created on : 21 Apr, 2016, 4:02:25 AM
    Author     : Advait
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <form action="/InsRecords">
            <table border="1">
              
                <tbody>
                    <tr>
                        <td>ID</td>
                        <td><input type="text" name="id" value="" /></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="name" value="" /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="email" value="" /></td>
                    </tr>
                    <tr>
                        <td>Level</td>
                        <td><input type="text" name="level" value="" /></td>
                    </tr>
                </tbody>
                <input type="submit" value="Click Here" />
            </table>

        </form>
    </body>
</html>

