package com.paw2go.usersjwt.Seguridad;

import com.paw2go.usersjwt.Modelo.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

//Para usar esta clase en postman se utiliza el correo como si fuera el nombre de usuario

public class MyUserDetails implements UserDetails {

    private String Username;
    private String password;

    //constructores
    //Aqui se elige que getter trabajar el username
    public MyUserDetails(User usuario){
        this.Username = usuario.getUserName();
        this.password = usuario.getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return Username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
