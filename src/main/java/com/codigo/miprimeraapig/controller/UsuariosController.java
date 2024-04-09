package com.codigo.miprimeraapig.controller;

import com.codigo.miprimeraapig.entity.UsuariosEntity;
import com.codigo.miprimeraapig.service.UsuariosService;
import com.codigo.miprimeraapig.service.impl.UsuariosServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/g4")
public class UsuariosController {

    @Qualifier("usuariosServiceImpl")
    @Autowired
    private UsuariosService usuariosService;
    @Qualifier("usuariosServiceImpl2")
    @Autowired
    private UsuariosService usuariosService2;

    @PostMapping
    public ResponseEntity<UsuariosEntity> crear(@RequestBody UsuariosEntity entity) {
        //JUnit, ARQU Hexagonal, Spring Security
        UsuariosEntity usuariosEntity=usuariosService.crearUsuario(entity);
        return ResponseEntity.ok(usuariosEntity);
    }

    @GetMapping
    public ResponseEntity<List<UsuariosEntity>> allUsuarios(){
        List<UsuariosEntity> usuarios=usuariosService2.getAllUsuarios();
        return ResponseEntity.ok(usuarios);
    }
    @GetMapping("/{id}")
    public ResponseEntity<UsuariosEntity> buscar(@PathVariable Long id){
        //QueryParam : buscarxid/valor=2
        //PathVariable: buscarxid/{id}
        Optional<UsuariosEntity> op=usuariosService.buscarUsuario(id);
        return op.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }
    @PutMapping("/{id}")
    public ResponseEntity<UsuariosEntity> actualizar(@PathVariable Long id, @RequestBody UsuariosEntity entity){
        UsuariosEntity usuariosEntity=usuariosService.actualizarUsuario(id,entity);
        return ResponseEntity.ok(usuariosEntity);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrar(@PathVariable Long id){
        usuariosService.borrarUsuario(id);
        return ResponseEntity.noContent().build();
    }


}
