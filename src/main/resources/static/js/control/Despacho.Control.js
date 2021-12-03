var VehiculoItem = {};
var ViajeActivo = {};
var ViajeOcion = null;
var EmpleadoId = "";
var Fecha = "";
$(function () {

	var listaConductor = [];
	var fil = document.getElementById('txtConductor').value;
	$.getJSON("consultarChofer", { "filtro": fil }, function (lista) {
		$.each(lista, function (i, item) {
			let lis;
			lis = listaConductor.push(item.nombre + ' ' + item.tr_apellidoP + ' ' + item.tr_apellidoM);
		});
		var availableTags = listaConductor;
		//   // $("#id_reg_propietario").append("<option value=" + item.pr_id + ">" + item.pr_nombre + " " + item.pr_apellidoP + " " + item.pr_apellidoM + "</option>");
		//   // $("#id_act_propietario").append("<option value=" + item.pr_id + ">" + item.pr_nombre + "</option>");

		$("#txtConductor").autocomplete({
			source: availableTags
		});
	});


});

$.getJSON("listaVehiculos", {}, function (data) {
	$.each(data, function (i, item) {
		$("#cboVehiculo").append("<option value=" + item.vehi_id + ">" + item.codigo + "</option>");
		// $("#id_act_propietario").append("<option value=" + item.pr_id + ">" + item.pr_nombre + "</option>");
		VehiculoItem = data;
	});

});

document.getElementById('cboVehiculo').addEventListener('change', function (e) {
	e.preventDefault();
	document.getElementById('txtVehiculoPlaca').value = VehiculoItem[this.value - 1].veh_nro_placa;
	document.getElementById('txtVehiculoMarca').value = VehiculoItem[this.value - 1].veh_marca;
});

function ViajeNuevo() {
	try {
		var viaje = new Viajes();
		viaje.Nuevo();
		ViajeActivo = viaje.get();
		// ViajesCargar(document.getElementById('txtFecha').value);
	} catch (e) {
		console.log(e);
	}
}
// VehiculosBuscar();
// function VehiculosBuscar(params) {
// 	try {
// 		var viaje = new Viajes();
// 		viaje.ListarVehiculo(params).done(function (rs, texStatus, jqXHR) {
// 			console.log(rs);
// 			var html = `<table class="table table-hover">
// 						<thead>	
// 							<tr>
// 								<th>#</th>
// 								<th>UNIDAD</th>
// 								<th>HORA SALIDA</th>
// 							</tr>
// 						</thead>
// 				`;
// 			var n = 0;
// 			for (var v in rs) {
// 				var V = rs[v];
// 				n += 1;
// 				html += `
// 						<tbody>
// 							<tr>
// 								<th>${n}</th>
// 								<th> ${V.id_vehiculo}</th>
// 								<th>${V.vj_hora_inicial}</th>
// 							</tr>
// 						</tbody>
// 				`;
// 			}
// 			// document.getElementById('contenedorListaSalida').innerHTML = html;
			

// 		}).fail(function (jqXHR, texStatus, errorThrown) {
// 			console.log("Buscar", texStatus, errorThrown);
// 		});
// 	} catch (e) {
// 		console.log(e);
// 	}
// }


function ViajesBuscar(params) {
	try {
		var viaje = new Viajes();
		viaje.Buscar(params).done(function (rs, texStatus, jqXHR) {
			var html = `<table class="table table-hover">
						<thead>	
							<tr>
								<th>#</th>
								<th>UNIDAD</th>
								<th>HORA SALIDA</th>
							</tr>
						</thead>
				`;
			var n = 0;
			for (var v in rs) {
				var V = rs[v];
				n += 1;
				html += `
						<tbody>
							<tr>
								<th>${n}</th>
								<th> ${V.vehiculo.codigo}-${V.vehiculo.veh_nro_placa}</th>
								<th>${V.vj_hora_inicial}</th>
							</tr>
						</tbody>
				`;
			}
			document.getElementById('contenedorListaSalida').innerHTML = html;
			//PanelVer('cardEmpleadoBuscar');

		}).fail(function (jqXHR, texStatus, errorThrown) {
			console.log("Buscar", texStatus, errorThrown);
		});
	} catch (e) {
		console.log(e);
	}
}

function ViajesGuardar(params){
	
	try {
		if(ViajeActivo.vj_fecha == "" )throw "POR FAVOR DEBE SELECCIONAR FECHA";
		if(ViajeActivo.id_vehiculo == "") throw "POR FAVOR DBE SELECCIONAR UN VEHICULO ";
		if(ViajeActivo.vj_hora_inicial == "") throw "POR FAVOR SELECCIONE LA HORA DE INICIAL";
	   
		var viaje = new Viajes();
		viaje.Guardar(params)
		.done(function(rs, textStatus,jqXHR){
			try {
				//  if(ViajeActivo.empl_id == "") throw "POR FAVOR DEBE SELECCIONAR UN CONDUCTOR";
				ViajeActivo = {};
				ViajesBuscar();
				
				} catch (e) {
					alert(e);
				}finally{
				
				}
		}).fail(function(jqXHR, textStatus,errorThrown){
			console.log("Guardar", textStatus,errorThrown);
		});

	} catch (e) {
		swal("Error", e, "error");
	  
		
	}
}

ViajesBuscar();