package com.codigo.miprimeraapig.service.impl;

import com.codigo.miprimeraapig.entity.UsuariosEntity;
import com.codigo.miprimeraapig.repository.UsuariosRespository;
import com.codigo.miprimeraapig.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosServiceImpl implements UsuariosService {
    //Service, va ser un Bean, podemos usar como un servicio externo
    // Y utilizarlo en tod0 el proyecto

    //@Autowired
    private final UsuariosRespository usuariosRespository;

    public UsuariosServiceImpl(UsuariosRespository usuariosRespository) {
        //inyeccion por contructor
        this.usuariosRespository = usuariosRespository;
    }

    @Override
    public UsuariosEntity crearUsuario(UsuariosEntity usuariosEntity) {
        return usuariosRespository.save(usuariosEntity);
    }

    @Override
    public Optional<UsuariosEntity> buscarUsuario(Long id) {
        return usuariosRespository.findById(id);
    }

    @Override
    public List<UsuariosEntity> getAllUsuarios() {
        //return usuariosRespository.findAll();
        return null;
    }

    @Override
    public UsuariosEntity actualizarUsuario(Long id, UsuariosEntity usuariosEntity) {
        Optional<UsuariosEntity> op = usuariosRespository.findById(id);

        UsuariosEntity updateUsuario = op.get();
        updateUsuario.setNombres(usuariosEntity.getNombres());
        updateUsuario.setApellidos(usuariosEntity.getApellidos());
        updateUsuario.setEstado(usuariosEntity.getEstado());

        return usuariosRespository.save(updateUsuario);
    }

    @Override
    public void borrarUsuario(Long id) {
        usuariosRespository.deleteById(id);
    }

    @Override
    public List<UsuariosEntity> buscarPorNombre(String nombre) {
        return usuariosRespository.findByNombresContainingIgnoreCase(nombre);
    }

}
