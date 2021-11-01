package com.dawi.sysbus.service;
import java.util.List;
import java.util.Optional;

import com.dawi.sysbus.models.Chofer;

public interface IChoferService {
    public abstract List<Chofer>listaChofer();	
	public abstract Chofer insertarActualizaChofer(Chofer obj);
	public abstract Optional<Chofer> obtinePorId(int tr_id);
	public abstract void eliminarChofer(int id);
	public abstract List<Chofer>listaChoferPorNombrelike(String string);
}

