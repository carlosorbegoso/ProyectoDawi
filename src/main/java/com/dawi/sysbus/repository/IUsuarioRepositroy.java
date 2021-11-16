package com.dawi.sysbus.repository;

import com.dawi.sysbus.models.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepositroy extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
}
