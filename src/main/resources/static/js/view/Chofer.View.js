$('#id_form_registra').bootstrapValidator({
	message: 'This value is not valid',
	feedbackIcons: {
		valid: 'glyphicon glyphicon-ok',
		invalid: 'glyphicon glyphicon-remove',
		validating: 'glyphicon glyphicon-refresh'
	},
	fields: {
		"codigo": {
			selector: '#id_reg_codigo',
			validators: {
				notEmpty: {
					message: 'El codigo es un campo obligatorio'
				},
				stringLength: {
					message: 'El nombre es de 5 a 100 caracteres',
					min: 5,
					max: 100
				}
			}
		},
			"id_reg_nombre": {
				selector : '#id_reg_nombre',
				validators: {
					notEmpty: {
						message: 'El nombre del conductor es obligatorio'
					}
				
				}
			},
			"id_reg_dni": {
				selector : '#id_reg_dni',
				validators: {
					notEmpty: {
						message: 'El dni del conductor es obligatorio'
					}
				
				}
			},
			"id_reg_fecha_expedicion": {
				selector : '#id_reg_fecha_expedicion',
				validators: {
					notEmpty: {
						message: 'El la fecha de expedicion de licencia es obligatorio'
					}
				
				}
			},
			"id_reg_fecharevalidacion": {
				selector : '#id_reg_fecharevalidacion',
				validators: {
					notEmpty: {
						message: 'El la fecha de revalidacion de licencia es obligatorio'
					}
				
				}
			},
	

	}
});

$('#id_form_actualiza').bootstrapValidator({
	message: 'This value is not valid',
	feedbackIcons: {
		valid: 'glyphicon glyphicon-ok',
		invalid: 'glyphicon glyphicon-remove',
		validating: 'glyphicon glyphicon-refresh'
	},
	fields: {
		"nombre": {
			selector : '#id_act_nombre',
			validators: {
				notEmpty: {
					message: 'El nombre es un campo obligatorio'
				},
				stringLength :{
					message:'El nombre es de 5 a 100 caracteres',
					min : 5,
					max : 100
				}
			}
		},
	

	 }   
});
