import ViwPainel.painelPrincipal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            painelPrincipal framePrincipal = new painelPrincipal();
            framePrincipal.setVisible(true);
        });
    }
}
