package clase.test;

import hilos.clase.ProcesoA;
import hilos.clase.ProcesoB;
import hilos.clase.ProcesoC;

public class test {
    public static void main(String[] args) {
        ProcesoA a = new ProcesoA();
        ProcesoB b = new ProcesoB();
        ProcesoC c = new ProcesoC();
        b.saludar("Anthony");
        a.contar(5);
        c.dividir(10);
    }
}
