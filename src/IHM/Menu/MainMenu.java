package IHM.Menu;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame{
    public MainMenu(String title) throws HeadlessException {
        super(title);
        initFrameMenu();
    }

    public void initFrameMenu(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();
        int height = tailleEcran.height;
        int width = tailleEcran.width;

        setSize((int) (width/1.5), (int) (height/1.5));

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
