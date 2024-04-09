package com.codigo.miprimeraapig.repository;

import com.codigo.miprimeraapig.entity.UsuariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository <- ya no es necesario, porque la interfaz UsuariosRepository ya extiende
// de JPArepository
public interface UsuariosRespository extends JpaRepository<UsuariosEntity,Long> {
}


