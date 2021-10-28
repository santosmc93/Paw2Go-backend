package com.paw2go.adminjwt.Services;


import com.paw2go.adminjwt.Model.Admin;
import com.paw2go.adminjwt.Repository.AdminRepository;
import com.paw2go.adminjwt.Security.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    AdminRepository tablaUsuario;

    @Override
    public UserDetails loadUserByUsername(String Username) throws UsernameNotFoundException {
        Admin admin= tablaUsuario.findByAdminUsername(Username);

        return new MyUserDetails(admin);

    }
}



























//package io.HappySwimwear.Servicio;
//
//import io.HappySwimwear.Modelo.User;
//import io.HappySwimwear.Repositorio.UserRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//
//@Service @RequiredArgsConstructor @Slf4j
//public class UserServiceImpl implements UserService{
//    private final UserRepository tablaUsuario;
//
//
//    @Override
//    public User registrarUsuario(User usuario) {
//        log.info("Registrando al usuario {} {} a la base de datos", usuario.getId_usuario(), usuario.getNombre());
//        return tablaUsuario.save(usuario);
//    }
//
//    @Override
//    public User buscarUsuario(int id) {
//        log.info("Buscando al usuario con el id: {}", id);
//        return tablaUsuario.findById(id);
//    }
//
//    @Override
//    public User buscarUsuarioPorCorreo(String correo) {
//        log.info("Buscando al usuario con el correo: {}", correo);
//        return tablaUsuario.findByCorreo(correo);
//    }
//
//    @Override
//    public Iterable<User> mostrarTodos() {
//        log.info("Buscando a todos los usuarios");
//        return tablaUsuario.findAll();
//    }
//}
