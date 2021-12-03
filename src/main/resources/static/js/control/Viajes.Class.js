'use strict';
class Viajes { 
	constructor(args = []){
		this.api_url						= args.api_url || '';
	}

	Nuevo(params = []){
		try{
			this.set(params);
			this.setVehiculo(params);
		}catch(e){
			console.log(e);
		}
	}
	set(params){
		// this.vj_id              = params.vj_id || 1;
		this.vj_fecha           = params.vj_fecha || "";
		this.vj_hora_inicial    = params.vj_hora_inicial || "";
		// this.vj_hora_final      = params.vj_hora_final || "8:15";
		// this.vj_hora_total      = params.vj_hora_total || "8:25";
		// this.vj_hora_frecuencia = params.vj_hora_frecuencia || "8:35";;
		this.vj_ruta     		= params.vj_ruta || "";
		this.vj_lado     		= params.vj_lado || "";
		// this.vj_nro_viaje		= params.vj_nro_viaje || "";
		this.conductor_nombre	= params.conductor_nombre || '';
		this.vehiculo 			= params.vehiculo || 1;
		

	}
	setVehiculo(args){
		this.vehiculo.vehi_id			= args.vehi_id	|| 1;
		this.vehiculo.codigo			= args.codigo	|| "";
		this.vehiculo.veh_nro_placa		= args.veh_nro_placa	|| "";
		this.vehiculo.veh_nro_serie		= args.veh_nro_serie	|| "";
	}
	getVehiculo(){
		return this.vehiculo;
	}

	get(){
		var atributos = {};
		Object.entries(this).forEach((p) => {
			atributos[p[0]] = p[1];
		});
		return atributos;//JSON.parse(JSON.stringify(atributos));
	}
	
		setBaseApiUrl(api_url){
		this.api_url	= api_url;
	}

	getBaseApiUrl(){
		return this.api_url;
	}

	Guardar(params){
		return $.ajax({
			//dataType: 'text',
			type: "POST",
			cache: false,
			url: this.getBaseApiUrl() + "registrarViaje",
			data: params
		});
	}

	// Actualizar(params){
	// 	return $.ajax({
	// 		//dataType: 'text',
	// 		type: "POST",
	// 		cache: false,
	// 		url: this.getBaseApiUrl() + "../crudVehiculo?opcion=actualizar",
	// 		data: params
	// 	});
	// }

	Cargar(params){
		return $.ajax({
			//dataType: 'text',
			type: "POST",
			cache: false,
			url: this.getBaseApiUrl() + "../Principal?opcion=cargar",
			data: params
		});
	}
	

	/** */
	Buscar(params){
		
		return $.ajax({
			//dataType: 'text',
			type: "POST",
			cache: false,
			url :this.getBaseApiUrl() + "listaViajes",
			// url :"../crudVehiculo?opcion=buscar",

			data: params
			
		});
	}
	ListarVehiculo(params){
		
		return $.ajax({
			//dataType: 'text',
			type: "POST",
			cache: false,
			url :this.getBaseApiUrl() + "listaVehiculos",
			// url :"../crudVehiculo?opcion=buscar",

			data: params
			
		});
	}



	Eliminar(params){
		return $.ajax({
			//dataType: 'text',
			type: "POST",
			cache: false,
			url :this.getBaseApiUrl() + "../Principal?opcion=eliminar",
			// url :"../crudVehiculo?opcion=buscar",

			data: params
			
		});
	}


	
  }
 