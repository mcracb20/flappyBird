package flappyBird;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {
    private static final long serivalVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        FlappyBird.flappyBird.repaint(g);
    }
}
