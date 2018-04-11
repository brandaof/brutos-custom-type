<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Brutos custom type example</title>
    </head>
    <body>
        <h1>Brutos custom type example</h1>
        <hr>
        <table cellpadding="2" cellspacing="2" width="100%">
            <tr>
                <td width="15%">Controller</td>
                <td>${value.controller.classType.simpleName}</td>
            </tr>
            <tr>
                <td width="15%">Action method</td>
                <td>${value.action.method}</td>
            </tr>
        </table>
    </body>
</html>
