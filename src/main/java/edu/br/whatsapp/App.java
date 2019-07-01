package edu.br.whatsapp;

import edu.br.whatsapp.modelo.Mensagem;
import edu.br.whatsapp.modelo.Usuario;
public class App 
{
    public static void main( String[] args )
    {
        Usuario usuario1  = new Usuario ();
        usuario1.setNome("Felipe");
        usuario1.setNumero("+558299125545");
        
        
 
        Usuario usuario2  = new Usuario ();
        
        Mensagem msg = new Mensagem ("Oi",usuario1,usuario2);
        System.out.println(msg.getTexto());
        System.out.println(msg.getHorario());
        	
    }
}
