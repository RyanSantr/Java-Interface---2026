/*
*
* # Exercício 1 — Primeira janela com mensagem

Crie uma tela com:

- um `JLabel` com o texto inicial `"Bem-vindo ao sistema"`;
- um `JButton` com o texto `"Clique aqui"`.

Quando o botão for clicado, o texumato do `JLabel` deve mudar para:

```text
Botão clicado com sucesso!
```

---
*
*
*
*
* */


package ViwPainel;

import javax.swing.*;
import java.awt.*;

public class painelPrincipal extends JFrame {
    private final JLabel mensagemLabel;

    public painelPrincipal() {
        super("Viw Painel");

        mensagemLabel = new JLabel("Bem-vindo ao sistema");
        JButton btnClicar = new JButton("Clique aqui");
        btnClicar.addActionListener(e -> mensagemLabel.setText("Botão clicado com sucesso!"));

        JPanel painelPrincipal = new JPanel(new FlowLayout());
        painelPrincipal.add(mensagemLabel);
        painelPrincipal.add(btnClicar);

        add(painelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setLocationRelativeTo(null);
    }
}
