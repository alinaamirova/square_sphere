<%-- 
    Document   : result
    Created on : Dec 5, 2017, 8:17:16 PM
    Author     : sasha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
    </head>
    <body>
        <h1>Результат!</h1>
        <h1> ${answer}</h1>
        <form action="/" method="POST"> 
              <button type="submit">Назад</button> 
        </form>
    </body>
</html>
