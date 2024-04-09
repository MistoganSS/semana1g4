package com.codigo.miprimeraapig.service;

import com.codigo.miprimeraapig.entity.UsuariosEntity;

import java.util.List;
import java.util.Optional;

public interface UsuariosService {
    UsuariosEntity crearUsuario(UsuariosEntity usuariosEntity);
    Optional<UsuariosEntity> buscarUsuario(Long id);
    List<UsuariosEntity> getAllUsuarios();

    UsuariosEntity actualizarUsuario(Long id, UsuariosEntity usuariosEntity);

    void borrarUsuario(Long id);
}
