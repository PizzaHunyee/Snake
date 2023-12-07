import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnakeGame extends JFrame {
    private static final long serialVersionUID = 1L;

    public SnakeGame() {
        add(new SnakePanel());
        setResizable(false);
        pack();

        setTitle("Snake Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrame frame = new SnakeGame();
        frame.setVisible(true);
    }
}

class SnakePanel extends JPanel implements KeyListener {
    private static final long serialVersionUID = 1L;

    public SnakePanel() {
        setFocusable(true);
        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Handle key presses
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Handle key releases
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Handle key types
    }
}
