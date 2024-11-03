import java.awt.*;

public class Screen extends Frame {
    public static void main(String[] args) {
        new Screen();
    }
    Screen() {
        super("Screen");
        setSize(200, 100);
        Button b1 = new Button("OK");
        add(b1);
        setVisible(true);
    }
}