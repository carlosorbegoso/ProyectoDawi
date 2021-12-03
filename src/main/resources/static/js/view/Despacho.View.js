$(function () {

	ViajeNuevo();
	//  ViajeActivo.empl_id = EmpleadoId;
	// EmpleadoBuscar();
	// VehiculoListar("cboVehiculo");
	// RutaListar("cboRutaNombre");
	document.getElementById('btnIngresarViaje').addEventListener('click', function (e) {
		e.preventDefault();
		ViajesGuardar(ViajeActivo);
	});

	//     window.onload = function(){
	//             var fecha = new Date(); //Fecha actual
	//             var mes = fecha.getMonth()+1; //obteniendo mes
	//             var dia = fecha.getDate(); //obteniendo dia
	//             var anio = fecha.getFullYear(); //obteniendo año
	//          if(dia<10)
	//            dia='0'+dia; //agrega cero si el menor de 10
	//          if(mes<10)
	//            mes='0'+mes //agrega cero si el menor de 10
	//          var  fecha = anio+"-"+mes+"-"+dia;
	// 		   ViajesCargar(fecha);
	//            ViajeActivo.viaje_fecha = fecha;
	//          document.getElementById('txtFecha').value=anio+"-"+mes+"-"+dia;
	//        }



	// 	$(".btn-action").click(function (e) {
	// 		e.preventDefault();
	// 		switch ( $(this).attr('data-action')) {
	// 			case 'conductor.filtro':
	// 			  $('#dlgConductorFiltro').modal('show');   

	// 			break
	// 			case 'buscar':
	// 				// alert("aqui");

	// 				break;
	// 			case 'nuevo':

	// 		   default:
	// 		   console.log($(this).attr('data-action'));
	// 		}

	// 	});

	//    $('#dlgConductorFiltro').on('show.bs.modal',function (e) {
	// 	   var button = $(e.relatedTarget)
	//    });
	// 	document.getElementById('btnIngresarViaje').addEventListener('click',function(e){
	// 			e.preventDefault();
	// 			ViajesGuardar(ViajeActivo);
	// 		});
	// 	document.getElementById('txtFecha').addEventListener('change',function(e){
	// 		e.preventDefault();

	// 		ViajeActivo.viaje_fecha = this.value;
	// 		ViajesCargar(this.value);
	// 		Fecha = this.value;
	// 	});
	// 	document.getElementById('cboRutaNombre').addEventListener('change',function(e){
	// 		e.preventDefault();
	// 		ViajeActivo.ruta_id = this.value;
	// 	});
	// 	document.getElementById('cboVehiculo').addEventListener('change',function(e){
	// 		e.preventDefault();
	// 		ViajeActivo.vehi_id = this.value;

	// 	});
	// 	document.getElementById('txtHoraSalida').addEventListener('change',function(e){
	//         e.preventDefault();
	//          ViajeActivo.viaje_hora_salida = this.value;
	//     })



	//    document.getElementById("btnDespachoBuscarConductor").addEventListener("click", function (e) {
	//    	e.preventDefault();
	//    	//$('#dlgConductorFiltro').modal('show');

	//    });

	//     $('#dlgConductorFiltro').on('show.bs.modal', function (e) {
	//         var button = $(e.relatedTarget) // Button that triggered the modal
	//         //var recipient = button.data('whatever') // Extract info from data-* attributes
	//         // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
	//         // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
	//         //var modal = $(this);
	//         //modal.find('.modal-title').text('TRABAJADOR / BUSCAR / FILTRO ' + recipient)
	//         //modal.find('.modal-body input').val(recipient)
	//       //  EmpleadoBuscar();
	//     });
	document.getElementById('txtFecha').addEventListener('change', function (e) {
		e.preventDefault();
		ViajeActivo.fecha = this.value;
		ViajesBuscarFecha({fecha:this.value});
	});
	document.getElementById('cboRutaNombre').addEventListener('change', function (e) {
		e.preventDefault();
		ViajeActivo.vj_ruta = this.value;
	});
	document.getElementById('cboDireccion').addEventListener('change', function (e) {
		e.preventDefault();
		ViajeActivo.vj_lado = this.value;
	});
	document.getElementById('cboVehiculo').addEventListener('change', function (e) {
		e.preventDefault();
		ViajeActivo.id_vehiculo = this.value;
	});
	document.getElementById('txtHoraSalida').addEventListener('change', function (e) {
		e.preventDefault();
		ViajeActivo.vj_hora_inicial = this.value;
	});
	document.getElementById('cboVehiculo').addEventListener('change', function (e) {
		e.preventDefault();
		ViajeActivo.vehiculo.codigo = this.value;
	});
	document.getElementById('txtConductor').addEventListener('change', function (e) {
		ViajeActivo.conductor_nombre = this.value;
	});


});

