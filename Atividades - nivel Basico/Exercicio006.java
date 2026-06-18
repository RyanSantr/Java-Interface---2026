import java.awt.FlowLayout;
import javax.swing.*;


public class Exercicio006 extends JFrame {
    private final JLabel label;
    private final JTextField textField;

    Exercicio006() {

        textField = new JTextField(10);
        JButton botao = new JButton("Verificar");
        label = new JLabel(" ");

        botao.addActionListener(e -> VerificarNumber());

        setLayout(new FlowLayout());
        add(new JLabel("Digite o numero"));
        add(label);
        add(botao);
        add(textField);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);

    }

        public void VerificarNumber(){
            int a = Integer.parseInt(textField.getText());

            if (a > 0){
            textField.setText("Positivo");
            } else if(a < 0){
            textField.setText("Negativo");
             } else{
                textField.setText("zero");

            }
    }
    public static void main(String[] args) {
        new Exercicio006().setVisible(true);
    }
}


