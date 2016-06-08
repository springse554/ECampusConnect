<%-- 
    Document   : admin_dashboard
    Created on : 8 Jun, 2016, 3:43:28 PM
    Author     : Advait
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
        <style>
            .student {width:400px;
                     margin:auto;
                     font-size:15px;
                     border:1px solid #000;     border-collapse:collapse; }
            .professor {width:400px;
                     margin:auto;
                     font-size:15px;
                     border:1px solid #000;     border-collapse:collapse; }
            .course {width:400px;
                     margin:auto;
                     font-size:15px;
                     border:1px solid #000;     border-collapse:collapse; }
            </style>
        </head>
        <body>
        <marquee><h1>Welcome to the Admin Dashboard</h1></marquee>

            <h2><a href="view_student.jsp">View Student Records</a></h2>
            <h2><a href="view_professor.jsp">View Professor Records</a></h2>
            <h2><a href="view_course.jsp">View Courses Records</a></h2>
            
            <div>
                <form name="new_student" class = "student" action="NewStudent" method="POST">
                Enter Id: <input type="text" name="id"/></br>
                Enter Name: <input type="text" name="name"/></br>
                Enter Email: <input type="text" name="email"/></br>
                Enter Level: <input type="text" name="level"/></br>
                Enter Username: <input type="text" name="username"/></br>
                Enter Password: <input type="password" name="password"/></br>
                <input type="SUBMIT" value="CREATE NEW STUDENT"/>
            </form>
        </div>
            <br>
        <div>
            <form name="new_professor" class = "professor" action="NewProfessor" method="POST">
                Enter Id: <input type="text" name="id"/></br>
                Enter Name: <input type="text" name="name"/></br>
                Enter Email: <input type="text" name="email"/></br>
                Enter Department: <input type="text" name="department"/><br>
                Enter Username: <input type="text" name="username"/></br>
                Enter Password: <input type="password" name="password"/></br>
                <input type="SUBMIT" value="CREATE NEW PROFESSOR"/>
            </form>
        </div>
            <br>
        <div>
            <form name="new_course" class = "course" action="NewCourse" method="POST">
                Enter Id: <input type="text" name="id"/></br>
                Enter Name: <input type="text" name="name"/></br>
                Enter Email: <input type="text" name="email"/></br>
                Enter Username: <input type="text" name="username"/></br>
                Enter Password: <input type="password" name="password"/></br>
                <input type="SUBMIT" value="CREATE NEW COURSE"/>
            </form>
        </div>

    </body>

</html>
