

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>JSP Page</title>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css">
        <!-- css -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="<c:url value='/css/materialize.css'/>" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="<c:url value='/css/style.css'/>" type="text/css" rel="stylesheet" media="screen,projection"/>
    </head>
    <body>
        <nav class="liteal lighten-5" role="navigation">
            <div class="nav-wrapper container"><a id="logo-container" href="#" class="brand-logo right">MonstersUniversity</a>
                <ul class="left hide-on-med-and-down">

                    <li><a href="login.htm">Cerrar</a></li>
                    <li><a href="usuarios.htm"> Gestión de usuarios</a></li>
                    <li><a href="aspirantes.htm">Gestión de aspirantes</a></li>
                    <li><a href="pruebas.htm">Gestión de pruebas</a></li>
                    <li><a href="reportes.htm">Reportes</a></li>
                </ul>

            </div>
        </nav>
        <h1>Pruebas</h1>
    </body>
</html>

