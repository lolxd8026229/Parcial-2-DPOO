import javax.swing.*;
import java.awt.event.*;

public class ParcialGUI extends JFrame {
    private JTextField baseField;
    private JTextField exponenteField;
    private JButton calcularButton;
    private JLabel resultadoLabel;

    public ParcialGUI() {
        setTitle("Calculadora de Potencia");
        setSize(300, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel baseLabel = new JLabel("Base (b):");
        baseLabel.setBounds(20, 20, 80, 25);
        add(baseLabel);

        baseField = new JTextField();
        baseField.setBounds(100, 20, 150, 25);
        add(baseField);

        JLabel expLabel = new JLabel("Exponente (e):");
        expLabel.setBounds(20, 60, 100, 25);
        add(expLabel);

        exponenteField = new JTextField();
        exponenteField.setBounds(120, 60, 130, 25);
        add(exponenteField);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(80, 100, 120, 30);
        add(calcularButton);

        resultadoLabel = new JLabel("Resultado:");
        resultadoLabel.setBounds(20, 150, 250, 25);
        add(resultadoLabel);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int b = Integer.parseInt(baseField.getText());
                    int exp = Integer.parseInt(exponenteField.getText());
                    Parcial parcial = new Parcial();
                    int res = parcial.potencia(b, exp);
                    resultadoLabel.setText("Resultado: " + res);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Error: ingrese números válidos.");
                } catch (IllegalArgumentException | ArithmeticException ex) {
                    resultadoLabel.setText("Error: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ParcialGUI gui = new ParcialGUI();
            gui.setVisible(true);
        });
    }
}
