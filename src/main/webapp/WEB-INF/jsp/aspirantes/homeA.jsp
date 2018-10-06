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
        <!--Navigation Bar-->
        <nav class="liteal lighten-5" role="navigation">
            <div class="nav-wrapper container"><a id="logo-container" href="#" class="brand-logo right">MonstersUniversity</a>
                <ul class="left hide-on-med-and-down">
                    <li><a href="cerrar.htm">Cerrar sesión</a></li><li>
                        <a href="crearPruebas.htm">Crear Pruebas</a></li>
                    <li><a href="verPruebas.htm">Ver pruebas</a></li>
                    
                </ul>

            </div>
        </nav>
        <div class="container">
            <br/>
            <center><h4 style="color:teal">Resultado de la Prueba</h4></center>
            <br/>
            <form:form method="post" modelAttribute="usuario">                           
                <div class="row">
                    
                    <div class="input-field col s6">
                        <i class="material-icons prefix">person</i>
                        <form:input id="icon_prefix" path="nombreA" type="text" class="validate" required="true" aria-required="true"/>
                        <form:label for="icon_prefix" path="nombreA">Aspirante</form:label>                        
                    </div>
                    <div class="input-field col s6">
                        <i class="material-icons prefix">person</i>
                        <form:input id="icon_prefix" path="nombreE" type="text" class="validate" required="true" aria-required="true"/>
                        <form:label for="icon_prefix" path="nombreE">Evaluador</form:label>                        
                    </div>
                </div>
                <div class="row">
                                      
                    <div class="input-field col s6">
                        <i class="material-icons prefix" >account_circle</i>
                        <form:input id="icon_prefix" path="carrera" type="text" class="validate" required="true" aria-required="true"/>
                        <form:label for="icon_prefix" path="carrera">Carrera</form:label> 
                    </div>
                    <div class="input-field col s6">
                        <i class="material-icons prefix" >account_circle</i>
                        <form:input id="icon_prefix" path="detalle" type="text" class="validate" required="true" aria-required="true"/>
                        <form:label for="icon_prefix" path="detalle">Detalle</form:label> 
                    </div>
                  
                    </div>
                    
                    <div class="row">
                                      
                    <div class="input-field col s6">
                        <i class="material-icons prefix" >account_circle</i>
                        <form:input id="disabled"  path="evaluacion" type="text" />
                        <form:label for="disabled " path="evaluacion">Fecha</form:label> 
                    </div>
                    
                  
                    </div>
                     
                                                
                </div>
                
            </form:form>                                                                    
        </div>
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

