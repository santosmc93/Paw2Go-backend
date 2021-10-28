package com.paw2go.usersjwt.Servicio;

import com.paw2go.usersjwt.Modelo.User;


public interface UserService {
    //todos los metodos, funciones que
    User registrarUsuario(User id_users);
    User buscarUsuario(int id);
    User buscarUsuarioPorCorreo(String email);
    Iterable<User> mostrarTodos();
}
