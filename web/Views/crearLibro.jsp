<%-- 
    Document   : crearCategoria
    Created on : 30/04/2018, 12:42:52 PM
    Author     : programacion01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CREAR LIBRO</title>
         <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <script
	src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <script
	src='http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js'></script>
        <link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
        <link 
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous"
        rel="stylesheet">
    </head>
    <body class="container">
        <form method="post" action="Servlets/Servlet_Cat" id="frmCrearCat" class="form-group">
            <header>            
                <div class="row">
                    <img src="../images/libro.jpg" class="img-responsive left-block" alt="CATEGORíAS" style="text-align:left; margin: 0px; display: block;">
                    <h1 style="margin: 100px;">CREAR LIBROS</h1>
                </div>
            </header>
            <br />
            <br /> 
            <!-- CONTENIDO -->
            <div class="contenido col-xs-12 col-md-12 text-md-center" id="contenido">
		<section> 
                    <article>
			
			<div class="row">
                            <div class="col-md-12">
				<div class="input-group">
                                    <span class="input-group-addon"> 
					<label class="label control-label" >Nombre del libro:</label>
                                    </span> 
                                    <input type="text" name="txtNombre" id="txtNombre" class="textBox form-control col-md-4" placeholder="Libro">
				</div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
				<div class="input-group">
                                    <span class="input-group-addon"> 
					<label class="label control-label" >Autor del libro:</label>
                                    </span> 
                                    <input type="text" name="txtAutor" id="txtAutor" class="textBox form-control col-md-4" placeholder="Autor">
				</div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
				<div class="input-group">
                                    <span class="input-group-addon"> 
					<label class="label control-label" >Categoría del libro:</label>
                                    </span> 
                                    <select name="categoria">
                                        <option value="<%libro.getCategoria();%>"></option>
                                    </select>
				</div>
                            </div>
                        </div>
                        <br />
                        <br />                        
                        <div class="row col-md-6" style="align-content: center;">
                            <div class="text-md-center">
				<div class="input-group" >
                                    <input type="button" class="button btn btn-success" name="btnCrear" value="CREAR CATEGORÍA" id="btnCrear" title="CREAR CATEGORÍA"> 
                                    <input type="hidden" name="accion" value="crear">
								
                                    <div class="link col-md-6">
					<a href="../index.html" id="lnklogin" class="link btn btn-primary"><i
					class="fa fa-backward" aria-hidden="true"></i> Regresar</a>
                                    </div>
				</div>
                            </div>
			</div>					
		</article>
		</section>
            </div>	
        </form>
    </body>
</html>
