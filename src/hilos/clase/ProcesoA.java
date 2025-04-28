package hilos.clase;

public class ProcesoA extends Thread{

    private int n;
    public void contar(int n){
        for (int i=1; i<n; i++){
            System.out.println("Interacción N°: "+i);
        }
    }

    public ProcesoA(int n) {
        this.n=n;
    }

    @Override
    public void run() {
        try{
            sleep(1000);
            contar(n);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
