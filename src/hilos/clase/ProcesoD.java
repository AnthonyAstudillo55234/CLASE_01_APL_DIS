package hilos.clase;

public class ProcesoD implements Runnable{
    private int n;

    public ProcesoD(int n) {
        this.n=n;
    }

    public void interar(int n){
        for (int i=1; i<n; i++){
            System.out.println("B)");
        }
    }

    @Override
    public void run() {
        interar(n);
    }
}
