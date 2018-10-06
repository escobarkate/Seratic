<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css">
        <!-- css -->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="<c:url value='/css/materialize.css'/>" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="<c:url value='/css/style.css'/>" type="text/css" rel="stylesheet" media="screen,projection"/>
        <title>Home</title>
    </head>
    <body>
        <nav class="liteal lighten-5" role="navigation">
            <div class="nav-wrapper container"><a id="logo-container" href="home.htm" class="brand-logo right">Home</a>
                <ul class="left hide-on-med-and-down">
  
                    <li><a href="cerrar.htm">Cerrar sesión</a></li>
                    <li><a href="usuarios.htm"> Gestión de usuarios</a></li>
                    <li><a href="aspirantes.htm">Gestión de aspirantes</a></li>
                    <li><a href="pruebas.htm">Gestión de pruebas</a></li>
                    <li><a href="reportes.htm">Reportes</a></li>
                </ul>

            </div>
        </nav>
        <div class="section no-pad-bot" id="index-banner">
            <div class="container" onclick="location.href = 'login.htm'" >
                <br><br>
                <h1 class="header center orange-text">Bienvenido</h1>
                <div class="row center">
                    <h5 class="header col s12 light">Sistema integral de Admisiones</h5>
                    
                </div>
              
                <br><br>
            </div>
        </div>


        <div class="container">
            <div class="section">

                <!--   Icon Section   -->
                <div class="row">
                    <div class="col s12 m4" onclick="location.href = 'usuarios.htm'">
                        <div class="icon-block">
                            <h2 class="center light-blue-text"><i class="material-icons">accessible</i></h2>
                            <h5 class="center">Gestión de Usuarios</h5>

                            <p class="light">Facilita la administración de usuarios en el sistema.<br> Crear,Editar,Listar y eliminar suarios</p>
                        </div>
                    </div>

                    <div class="col s12 m4">
                        <div class="icon-block" onclick="location.href = 'aspirantes.htm'">
                            <h2 class="center light-blue-text"><i class="material-icons">group</i></h2>
                            <h5 class="center">Gestión de aspirantes</h5>

                            <p class="light">  Permite la administración de aspirantes universitarios.<br> Crear,Editar,Listar y eliminar aspirantes</p>
                        </div>
                    </div>

                    <div class="col s12 m4">
                        <div class="icon-block "onclick="location.href = 'pruebas.htm'">
                            <h2 class="center light-blue-text"><i class="material-icons">Pruebas</i></h2>
                            <h5 class="center">Easy to work with</h5>

                            <p class="light">We have provided detailed documentation as well as specific code examples to help new users get started. We are also always open to feedback and can answer any questions a user may have about Materialize.</p>
                        </div>
                    </div>
                    <div class="col s12 m4">
                        <div class="icon-block "onclick="location.href = 'reportes.htm'">
                            <h2 class="center light-blue-text"><i class="material-icons">Reportes</i></h2>
                            <h5 class="center">Easy to work with</h5>

                            <p class="light">We have provided detailed documentation as well as specific code examples to help new users get started. We are also always open to feedback and can answer any questions a user may have about Materialize.</p>
                        </div>
                    </div>
                </div>

            </div>
            <br><br>
        </div>

        <footer class="page-footer liteal lighten-5"> 
            <div class="footer-copyright">
                <div class="container">
                    Katherin Escobar <a class="orange-text text-lighten-3" href="http://materializecss.com">2018</a>
                </div>
            </div>
        </footer>


        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="../../bin/materialize.js"></script>
        <script src="js/init.js"></script>

    </body>
</html>


