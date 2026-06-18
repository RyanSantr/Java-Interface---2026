import javax.swing.*;
import java.awt.*;

public class Exercicio0015 extends JFrame {

    private final JTextField nome;
    private final JTextField curso;
    private final JTextField cidade;
    private final JTextField idade;
    private final JLabel caixa;

    Exercicio0015() {

        nome = new JTextField();
        curso = new JTextField();
        cidade = new JTextField();
        idade = new JTextField();
        JButton botao = new JButton("Salvar Resumo");
        caixa = new JLabel(" ", SwingConstants.CENTER);

        botao.addActionListener(e -> gerarResumo());

        JPanel painel = new JPanel(new GridLayout(6, 2, 6, 6));
        painel.add(new JLabel("Nome: "));
        painel.add(nome);

        painel.add(new JLabel("Curso: "));
        painel.add(curso);

        painel.add(new JLabel("Idade: "));
        painel.add(idade);

        painel.add(new JLabel("Cidade: "));
        painel.add(cidade);

        painel.add(botao);
        painel.add(caixa);

        add(painel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(620, 260);
        setLocationRelativeTo(null);

    }


    private void gerarResumo() {
        String n = nome.getText().trim();
        String id = idade.getText().trim();
        String cur = curso.getText().trim();
        String cid = cidade.getText().trim();

        if (n.isEmpty() || id.isEmpty() || cur.isEmpty() || cid.isEmpty()) {
            caixa.setText("Preencha todos os campos");
        } else {
            caixa.setText(n + " tem " + id + " anos, mora em " + cid + " e estuda " + cur + ".");
        }
    }

    public static void main(String[] args) {
        new Exercicio0015().setVisible(true);
    }
}
