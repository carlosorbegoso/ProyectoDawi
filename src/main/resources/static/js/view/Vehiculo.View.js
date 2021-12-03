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

    }

});

$('#id_form_actualiza').bootstrapValidator({
    message: 'This value is not valid',
    feedbackIcons: {
        valid: 'glyphicon glyphicon-ok',
        invalid: 'glyphicon glyphicon-remove',
        validating: 'glyphicon glyphicon-refresh'
    },

});
	