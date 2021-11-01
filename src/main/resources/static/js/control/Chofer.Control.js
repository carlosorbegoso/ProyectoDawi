$("#id_btn_filtrar").click(function(){
	var fil=$("#id_txt_filtro").val();
	$.getJSON("consultarChofer",{"filtro":fil}, function (lista){
		agregarGrilla(lista);
	});
});
function agregarGrilla(lista){
	 $('#id_table').DataTable().clear();
	 $('#id_table').DataTable().destroy();
	 $('#id_table').DataTable({
			data: lista,
			searching: false,
			ordering: true,
			processing: true,
			pageLength: 5,
			lengthChange: false,
			columns:[
				{data: "tr_id"},
				{data: "tr_codigo"},
				{data: "nombre"},
				{data: "tr_apellidoP",},
				{data: "tr_apellidoM"},
				{data: "tr_dni"},
				{data: "tr_telefono"},
				{data: "tr_lic_numero"},
				{data: function(row, type, val, meta){
					var salida='<button type="button" style="width: 90px" class="btn btn-info btn-sm" onclick="editar(\''+row.tr_id + '\',\'' + row.tr_codigo +'\',\'' + row.nombre  +'\',\'' + row.tr_apellidoP + '\',\'' + row.tr_apellidoM + '\',\'' +  row.tr_dni + '\',\'' +  row.tr_telefono + '\',\'' + row.tr_lic_numero +  '\',\'' + row.tr_lic_clase + '\',\'' + row.tr_lic_categoria +'\',\'' + row.tr_lic_fecha_expedicion +'\',\'' + row.tr_lic_fecha_revalidacion +'\')">Editar</button>';
					return salida;
				},className:'text-center'},	
				{data: function(row, type, val, meta){
					var salida='<button type="button" style="width: 90px" class="btn btn-warning btn-sm" onclick="eliminar(\''  + row.tr_id + '\')">Eliminar</button>';
					return salida;
				},className:'text-center'},													
			]                                     
		});
}
function eliminar(id){	
	mostrarMensajeConfirmacion(MSG_ELIMINAR, accionEliminar,null,id);
}
function accionEliminar(id){	
	$.ajax({
		type: "POST",
		url: "eliminarChofer", 
		data: {"id":id},
		success: function(data){
			agregarGrilla(data.lista);
			mostrarMensaje(data.mensaje);
		},
		error: function(){
			mostrarMensaje(MSG_ERROR);
		}
	 });
}
function editar(tr_id,tr_codigo,nombre,tr_apellidoP,tr_apellidoM,tr_dni, tr_telefono,tr_lic_numero, tr_lic_clase,tr_lic_categoria,tr_lic_fecha_expedicion,tr_lic_fecha_revalidacion){	
	$('#id_ID').val(tr_id);
	$('#id_act_codigo').val(tr_codigo);
	$('#id_act_nombre').val(nombre);
	$('#id_act_apellidoP').val(tr_apellidoP);
	$('#id_act_pellidoM').val(tr_apellidoM);
	$('#id_act_dni').val(tr_dni);
	$('#id_act_telefono').val(tr_telefono);
	$('#id_act_nro_licencia').val(tr_lic_numero);
	$('#id_act_clase_licencia').val(tr_lic_clase);
	$('#id_act_categoria_licencia').val(tr_lic_categoria);
	$('#id_act_fecha_expedicion').val(tr_lic_fecha_expedicion);
	$('#id_act_fecharevalidacion').val(tr_lic_fecha_revalidacion);

	$('#id_div_modal_actualiza').modal("show");
}
function limpiarFormulario(){	
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
$("#id_btn_registra").click(function(){
	var validator = $('#id_form_registra').data('bootstrapValidator');
	validator.validate();
	
	if (validator.isValid()) {
		$.ajax({
		  type: "POST",
		  url: "registrarChofer", 
		  data: $('#id_form_registra').serialize(),
		  success: function(data){
			  agregarGrilla(data.lista);
			 
			  $('#id_div_modal_registra').modal("hide");
			  mostrarMensaje(data.mensaje);
			  limpiarFormulario();
			  validator.resetForm();
		  },
		  error: function(){
			  mostrarMensaje(MSG_ERROR);
		  }
		});
		
	}
});

$("#id_btn_Actualizar").click(function(){
	var validator = $('#id_form_actualiza').data('bootstrapValidator');
	validator.validate();
	if (validator.isValid()) {
		$.ajax({
		  type: "POST",
		  url: "actualizarChofer", 
		  data: $('#id_form_actualiza').serialize(),
		  success: function(data){
			  agregarGrilla(data.lista);
			  $('#id_div_modal_actualiza').modal("hide");
			  mostrarMensaje(data.mensaje);
		  },
		  error: function(){
			  mostrarMensaje(MSG_ERROR);
		  }
		});
	}
});
