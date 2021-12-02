	$('#id_form_registra').bootstrapValidator({
		message: 'This value is not valid',
		feedbackIcons: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		// fields: {
		// 	"nombre": {
		// 		selector : '#id_reg_nombre',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'El nombre es un campo obligatorio'
		// 			},
		// 			stringLength :{
		// 				message:'El nombre es de 5 a 100 caracteres',
		// 				min : 5,
		// 				max : 100
		// 			}
		// 		}
		// 	},
		// 	"tr_codigo": {
		// 		selector : '#id_reg_tr_codigo',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'El número de hombres es un campo obligatorio'
		// 			},
		// 			lessThan: {
		// 				value: 15,
		// 				inclusive: true,
		// 				message: 'La edad es menor a 15'
		// 			},
		// 			greaterThan: {
		// 				value: 0,
		// 				inclusive: true,
		// 				message: 'La edad es mayor a 0'
		// 			}
		// 		}
		// 	},
		// 	"nombre": {
		// 		selector : '#id_reg_nombre',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'El número de mujeres es un campo obligatorio'
		// 			},
		// 			lessThan: {
		// 				value: 15,
		// 				inclusive: true,
		// 				message: 'La edad es menor a 15'
		// 			},
		// 			greaterThan: {
		// 				value: 0,
		// 				inclusive: true,
		// 				message: 'La edad es mayor a 0'
		// 			}
		// 		}
		// 	},
		// 	"tr_apellidoP": {
		// 		selector : '#id_reg_maxima',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'La edad máxima es un campo obligatorio'
		// 			},
		// 			lessThan: {
		// 				value: 35,
		// 				inclusive: true,
		// 				message: 'La edad es menor a 35'
		// 			},
		// 			greaterThan: {
		// 				value: 18,
		// 				inclusive: true,
		// 				message: 'La edad es mayor a 18'
		// 			}
		// 		}
		// 	},
		// 	"tr_apellidoM": {
		// 		selector : '#id_reg_minima',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'La edad mínima es un campo obligatorio'
		// 			},
		// 			lessThan: {
		// 				value: 35,
		// 				inclusive: true,
		// 				message: 'La edad es menor a 35'
		// 			},
		// 			greaterThan: {
		// 				value: 18,
		// 				inclusive: true,
		// 				message: 'La edad es mayor a 18'
		// 			}
		// 		}
		// 	},
		// 	"sede": {
		// 		selector : '#id_reg_sede',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'La sede es un campo obligatorio'
		// 			},
		// 			stringLength :{
		// 				message:'La sede es de 2 a 20 caracteres',
		// 				min : 2,
		// 				max : 20
		// 			}
		// 		}
		// 	},
		// 	"deporte.id_deporte": {
		// 		selector : '#id_reg_deporte',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'El deporte un campo obligatorio'
		// 			},
		// 		}
		// 	},
			
		// }   
	});

	$('#id_form_actualiza').bootstrapValidator({
		message: 'This value is not valid',
		feedbackIcons: {
			valid: 'glyphicon glyphicon-ok',
			invalid: 'glyphicon glyphicon-remove',
			validating: 'glyphicon glyphicon-refresh'
		},
		// fields: {
		// 	"nombre": {
		// 		selector : '#id_act_nombre',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'El nombre es un campo obligatorio'
		// 			},
		// 			stringLength :{
		// 				message:'El nombre es de 5 a 100 caracteres',
		// 				min : 5,
		// 				max : 100
		// 			}
		// 		}
		// 	},
		// 	"tr_codigo": {
		// 		selector : '#id_act_tr_codigo',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'El número de hombres es un campo obligatorio'
		// 			},
		// 			lessThan: {
		// 				value: 15,
		// 				inclusive: true,
		// 				message: 'La edad es menor a 15'
		// 			},
		// 			greaterThan: {
		// 				value: 0,
		// 				inclusive: true,
		// 				message: 'La edad es mayor a 0'
		// 			}
		// 		}
		// 	},
		// 	"nombre": {
		// 		selector : '#id_act_nombre',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'El número de mujeres es un campo obligatorio'
		// 			},
		// 			lessThan: {
		// 				value: 15,
		// 				inclusive: true,
		// 				message: 'La edad es menor a 15'
		// 			},
		// 			greaterThan: {
		// 				value: 0,
		// 				inclusive: true,
		// 				message: 'La edad es mayor a 0'
		// 			}
		// 		}
		// 	},
		// 	"tr_apellidoP": {
		// 		selector : '#id_act_maxima',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'La edad máxima es un campo obligatorio'
		// 			},
		// 			lessThan: {
		// 				value: 35,
		// 				inclusive: true,
		// 				message: 'La edad es menor a 35'
		// 			},
		// 			greaterThan: {
		// 				value: 18,
		// 				inclusive: true,
		// 				message: 'La edad es mayor a 18'
		// 			}
		// 		}
		// 	},
		// 	"tr_apellidoM": {
		// 		selector : '#id_act_minima',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'La edad mínima es un campo obligatorio'
		// 			},
		// 			lessThan: {
		// 				value: 35,
		// 				inclusive: true,
		// 				message: 'La edad es menor a 35'
		// 			},
		// 			greaterThan: {
		// 				value: 18,
		// 				inclusive: true,
		// 				message: 'La edad es mayor a 18'
		// 			}
		// 		}
		// 	},
		// 	"sede": {
		// 		selector : '#id_act_sede',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'La sede es un campo obligatorio'
		// 			},
		// 			stringLength :{
		// 				message: 'La sede es de 2 a 20 caracteres',
		// 				min : 2,
		// 				max : 20
		// 			}
		// 		}
		// 	},
		// 	"deporte.id_deporte": {
		// 		selector : '#id_act_deporte',
		// 		validators: {
		// 			notEmpty: {
		// 				message: 'El deporte un campo obligatorio'
		// 			},
		// 		}
		// 	},
		  
		// }   
	});
	