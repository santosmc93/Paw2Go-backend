package com.paw2go.adminjwt.Services;

import com.paw2go.adminjwt.Model.Admin;


public interface UserService {
    //todos los metodos, funciones que
    Admin registrarUsuario(Admin idAdmin);
    Admin buscarUsuario(int id);
    Admin buscarUsuarioPorCorreo(String adminEmail);
    Iterable<Admin> mostrarTodos();
}
