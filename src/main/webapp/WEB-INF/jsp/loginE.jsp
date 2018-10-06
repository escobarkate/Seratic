<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link href="<c:url value='/css/materialize.css'/>" type="text/css" rel="stylesheet" media="screen,projection"/>
        <link href="<c:url value='/css/style.css'/>" type="text/css" rel="stylesheet" media="screen,projection"/>
        <title>Login</title>
    </head>
    <body class="red lighten-2">


        <div class="section"></div>
        <main id="container">
            <center>                       
                <br/>

                <br/>
                <div class="container" >
                    <div class="z-depth-1 grey lighten-3 row" style="display: inline-block; padding: 30px 68px 0px 68px; border: 1px solid #EEE;">

                        <form:form method="post" modelAttribute="usuario">
                            <h5 class="pink-text">Inicio de sesión Evaluador</h5>
                            <div class='row margin'>
                                <div class='input-field col s12'>
                                    <i class="mdi-social-person-outline prefix"></i>
                                    <form:label for="icon_prefix" path="usuario">Usuario</form:label>
                                    <form:input id="icon_prefix" type="text" class="validate" required="true" aria-required="true" path="usuario" />

                                </div>
                            </div>
                            <div class='row margin'>
                                <div class='input-field col s12'>
                                    <i class="mdi-action-lock-outline prefix"></i>
                                    <form:label for="icon_prefix1" path="contrasena">Contraseña</form:label>
                                    <form:input type="password" id="icon_prefix1"  class="validate" required="true" aria-required="true" path="contrasena" />

                                </div>
                            </div>
                         
                            <br/>
                            <center>
                                <div class='row '>
                                    <button type="submit" value="Enviar" name="submit" class="btn waves-effect waves-light pink lighten-3 col s12">Ingresar</button> 
                                </div>
                                <div class="row">
                                    <div class="input-field ">
                                        <p class="margin medium-small "><a href="agregarUsuario.htm?">Registrate</a></p>
                                    </div>
                                    <div class="input-field " >
                                        <p class="margin medium-small "><a href="loginA.htm">Ingresar <br>como aspirante</a></p>
                                    </div>
                                    <div class="input-field " >
                                        <p class="margin medium-small "><a href="login.htm">Ingresar <br>como administrador</a></p>
                                    </div>
                                </div>


                            </center>
                            <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
                        </form:form>    
                    </div>
                </div>
                <br/>             
        </center>



    </main>

    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
    <!--  Scripts-->
    <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="<c:url value='/js/materialize.js'/>"></script>
    <script src="<c:url value='/js/init.js'/>"></script>          
    <script>
        $('select').material_select();
    </script>
</body>
</html>

