import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame{
    Canvas canvas;

    public MainWindow(Canvas canvas, int w, int h) {
        super("geometry-art");

        this.canvas = canvas;
        setSize(w, h);

        JPanel canvasPanel = new JPanel();

        canvasPanel.add(canvas);

        Container content = getContentPane();

        content.add(BorderLayout.CENTER, canvasPanel);
    }
}
