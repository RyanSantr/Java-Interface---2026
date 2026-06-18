import java.awt.FlowLayout;
import javax.swing.*;


public class Exercicio001 extends JFrame {
    private final JLabel texto;

    public Exercicio001() {
            texto = new JLabel("bem vindo ao Sistema: ");
            JButton botao = new JButton("Clique aqui");

            botao.addActionListener(e -> alterarMensagem());

        setLayout(new FlowLayout());
        add(texto);
        add(botao);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setLocationRelativeTo(null);

    }

    private void alterarMensagem() {texto.setText("Botao clicado com sucesso!");}

    public static void main(String[] args) {
        new Exercicio001().setVisible(true);
    }

}
