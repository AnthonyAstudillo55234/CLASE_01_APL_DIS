package clase.test;

import hilos.clase.*;

public class test {
    public static void main(String[] args) {
        Vehiculos vh = new Vehiculos();
        vh.getMarca();
        vh.getModelo();
        vh.getPrecio();

        System.out.println("Marca: "+vh.getMarca());
        System.out.println("Modelo: "+vh.getModelo());
        System.out.println("Precio: "+vh.getPrecio());

        /*Persona p = new Persona();
        p.setNombre("Anthony");
        p.setFechaNaciemiento("05 de noviembre de 2004");
        p.setDireccion("Mitad del mundo");

        System.out.println("Nombre: "+p.getNombre());
        System.out.println("Fecha Nacimiento: "+p.getFechaNaciemiento());
        System.out.println("Dirección: "+p.getDireccion());
        ProcesoA a = new ProcesoA(10);
        ProcesoB b = new ProcesoB("Anthony");
        ProcesoC c = new ProcesoC(10);
        Runnable x = new ProcesoD(100);
        Runnable y = new ProcesoE();
        Thread d = new Thread(x);
        Thread e = new Thread(y);
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();*/
    }
}
