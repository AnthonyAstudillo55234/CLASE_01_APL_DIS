package hilos.clase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista_Vehiculos extends JFrame {
    private JPanel panel2;
    private JButton guardarButton;
    private JPanel marcaPanel;
    private JPanel modeloPanel;
    private JPanel precioPanel;
    private JTextField marcaTextField;
    private JTextField modeloTextField;
    private JTextField precioTextField;

    public Vista_Vehiculos() {
        setTitle("Registro de Vehículos");
        setContentPane(panel2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 200));
        setLayout(new FlowLayout());

        marcaPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        modeloPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        precioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel marcaLabel = new JLabel("Marca:");
        marcaTextField = new JTextField(20);

        JLabel modeloLabel = new JLabel("Modelo:");
        modeloTextField = new JTextField(20);

        JLabel precioLabel = new JLabel("Precio:");
        precioTextField = new JTextField(20);

        guardarButton = new JButton("Guardar");

        marcaPanel.add(marcaLabel);
        marcaPanel.add(marcaTextField);

        modeloPanel.add(modeloLabel);
        modeloPanel.add(modeloTextField);

        precioPanel.add(precioLabel);
        precioPanel.add(precioTextField);

        panel2.add(marcaPanel);
        panel2.add(modeloPanel);
        panel2.add(precioPanel);
        panel2.add(guardarButton);

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marca = marcaTextField.getText();
                String modelo = modeloTextField.getText();
                String precioTexto = precioTextField.getText();

                JFrame infoFrame = new JFrame("Información del Vehículo");
                infoFrame.setLayout(new FlowLayout(FlowLayout.LEFT));

                JTextArea infoTextArea = new JTextArea();
                infoTextArea.setEditable(false);
                infoTextArea.append("Marca: " + marca + "\n");
                infoTextArea.append("Modelo: " + modelo + "\n");
                infoTextArea.append("Precio: " + precioTexto);

                infoFrame.add(infoTextArea);

                infoFrame.setSize(400, 100);

                infoFrame.setLocationRelativeTo(Vista_Vehiculos.this);
                infoFrame.setVisible(true);

                marcaTextField.setText("");
                modeloTextField.setText("");
                precioTextField.setText("");
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Vista_Vehiculos::new);
    }
}