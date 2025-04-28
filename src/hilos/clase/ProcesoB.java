package hilos.clase;

public class ProcesoB extends Thread{
    private String name;

    public void saludar (String nombre){
        System.out.println("Hola "+nombre);
    }

    public ProcesoB(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        saludar(name);
    }
}
