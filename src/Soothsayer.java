import javax.swing.JFrame;

public class Soothsayer {
    public static void main(String[] args) {
        Reader r = new Reader("SoothSayer 2.0");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(400, 200);
        r.setResizable(false);
        r.setLocationRelativeTo(null);
    }
}