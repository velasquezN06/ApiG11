package com.example.ApiG11.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ApiG11.Modelos.UsuarioModelo;
import com.example.ApiG11.Servicios.UsuarioServicio;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
    
    @Autowired
    UsuarioServicio servicio;

    @PostMapping("/guardar")
    public UsuarioModelo guardar(@RequestBody UsuarioModelo usuario){
        return servicio.GuardarUsuario(usuario);
    }

    @GetMapping("/consultar")
    public ArrayList<UsuarioModelo> consultarUsuario(){
        return servicio.consultarUsuarios();
    }

    @GetMapping("/consultaDocumento/{documento}")
    public Optional<UsuarioModelo>consultaDocumento(@PathVariable("documento") Long documento){
        return servicio.consultaDocumento(documento);
    }
}
