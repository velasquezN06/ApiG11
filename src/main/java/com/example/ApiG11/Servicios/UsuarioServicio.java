package com.example.ApiG11.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiG11.Modelos.UsuarioModelo;
import com.example.ApiG11.Repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicio {
    @Autowired
    UsuarioRepositorio repositorio;

    public UsuarioModelo GuardarUsuario(UsuarioModelo usuario){
         return repositorio.save(usuario);
    }
}
