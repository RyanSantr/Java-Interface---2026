import javax.swing.*;
import java.awt.*;


public class Exercicio0011 extends JFrame {
    private JTextField NumberB = new JTextField(15);
    private JTextField numberA = new JTextField(15);
    private JLabel caixa;

    Exercicio0011() {

        NumberB = new JTextField(15);
        numberA  = new JTextField(15);
        caixa = new JLabel("Resultado: ", SwingConstants.CENTER);

        JButton Multi = new JButton("x");
        JButton sub = new JButton("-");
        JButton somar = new JButton("+");
        JButton Div = new JButton("/");


        somar.addActionListener(e -> Calcular("+"));
        sub.addActionListener(e -> Calcular("-"));
        Multi.addActionListener(e -> Calcular("x"));
        Div.addActionListener(e -> Calcular("/"));

        JPanel painel = new JPanel(new GridLayout(4,1 ,8,8));

        painel.add(new JLabel("Numero A: "));
        painel.add(this.numberA);

        painel.add(new JLabel("Numero B: "));
        painel.add(this.NumberB);


        JPanel painel2 = new JPanel(new GridLayout(2, 2, 8, 8));

        painel2.add(somar);
        painel2.add(sub);
        painel2.add(Multi);
        painel2.add(Div);

        setLayout(new BorderLayout(10, 10));

        add(painel, BorderLayout.NORTH);
        add(painel2, BorderLayout.CENTER);
        add(caixa, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450,350);
        setLocationRelativeTo((Component)null);
        

    }

    private void Calcular(String operacao){
       try {
           double numeroA = Double.parseDouble(numberA.getText());
           double numeroB = Double.parseDouble(NumberB.getText());

           double conta = 0;

           switch (operacao){
               case "+":
                   conta = numeroA + numeroB;
                   break;
               case  "-":
                   conta = numeroA - numeroB;
                   break;
               case "x":
                   conta = numeroA * numeroB;
                   break;
               case "/":
                   if(numeroB == 0){
                        caixa.setText("não é possivel dividir por zero");
                        return;
                   }
                       conta = numeroA / numeroB;
                       break;
           }
            caixa.setText("Resultado: " + conta);

       }catch (NumberFormatException erro){
           caixa.setText("digite apenas numeros validos");
       }
    }

    public static void main(String[] args) {
        new Exercicio0011().setVisible(true);
    }
}