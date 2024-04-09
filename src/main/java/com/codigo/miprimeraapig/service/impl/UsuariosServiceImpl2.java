package com.codigo.miprimeraapig.service.impl;

import com.codigo.miprimeraapig.entity.UsuariosEntity;
import com.codigo.miprimeraapig.repository.UsuariosRespository;
import com.codigo.miprimeraapig.service.UsuariosService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuariosServiceImpl2 implements UsuariosService {
    //Service, va ser un Bean, podemos usar como un servicio externo
    // Y utilizarlo en tod0 el proyecto

    //@Autowired
    private final UsuariosRespository usuariosRespository;

    @Override
    public UsuariosEntity crearUsuario(UsuariosEntity usuariosEntity) {
        return null;
    }

    @Override
    public Optional<UsuariosEntity> buscarUsuario(Long id) {
        return Optional.empty();
    }

    @Override
    public List<UsuariosEntity> getAllUsuarios() {
        return usuariosRespository.findAll();
    }

    @Override
    public UsuariosEntity actualizarUsuario(Long id, UsuariosEntity usuariosEntity) {
        return null;
    }

    @Override
    public void borrarUsuario(Long id) {

    }

    @Override
    public List<UsuariosEntity> buscarPorNombre(String nombre) {
        return null;
    }
}
