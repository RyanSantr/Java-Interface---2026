import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Exercicio0013 extends JFrame {
    private final JTextField nomeField;
    private final JTextField  notas1;
    private final JTextField  notas2;
    private final JLabel resultado;

    Exercicio0013(){

        nomeField = new JTextField();
        notas1 = new JTextField();
        notas2 = new JTextField();

        JButton calcularMedia = new JButton("Verificar Situação");
        resultado = new JLabel(" ");

        calcularMedia.addActionListener(e -> CalcularMedia());

        JPanel panel = new JPanel(new GridLayout(4,2,6,6));
        panel.add(new JLabel("Nome:"));
        panel.add(nomeField);
        panel.add(new JLabel("Notas 1:"));
        panel.add(notas1);
        panel.add(new JLabel("Notas 2:"));
        panel.add(notas2);
        panel.add(calcularMedia);
        panel.add(resultado);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(520, 360);
        setLocale(null);


    }

    public void CalcularMedia(){
        String nome = nomeField.getText();

        double not1 = Double.parseDouble(notas1.getText());
        double not2 = Double.parseDouble(notas2.getText());

        double media = (not1 + not2) / 2;

        if (media >= 7){
            resultado.setText("Aluno: " + nome + ", aprovado:  " + media);
        }else if(media >= 5){
            resultado.setText("Aluno: " + nome + ", exame:  " + media);
        }else{
            resultado.setText("Aluno: " + nome +  ", reprovado  " + media);
        }
    }

    public static void main(String[] args) {
        new Exercicio0013().setVisible(true);
    }
}