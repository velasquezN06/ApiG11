package com.example.ApiG11.Servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ApiG11.Modelos.EquipoModelo;
import com.example.ApiG11.Repositorios.EquipoRepositorio;

@Service
public class EquipoServicio {
    @Autowired
    EquipoRepositorio repositorio;

    public EquipoModelo guardarEquipo(EquipoModelo equipo){
        return repositorio.save(equipo);
    }

    public ArrayList<EquipoModelo> consultarEquipos(){
        return (ArrayList<EquipoModelo>) repositorio.findAll();
    }

}
