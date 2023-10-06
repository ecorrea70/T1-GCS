import java.util.ArrayList;
/*
 * Comparar a Id recebida pelo array usuario para poder acessar o usuário
 * desejado
 */
public class identificaUser
{
    private ArrayList<Usuario> user;
    
    public boolean encontraUser(String i){
        for(Usuario u : user){
        if(u.getId().equalsIgnoreCase(i))
        return true;}
        return false;
    }
}
