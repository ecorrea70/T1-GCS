package Cadastro;

import java.util.ArrayList;
/*
 * Comparar a ID recebida pelo array usuario para poder acessar o usuário
 * desejado.
 */
public class identificaUser
{
    private ArrayList<Usuario> user;

    public Usuario encontraUser(String i){
        for(Usuario u : user){
            if(u.getId().equalsIgnoreCase(i))
                return u;
        }
        return null;
    }
}