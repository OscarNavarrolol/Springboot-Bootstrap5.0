package com.app.web.services.impl;

import com.app.web.entities.Trabajador;
import com.app.web.repository.TrabajadorRepository;
import com.app.web.services.TrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabajoServiceImpl implements TrabajadorService {
    @Autowired
    private TrabajadorRepository trabajadorRepository;
    @Override
    public List<Trabajador> getTrabajadores() {
        return trabajadorRepository.findAll();
    }

    @Override
    public Trabajador guardarTrabajador(Trabajador trabajador) {
        return trabajadorRepository.save(trabajador) ;
    }

    @Override
    public Trabajador trabajadorPorId(Integer id) {
        return trabajadorRepository.findById(id).orElse(null);
    }

    @Override
    public Trabajador actualizarTrabajador(Trabajador trabajador) {
        return trabajadorRepository.save(trabajador);
    }

    @Override
    public void eliminarTrabajador(Integer id) {
        trabajadorRepository.deleteById(id);
    }
}
