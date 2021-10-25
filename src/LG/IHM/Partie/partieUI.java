package LoupGarou.UI;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class partieUI extends JFrame {
    private JPanel partiePanel;

    public partieUI() {
        super("Partie en cours");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600,800);
        this.setLocationRelativeTo(null);

        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        partieUI partieUI = new partieUI();
    }
}
