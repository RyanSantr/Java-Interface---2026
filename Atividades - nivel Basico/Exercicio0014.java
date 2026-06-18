import javax.swing.*;
import java.awt.*;

public class Exercicio0014 extends JFrame {

    private final JTextField preco;
    private final JTextField nomePrdo;
    private final JTextField desc;
    private JLabel caixa;

    Exercicio0014() {

        preco = new JTextField(14);
        nomePrdo = new JTextField(14);
        desc = new JTextField(14);

        JButton calcular = new JButton("Calcular");
        caixa = new JLabel("Resultado: ", SwingConstants.CENTER);

        calcular.addActionListener(e -> calcular());

        JPanel painelCampos = new JPanel(new GridLayout(3, 2, 6, 6));

        painelCampos.add(new JLabel("Produto:"));
        painelCampos.add(nomePrdo);

        painelCampos.add(new JLabel("Preço:"));
        painelCampos.add(preco);

        painelCampos.add(new JLabel("Desconto em (%):"));
        painelCampos.add(desc);

        JPanel painelBotao = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelBotao.add(calcular);

        JPanel painelResultadoBotao = new JPanel(new GridLayout(2, 1, 6, 6));
        painelResultadoBotao.add(caixa);
        painelResultadoBotao.add(painelBotao);

        setLayout(new BorderLayout(10, 10));

        add(painelCampos, BorderLayout.NORTH);
        add(painelResultadoBotao, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(520, 230);
        setLocationRelativeTo(null);
    }

    public void calcular() {
        try {
            String nome = nomePrdo.getText();

            double preco1 = Double.parseDouble(preco.getText());
            double dec = Double.parseDouble(desc.getText());

            double valor = preco1 - (preco1 * dec / 100);

            caixa.setText(String.format("%s: Valor Final: R$ %.2f", nome, valor));

        } catch (NumberFormatException erro) {
            caixa.setText("Digite preço e desconto válidos.");
        }
    }

    public static void main(String[] args) {
        new Exercicio0014().setVisible(true);
    }
}