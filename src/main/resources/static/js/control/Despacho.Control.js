var VehiculoItem = {};
$( function() {
	var listaConductor= [];
	var fil = document.getElementById('txtConductor').value;
	$.getJSON("consultarChofer", {"filtro":fil}, function (lista) {
		$.each(lista, function (i, item) {
			let lis;
			lis = listaConductor.push(item.nombre + ' ' + item.tr_apellidoP + ' ' + item.tr_apellidoM);
			console.log(item.nombre);
		});
		console.log(listaConductor);
		var  availableTags = listaConductor;
		//   // $("#id_reg_propietario").append("<option value=" + item.pr_id + ">" + item.pr_nombre + " " + item.pr_apellidoP + " " + item.pr_apellidoM + "</option>");
		//   // $("#id_act_propietario").append("<option value=" + item.pr_id + ">" + item.pr_nombre + "</option>");
	 
		$( "#txtConductor" ).autocomplete({
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

document.getElementById('cboVehiculo').addEventListener('change',function(e){
	e.preventDefault();
	document.getElementById('txtVehiculoPlaca').value = VehiculoItem[this.value-1].veh_nro_placa;
	document.getElementById('txtVehiculoMarca').value = VehiculoItem[this.value-1].veh_marca;
});