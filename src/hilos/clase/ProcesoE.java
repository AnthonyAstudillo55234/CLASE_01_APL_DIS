package hilos.clase;

import javax.swing.*;

public class ProcesoE implements Runnable{

    public ProcesoE() {

    }

    public void letrero(){
        JOptionPane.showMessageDialog(null, "Hola como estas!!!");
    }

    @Override
    public void run() {
        letrero();
    }
}
