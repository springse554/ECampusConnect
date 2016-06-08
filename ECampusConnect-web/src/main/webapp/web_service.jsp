<%-- 
    Document   : index
    Created on : 8 Jun, 2016, 12:10:38 AM
    Author     : Advait
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>REST Example</title>
    </head>
    <body>
        <div style="padding-left:100px;font-family: monospace;">
            <h2>Create Course</h2>
            <form action="rest/animals" method="POST">
                <div style="width: 200px; text-align: left;">
                    <div style="padding:10px;">
                        Course ID: <input name="id" />
                    </div>
                    <div style="padding:10px;">
                        Course Name: <input name="animalename" />
                    </div>
                    <div style="padding:10px;">
                        Course Type: <input name="animaltype" />
                    </div>
                    <div style="padding:10px;text-align:center">
                        <input type="submit" value="Submit" />
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>