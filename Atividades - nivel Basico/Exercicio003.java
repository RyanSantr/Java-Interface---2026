import java.awt.*;
import javax.swing.*;

public class Exercicio003 extends JFrame {
        private JTextField campo1, campo2;
        private JLabel resultado;

      public Exercicio003(){

          campo1 = new JTextField(12);
          campo2 = new JTextField(12);
          JButton botao = new JButton("Calcular");
          resultado = new JLabel("Resultado: ");
          botao.addActionListener(e -> Calculo());

          JPanel painel = new JPanel(new GridLayout(4, 2, 6, 6));
          painel.add(new JLabel("Primeiro numero:"));
          painel.add(campo1);
          painel.add(new JLabel("Segundo numero:"));
          painel.add(campo2);
          painel.add(botao);
          painel.add(resultado);

          add(painel);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setSize(360,180);
          setLocale(null);

        }
     private void Calculo(){
            int a = Integer.parseInt(campo1.getText());
            int b = Integer.parseInt(campo2.getText());
            int soma = a + b;

            resultado.setText("Resultado: " + soma);
        }

        public static void main(String[] args) {
          new Exercicio003().setVisible(true);
        }
}
