package boletin22_1;

import java.util.ArrayList;

/**
 *
 * @author clamascabaleiro
 */
public class Buzon {
     private ArrayList<Correo> lista;

    public Buzon(ArrayList<Correo> lista) {
        this.lista = lista;
    }
    
    public int numeroDeCorreos(){
        return lista.size();
    }
    
    public void engadir(Correo c){
        lista.add(c);
    }
    
    public boolean porLer(){
        boolean comprobar = true;
        for(Correo c : lista){
            if(c.isLeido()==false){
                comprobar = false;
            }
        }
        return comprobar;
    }
    
    public String amosarPrimerNoLeido(){
        for(Correo c : lista){
            if(c.isLeido()==false){
                return c.getMensaje();
            }
        }
        return "No hay mensajes por leer";
    }
    
    public String amosar(int k){
        return lista.get(k).getMensaje();
    }
    
    public void eliminar(int k){
        lista.remove(k);
    }
}
