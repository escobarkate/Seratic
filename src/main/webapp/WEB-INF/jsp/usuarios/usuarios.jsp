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

                    <li><a href="cerrar.htm">Cerrar sesión</a></li>
                    <li><a href="usuarios.htm"> Gestión de usuarios</a></li>
                    <li><a href="aspirantes.htm">Gestión de aspirantes</a></li>
                    <li><a href="pruebas.htm">Gestión de pruebas</a></li>
                    <li><a href="reportes.htm">Reportes</a></li>
                </ul>

            </div>
        </nav>
    <body>             
        <div class="container">                               
            <center><h3 style="color:grey darken-3">Gestión de Usuarios</h3></center>
            <br/>   
            <br/> 

            <div class="row" align="right">                        
                <div class="col s12">                    
                    <a href="agregarUsuario.htm"  class="modal-trigger btn-large waves-effect waves-yellow green"><i class="material-icons left">add_circle</i>Agregar Usuario</a>
                </div>
            </div>
            <table id="tabla" class="striped centered responsive-table">  
                <thead>                          
                    <tr>
                        <th>Cedula</th>
                        <th>Nombre</th>
                        <th>Usuario</th>
                        <th>Contrasena</th>
                        <th>Tipo</th>  
                        <th>Fecha de Registro</th>  
                        <th></th>

                    </tr> 
                </thead>  


                <tbody> 
                    <c:forEach items="${usuarios}" var="usuarios">  
                        <tr>                                                                        
                            <td><c:out value="${usuarios.id}" /></td>
                            <td><c:out value="${usuarios.nombre}" /></td>
                            <td><c:out value="${usuarios.usuario}" /></td>
                            <td><c:out value="${usuarios.contrasena}" /></td>
                            <td><c:out value="${usuarios.tipo}" /></td>   
                            <td><c:out value="${usuarios.fecha}" /></td> 
                            <td>
                                <a title="Eliminar" href="<c:url value="eliminarUsuario.htm?id=${usuarios.id}"/>"><i Style="color:#546e7a;" class="material-icons">delete</i></a>
                       
                               
                                <a title="Editar" href="<c:url value="editarUsuario.htm?id=${usuarios.id}"/>"><i Style="color:#546e7a;" class="material-icons">edit</i></a>
                            </td>                                        
                        </tr>


                     
                </c:forEach>
                <tbody>                                  
            </table>

            <

        </div>
    </body>

    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
    <!--  Scripts-->
    <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="<c:url value='/js/materialize.js'/>"></script>
    <script src="<c:url value='/js/init.js'/>"></script>    

    <script>
        $('.modal').modal();
    </script> 
</body>
</html>