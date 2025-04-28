package hilos.clase;

public class ProcesoC extends Thread{

    private int n;
    public void dividir(int n){
        for (int i=10; i>-2; i--){
            System.out.println(n/i);
        }
    }

    public ProcesoC(int n) {
        this.n=n;
    }

    @Override
    public void run() {
        dividir(n);
    }
}
