package com.app.web.services;

import com.app.web.entities.Trabajador;

import java.util.List;

public interface TrabajadorService {
    public List<Trabajador> getTrabajadores();

    public Trabajador guardarTrabajador(Trabajador trabajador);

    public Trabajador trabajadorPorId(Integer id);

    public Trabajador actualizarTrabajador(Trabajador trabajador);

    public void eliminarTrabajador(Integer id);
}
