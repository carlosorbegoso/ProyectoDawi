// package com.dawi.sysbus.service;

// import java.util.ArrayList;

// import com.dawi.sysbus.models.Rol;
// import com.dawi.sysbus.models.Usuario;
// import com.dawi.sysbus.repository.IUsuarioRepositroy;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional;

// @Service("userDetailsService")
// public class UsuarioService implements UserDetailsService{

//     @Autowired
//     private IUsuarioRepositroy usuarioService;
    
//     @Override
//     @Transactional(readOnly=true)
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         Usuario usuario = usuarioService.findByUsername(username);
        
//         if(usuario == null){
//             throw new UsernameNotFoundException(username);
//         }
        
//         var roles = new ArrayList<GrantedAuthority>();
        
//         for(Rol rol: usuario.getRoles()){
//             roles.add(new SimpleGrantedAuthority(rol.getNombre()));
//         }
        
//         return new User(usuario.getUsername(), usuario.getPassword(), roles);
//     }
    
// }
