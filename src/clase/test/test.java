package clase.test;

import hilos.clase.ProcesoA;
import hilos.clase.ProcesoB;
import hilos.clase.ProcesoC;
import hilos.clase.ProcesoD;

public class test {
    public static void main(String[] args) {
        ProcesoA a = new ProcesoA(10);
        ProcesoB b = new ProcesoB("Anthony");
        ProcesoC c = new ProcesoC(10);
        ProcesoD d = new ProcesoD(100);
        a.start();
        b.start();
        c.start();
        d.start();
    }
}
