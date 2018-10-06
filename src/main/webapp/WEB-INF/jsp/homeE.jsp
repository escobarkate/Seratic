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
                    <li><a href="pruebas.htm"> Crear prueba</a></li>
                    <li><a href="">Visualizar pruebas</a></li>
                
                </ul>

            </div>
        </nav>
        <div class="section no-pad-bot" id="index-banner">
            <div class="container" onclick="location.href = 'login.htm'" >
                <br><br>
                <h1 class="header center orange-text">Bienvenido Evaluador</h1>
                <div class="row center">
                    <h5 class="header col s12 light">Aqui puedes crear tus pruebas y comparar con pruebas pasadas </h5>
                    
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
                            <h5 class="center">Crear prueba</h5>

                            <p class="light">Permite la ceación de pruebas a aspirantes</p>
                        </div>
                    </div>

                    <div class="col s12 m4">
                        <div class="icon-block" onclick="location.href = 'aspirantes.htm'">
                            <h2 class="center light-blue-text"><i class="material-icons">group</i></h2>
                            <h5 class="center">Visualizar Pruebas</h5>

                            <p class="light"> Muestra el resultado de evaluaciones pasadas</p>
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


