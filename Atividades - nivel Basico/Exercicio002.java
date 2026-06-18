import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exercicio002 extends JFrame {
    private JTextField textField;
    private JLabel label;

    public Exercicio002() {
        JLabel Namelabel = new JLabel("Digite seu nome: ");
        textField = new JTextField(15);
        JButton button = new JButton("Enviar");
        label = new JLabel(" ");

        button.addActionListener(e -> saudarUsuario());

        setLayout(new FlowLayout());
        add(label);
        add(textField);
        add(button);
        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

    }

    private void saudarUsuario() {
        String nome = textField.getText();
        label.setText("Ola " + nome + ", Bem vindo!");
    }

    public static void main(String[] args) {
         new Exercicio002().setVisible(true);

    }

}
