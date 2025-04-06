import javax.swing.*;
import java.awt.*;

public class Main {
    private static final int WIDTH_SIZE = 1080;
    private static final int HIGH_SIZE = 1080;

    public static void main(String[] args) {
        Painter painter = new Painter();
        MainWindow mainWindow;

        Canvas frame = painter.drawCanvas(WIDTH_SIZE, HIGH_SIZE);
        mainWindow = new MainWindow(frame, WIDTH_SIZE, HIGH_SIZE);

        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setResizable(false);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }
}