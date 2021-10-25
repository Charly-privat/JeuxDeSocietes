package LoupGarou.UI;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class menuUI extends JFrame {
    private JButton jouerBouton;
    private JButton reglesBouton;
    private JButton rolesBouton;
    private JLabel menuImage;
    private JPanel menuPanel;
    private JLabel menuTitre;

    public menuUI() {
        super("Jeu du Loup Garou");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600,800);
        this.setLocationRelativeTo(null);

        menuPanel = (JPanel) getContentPane();
        menuPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;

        gbc.gridy = 0;
        menuTitre = new JLabel("Jeu du Loup Garou", SwingConstants.CENTER);
        menuPanel.add(menuTitre,gbc);

        gbc.gridy = 1;
        menuImage = new JLabel(new ImageIcon("src/LoupGarou/Ressources/Menu/menu.jpg"));
        menuPanel.add(menuImage,gbc);

        gbc.gridy = 2;
        jouerBouton = new JButton("Jouer");
        menuPanel.add(jouerBouton,gbc);

        gbc.gridy = 3;
        reglesBouton = new JButton("Règles du jeu");
        menuPanel.add(reglesBouton,gbc);

        gbc.gridy = 4;
        rolesBouton = new JButton("Rôles");
        menuPanel.add(rolesBouton,gbc);

        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        menuUI menuUI = new menuUI();
    }
}