import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Exercicio009 extends JFrame {
    private JTextField texto = new JTextField(15);
    private JLabel caixa;

    Exercicio009() {

        texto = new JTextField(15);
        caixa = new JLabel();
        add(new JLabel("Produtos Inventario"));
        JButton cadastrar = new JButton("Cadastrar");

        this.setLayout(new FlowLayout());
        this.add(new JLabel("Digite o nome do produto"));
        this.add(this.texto);
        this.add(cadastrar);
        this.add(caixa);

        this.setDefaultCloseOperation(3);
        this.setSize(400,300);
        this.setLocationRelativeTo((Component)null);



    }

    private void cadastrar(){
        String nome = this.texto.getText().trim();
        if(nome.isEmpty()){
            this.caixa.setText("Digite o nome do produto");
        }else {
            this.caixa.setText("Cadastro Realizado para " + nome);
        }
    }

    public static void main(String[] args) {
        new Exercicio009().setVisible(true);
    }
}
