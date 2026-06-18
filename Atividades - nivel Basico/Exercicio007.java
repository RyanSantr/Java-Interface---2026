import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exercicio007 extends JFrame {
            private final JTextField textField;
            private final JLabel label;

    Exercicio007() {

        textField = new JTextField(10);
        JButton botao = new JButton("Converter");
        label = new JLabel(" ");

        botao.addActionListener(e -> Conversao());

        setLayout(new FlowLayout());
        add(new JLabel("Celsius: "));
        add(textField);
        add(botao);
        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);


    }

    private void Conversao(){
                double temp = Double.parseDouble(textField.getText());
                double fahrenheit = temp * 1.8 + 32;

                label.setText("temperatura em Fireheart: " + fahrenheit);
    }

    public static void main(String[] args) {
                new Exercicio007().setVisible(true);
    }

}




/*Exercício 7 — Conversor de temperatura
Crie uma tela para converter Celsius para Fahrenheit.

A tela deve ter:

campo para digitar a temperatura em Celsius;
botão "Converter";
label para mostrar o resultado.
Use a fórmula:

F = C * 1.8 + 32
Exemplo:

Temperatura em Fahrenheit: 77.0
*/