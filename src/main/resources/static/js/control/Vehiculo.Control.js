
$.getJSON("listaPropietarios", {}, function (data) {
	$.each(data, function (i, item) {
		$("#id_reg_propietario").append("<option value=" + item.pr_id + ">" + item.pr_nombre + " " + item.pr_apellidoP + " " + item.pr_apellidoM + "</option>");
		$("#id_act_propietario").append("<option value=" + item.pr_id + ">" + item.pr_nombre + "</option>");
	});
});

$("#id_btn_filtrar").click(function () {
	var fil = $("#id_txt_filtro").val();
	$.getJSON("consultaVehiculo", { "filtro": fil }, function (lista) {
		agregarGrilla(lista);
	});
});
function agregarGrilla(lista) {
	$('#id_table').DataTable().clear();
	$('#id_table').DataTable().destroy();
	$('#id_table').DataTable({
		data: lista,
		searching: false,
		ordering: true,
		processing: true,
		pageLength: 5,
		lengthChange: false,
		columns: [
			{ data: "vehi_id" },
			{ data: "codigo" },
			{ data: "veh_nro_placa" },
			{ data: "veh_nro_serie", },
			{ data: "veh_nro_motor" },
			{ data: "veh_color" },
			{ data: "veh_marca" },
			{ data: "veh_modelo" },
			{ data: "propietario.pr_nombre" },
			{
				data: function (row, type, val, meta) {
					var salida = '<button type="button" style="width: 90px" class="btn btn-info btn-sm" onclick="editar(\'' + row.vehi_id + '\',\'' + row.codigo + '\',\'' + row.veh_nro_placa + '\',\'' + row.veh_nro_serie + '\',\'' + row.veh_nro_vin + '\',\'' + row.veh_nro_motor + '\',\'' + row.veh_color + '\',\'' + row.veh_marca + '\',\'' + row.veh_modelo + '\',\'' + row.vehi_placa_vigente + '\',\'' + row.vehi_placa_anterior + '\',\'' + row.vehi_estado + '\',\'' + row.vehi_anotaciones + '\',\'' + row.vehi_sede + '\',\'' + row.propietario.pr_id + '\')">Editar</button>';
					return salida;
				}, className: 'text-center'
			},
			{
				data: function (row, type, val, meta) {
					var salida = '<button type="button" style="width: 90px" class="btn btn-warning btn-sm" onclick="eliminar(\'' + row.vehi_id + '\')">Eliminar</button>';
					return salida;
				}, className: 'text-center'
			},
		]
	});

}

$("#id_btn_registra").click(function () {
	var validator = $('#id_form_registra').data('bootstrapValidator');
	validator.validate();

	if (validator.isValid()) {
		$.ajax({
			type: "POST",
			url: "registrarVehiculo",
			data: $('#id_form_registra').serialize(),
			success: function (data) {
				agregarGrilla(data.lista);

				$('#id_div_modal_registra').modal("hide");
				mostrarMensaje(data.mensaje);
				limpiarFormulario();
				validator.resetForm();
			},
			error: function () {
				mostrarMensaje(MSG_ERROR);
			}
		});

	}
});
$("#id_btn_Actualizar").click(function () {
	var validator = $('#id_form_actualiza').data('bootstrapValidator');
	validator.validate();
	if (validator.isValid()) {
		$.ajax({
			type: "POST",
			url: "actualizarVehiculo",
			data: $('#id_form_actualiza').serialize(),
			success: function (data) {
				agregarGrilla(data.lista);
				$('#id_div_modal_actualiza').modal("hide");
				mostrarMensaje(data.mensaje);
			},
			error: function () {
				mostrarMensaje(MSG_ERROR);
			}
		});
	}
});

function eliminar(id) {
	mostrarMensajeConfirmacion(MSG_ELIMINAR, accionEliminar, null, id);
}
function accionEliminar(id) {
	$.ajax({
		type: "POST",
		url: "eliminarVehiculo",
		data: { "id": id },
		success: function (data) {
			agregarGrilla(data.lista);
			mostrarMensaje(data.mensaje);
		},
		error: function () {
			mostrarMensaje(MSG_ERROR);
		}
	});
}
function editar(vehi_id, codigo, veh_nro_placa, veh_nro_serie, veh_nro_vin, veh_nro_motor, veh_color, veh_marca, veh_modelo, vehi_placa_vigente, vehi_placa_anterior, vehi_estado, vehi_anotaciones, vehi_sede, pr_id) {
	$('#id_ID').val(vehi_id);
	$('#id_act_codigo').val(codigo);
	$('#id_act_placa').val(veh_nro_placa);
	$('#id_act_serie').val(veh_nro_serie);
	$('#id_act_nrovin').val(veh_nro_vin);
	$('#id_act_motor').val(veh_nro_motor);
	$('#id_act_color').val(veh_color);
	$('#id_act_marca').val(veh_marca);
	$('#id_act_modelo').val(veh_modelo);
	$('#id_act_placa_vigente').val(vehi_placa_vigente);
	$('#vehi_placa_anterior').val(vehi_placa_anterior);
	$('#id_act_estado').val(vehi_estado);
	$('#id_act_anotaciones').val(vehi_anotaciones);
	$('#id_act_sede').val(vehi_sede);
	$('#id_act_propietario').val(pr_id);
	$('#id_div_modal_actualiza').modal("show");
}

function limpiarFormulario() {
	$('#id_ID').val("");
	$('#id_act_codigo').val("");
	$('#id_act_nombre').val("");
	$('#id_act_apellidoP').val("");
	$('#id_act_pellidoM').val("");
	$('#id_act_dni').val("");
	$('#id_act_telefono').val("");
	$('#id_act_nro_licencia').val("");
	$('#id_act_clase_licencia').val("");
	$('#id_act_categoria_licencia').val("");
	$('#id_act_fecha_expedicion').val("");
	$('#id_act_fecharevalidacion').val("");
}