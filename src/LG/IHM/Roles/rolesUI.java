package LoupGarou.UI;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class rolesUI extends JFrame {
    private JTextArea loupAlphaDescription;
    private JLabel loupAlphaImage;
    private JTextArea loupChamanDescription;
    private JLabel loupChamanImage;
    private JTextArea lgDescription;
    private JTextArea loupVoyantDescripion;
    private JTextArea chasseurDescription;
    private JLabel lgImage;
    private JLabel loupVoyantImage;
    private JLabel chasseurImage;
    private JTextArea corrupteurDescription;
    private JTextArea fouDescription;
    private JTextArea villageoisMauditDescription;
    private JLabel fouImage;
    private JLabel corrupteurImage;
    private JLabel villageoisMauditImage;
    private JTextArea docteurDescription;
    private JTextArea gdcDescription;
    private JTextArea geolierDescription;
    private JTextArea maireDescription;
    private JTextArea mediumDescription;
    private JTextArea tireurDescription;
    private JTextArea voyanteDescription;
    private JTextArea voyanteAuraDescription;
    private JLabel voyanteAuraImage;
    private JLabel voyanteImage;
    private JLabel tireurImage;
    private JLabel mediumImage;
    private JLabel maireImage;
    private JLabel geolierImage;
    private JLabel gdcImage;
    private JLabel docteurImage;

    public rolesUI() {
        super("Rôles");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600,800);
        this.setLocationRelativeTo(null);

        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        rolesUI rolesUI = new rolesUI();
    }

}
