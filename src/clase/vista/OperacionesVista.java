package clase.vista;

import clase.implement.OperacionesImpl;
import clase.interfaz.Operaciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperacionesVista extends JFrame{

    private JPanel panel1;
    private JTextField numero1;
    private JTextField numero2;
    private JButton RESTAButton;
    private JButton SUMAButton;
    private JButton DIVISIONButton;
    private JButton MULTIPLICACIONButton;
    private JLabel RESULTADO;

    public OperacionesVista() {
        Operaciones op = new OperacionesImpl();
        setTitle("Operaciones");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 500));
        pack();
        setVisible(true);
        SUMAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double primer = Double.parseDouble(numero1.getText());
                double segundo = Double.parseDouble(numero2.getText());
                RESULTADO.setText("El resultado es: "+op.sumar(primer,segundo));
            }
        });
        RESTAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double primer = Double.parseDouble(numero1.getText());
                double segundo = Double.parseDouble(numero2.getText());
                RESULTADO.setText("El resultado es: "+op.restar(primer,segundo));
            }
        });
        DIVISIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double primer = Double.parseDouble(numero1.getText());
                double segundo = Double.parseDouble(numero2.getText());
                RESULTADO.setText("El resultado es: "+op.dividir(primer,segundo));
            }
        });
        MULTIPLICACIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double primer = Double.parseDouble(numero1.getText());
                double segundo = Double.parseDouble(numero2.getText());
                RESULTADO.setText("El resultado es: "+op.multiplicar(primer,segundo));
            }
        });
    }
}
