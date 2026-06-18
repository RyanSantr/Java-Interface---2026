import java.awt.*;
import javax.swing.*;


public class Exercicio0010 extends JFrame {
    private JTextField texto = new JTextField(15);
    private JTextField senha = new JTextField(15);
    private JLabel caixa;

    Exercicio0010() {

        texto = new JTextField(15);
        caixa = new JLabel();
        JButton cadastrar = new JButton("Login");
        caixa = new JLabel("", SwingConstants.CENTER);


        cadastrar.addActionListener(e -> cadastrar());
        JPanel painel = new JPanel(new GridLayout(6,1 ,10,10));

        painel.add(new JLabel("Usuario:"));
        painel.add(this.texto);

        painel.add(new JLabel("Senha:"));
        painel.add(this.senha);

        painel.add(cadastrar);
        painel.add(caixa);

        add(painel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,250);
        setLocationRelativeTo((Component)null);



    }

    private void cadastrar(){
        String usuario = texto.getText();
        String senhaDigitada = senha.getText();
       if(usuario.equals("admin") && senhaDigitada.equals("1234")){
           this.caixa.setText("Login realizado com sucesso");
       }else{
           this.caixa.setText("Usuario ou senha invalida");
       }
    }

    public static void main(String[] args) {
        new Exercicio0010().setVisible(true);
    }
}