$(document).ready(function() {
	$('#btnCrear').on('click', function(){

		var nombre = document.getElementById("txtNombre");		

		if (nombre.value != "") {
			$("#frmCrearCat").submit();
		}else{
			validarCampos() 
		}
	});
	limpiarCamposIngresar();	

	$('#txtNombre').blur(function() {
		$('#txtNombre').removeClass("campoConFoco").addClass("campoSinFoco");
	});	
});

function validarCampos() {
	
	var nombre = document.getElementById("txtNombre");
		
	if (nombre.value == "") {
		$("#alerts").append('<div class="alert alert-info"><strong>¡Atención! </strong>Debe ingresar todos los campos para crear la categoría</div>')
		$('#txtNombre').focus();
		setTimeout(function(){
			$("#alerts .alert.alert-info").fadeOut('slow');
			setTimeout(function(){
				$(".alert.alert-info").remove();
			}, 1000)
		}, 2000)
	}
}

function limpiarCamposIngresar() {
	$('.textBox').val("");
}


document.getElementById("txtNombre").addEventListener('change', validarCampos)






