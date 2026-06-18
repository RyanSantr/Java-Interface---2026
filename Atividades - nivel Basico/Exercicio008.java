import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio008 extends JFrame {
        private final JTextField textField;
        private final JTextField textField_2;
        private final JLabel label;


        Exercicio008() {

            textField = new JTextField();
                textField_2 = new JTextField();
            JButton button = new JButton("Calcular");
            label = new JLabel(" ");

            button.addActionListener(e -> CalcularSalario());

            JPanel panel = new JPanel(new GridLayout(4, 2, 6,6));
            panel.add(new JLabel("Digite a quantidade de horas"));
            panel.add(textField);
            panel.add(new JLabel("Digite o valor da hora do seu salario"));
            panel.add(textField_2);
            panel.add(button);
            panel.add(label);

            add(panel);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(420, 180);
            setLocationRelativeTo(null);

        }

        private void CalcularSalario(){
            double salario = Double.parseDouble(textField.getText());
            double salario2 = Double.parseDouble(textField_2.getText());
            double salarioFinal = salario *  salario2;

            label.setText("seu salario é: " + salarioFinal);
        }



    public static void main(String[] args) {
        new Exercicio008().setVisible(true);
    }


}
