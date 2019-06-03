

package boletin32;

import java.util.ArrayList;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin32 {

 
    public static void main(String[] args) {
         ArrayList<Alumno>alumnos=new ArrayList<>();
        Alumno obx=new Alumno();
        obx.setNota(4);
        obx.setNombre("Juan");
        Alumno.Enderezo direccion=obx.new Enderezo("lugar",4);
        obx.setEnderezo(direccion);
        System.out.println(obx.toString());
        alumnos.add(obx);
        obx.cambiarNota("Juan", alumnos);
        System.out.println(obx.toString());
    }
    }

