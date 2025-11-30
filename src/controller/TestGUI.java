
import controller.PanelParticiones;
import javax.swing.JFrame;

public class TestGUI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simulador de Particiones");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(900, 600);
        f.add(new PanelParticiones());
        f.setVisible(true);
    }
}
