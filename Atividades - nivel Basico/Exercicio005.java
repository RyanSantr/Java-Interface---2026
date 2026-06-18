import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Exercicio005 extends JFrame {
    private  final JTextField txtidade;
    private final JLabel resultado;

    Exercicio005() {

        txtidade = new JTextField(10);
        JButton btnIniciar = new JButton("Iniciar Verificação");
        resultado = new JLabel("Resultado");


        btnIniciar.addActionListener(e -> verificaridade());

        setLayout(new FlowLayout());
        add(new JLabel("IDADE"));
        add(txtidade);
        add(btnIniciar);
        add(resultado);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        setLocale(null);

    }

    public  void verificaridade(){

        int idade = Integer.parseInt(txtidade.getText());
        if(idade >= 18){
            resultado.setText("maior de idade");
        }else {
            resultado.setText("menor de idade");
        }

    }

    public static void main(String[] args) {

        new Exercicio005().setVisible(true);
    }
}
