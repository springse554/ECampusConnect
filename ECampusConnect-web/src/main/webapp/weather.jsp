<%-- 
    Document   : weather
    Created on : Jun 9, 2016, 4:04:56 AM
    Author     : Dhaval
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body onload="weatherLoader()">
        <h1><div id="weather">Weather Data</div></h1>
        <script>
            function weatherLoader() {
                var xmlhttp = new XMLHttpRequest();
                xmlhttp.onreadystatechange = function() {
                    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                        var myArr = JSON.parse(xmlhttp.responseText);
                        myFunction(myArr);
                    }
                };
                xmlhttp.open("GET", "http://api.openweathermap.org/data/2.5/weather?id=4887398&units=metric&APPID=2775de66607d2596792c0e174f5f0b27", true);
                xmlhttp.send();
                function myFunction(arr) {
                    var temp = arr.main.temp;
                    document.getElementById("weather").innerHTML = "Weather in Chicago is " + temp + " degree Celsius.";
                }

                console.log(xmlhttp.status);
                console.log(xmlhttp.statusText);
            }

        </script>
    </body>
</html>
