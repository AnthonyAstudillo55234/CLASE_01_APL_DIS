package hilos.clase;

public class ProcesoA {
    public void contar(int n){
        for (int i=1; i<n; i++){
            System.out.println("Interacción N°: "+i);
        }
    }
}
