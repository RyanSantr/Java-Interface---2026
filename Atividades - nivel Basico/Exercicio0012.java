import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercicio0012 extends JFrame {
    private int cliques;
    private JLabel contadorButao;

    Exercicio0012(){

            cliques = 0;
            contadorButao = new JLabel("Cliques: ");
            JButton Clique = new JButton("Clique aqui");

              Clique.addActionListener(e -> Contar());


             setLayout(new FlowLayout());
              add(Clique);
              add(contadorButao);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450,350);
        setLocationRelativeTo(null);

    }

    public void Contar(){
        cliques++;
        contadorButao.setText("Clique: " + cliques);
    }

    public static void main(String[] args) {
        new Exercicio0012().setVisible(true);

    }

}
