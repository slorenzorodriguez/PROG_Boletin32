

package boletin32;

import java.util.ArrayList;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin32 {

 
    public static void main(String[] args) {
         ArrayList<Alumno>alumnos=new ArrayList<>();
        Alumno obx=new Alumno();
        obx.setNota(4);
        obx.setNombre("javier");
        Alumno.Enderezo direccion=obx.new Enderezo("enderezo",4);
        obx.setEnderezo(direccion);
        System.out.println(obx.toString());
        alumnos.add(obx);
        obx.cambiarNota("javier", alumnos);
        System.out.println(obx.toString());
    }
    }

