package hilos.clase;

public class ProcesoD extends Thread{
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
