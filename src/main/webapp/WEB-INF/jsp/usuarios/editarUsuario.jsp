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
        <title>Seratic</title>
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
        <div class="container">
            <br/>
            <center><h4 style="color:grey darken-3">Edición de Usuarios</h4></center>
            <br/>
            <form:form method="post" modelAttribute="usuario">                           
                
                <div class="row">
                    <div class="input-field col s6">
                        <i class="material-icons prefix">person</i>
                        <form:input id="icon_prefix" path="nombre" type="text" class="validate" required="true" aria-required="true"/>
                        <form:label for="icon_prefix" path="nombre">Nombre</form:label>                        
                    </div>
                                        
                    <div class="input-field col s6">
                        <i class="material-icons prefix" >account_circle</i>
                        <form:input id="icon_prefix" path="usuario" type="text" class="validate" required="true" aria-required="true"/>
                        <form:label for="icon_prefix" path="usuario">Usuario</form:label> 
                    </div>
                    
                                                
                </div>
                <div class="row">
                      <div class="input-field col s6">
                        <i class="material-icons prefix" >lock_outline</i>
                        <form:input id="icon_prefix" path="contrasena" type="password" class="validate" required="true" aria-required="true"/>
                        <form:label for="icon_prefix" path="contrasena">Contraseña</form:label>                         
                    </div>
                    <div class="input-field col s6">
                        <i class="material-icons prefix" >lock_outline</i>
                        <form:input id="icon_prefix" path="tipo" type="text" class="validate" required="true" aria-required="true"/>
                        <form:label for="icon_prefix" path="tipo">Tipo</form:label>                         
                    </div>
                    
                   
                </div>                
                <br></br>
                <center><button class="waves-effect waves-yellow btn gray" type="submit" name="submit">Guardar Cambios</button></center>
            </form:form>                                                                    
        </div>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.1/jquery.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
       
        
    </body>
</html>

