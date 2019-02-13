

package boletin22_1;

import java.util.ArrayList;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin22_1 {

 
    public static void main(String[] args) {
       ArrayList<Correo> lista = new ArrayList<>();
        Buzon obx = new Buzon(lista);
        Correo a = new Correo("Juanf1team",true);
        Correo b = new Correo("clamasf1team",false);
      
        obx.engadir(a);
        obx.engadir(b);
        System.out.println(obx.numeroDeCorreos());
        System.out.println(obx.porLer());
        System.out.println(obx.amosar(1));
        System.out.println(obx.amosarPrimerNoLeido());
        obx.eliminar(1);
        System.out.println(obx.numeroDeCorreos());
    }
    }


