package LoupGarou.UI;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;


public class reglesUI extends JFrame {
    private JLabel reglesTitre;
    private JPanel reglesPanel;
    private JLabel reglesDescription;

    public reglesUI() {
        super("Règles du jeu");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600,800);
        this.setLocationRelativeTo(null);

        reglesPanel = (JPanel) getContentPane();
        reglesPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;

        gbc.gridy = 0;
        reglesTitre = new JLabel("Règles du jeu", SwingConstants.CENTER);
        reglesPanel.add(reglesTitre,gbc);

        gbc.gridy = 1;
        reglesDescription = new JLabel("<html>" +
                "Le jeu est constitué de plusieurs équipes. Une                                                                                                                                                                                                                                                                                                                                                           est gagnée par au maximum une équipe. Chaque équipe gagne de manière différente. " +
                "<div style=\"height:15px\"></div>" +
                "<b>L'équipe des Villageois :</b><br>" +
                "Le village est l'équipe majoritaire du jeu, le but de cette équipe est d'éliminer les dangers de la nuit (loups-garous, tueurs solos)." +
                "<div style=\"height:15px\"></div>" +
                "<b>L'équipe des Loups Garous :</b><br>" +
                "Le but de l'équipe des loups garous est de tuer l'équipe du village ainsi que les solos. Chaque nuit, ils peuvent tuer un joueur via le vote nocturne." +
                "<div style=\"height:15px\"></div>" +
                "<b>Les joueurs solo :</b><br>" +
                "Il n'existe que 2 rôles différents dans cette équipe, le fou et le chasseur de tête. Il existe des exceptions dans le jeu: Le villageois maudit, qui gagne avec le village mais rejoins les loups-garous si celui-ci se fait attaquer." +
                "</div" +
                "</html>");
        reglesPanel.add(reglesDescription,gbc);

        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(new NimbusLookAndFeel());
        reglesUI reglesUI = new reglesUI();
    }

}
