import java.awt.*;
import java.util.Random;

public class Painter {
    private Canvas canvas = new Canvas();

    public Canvas drawCanvas(int w, int h) {
        canvas.setBackground(Color.GRAY);
        canvas.setSize(w, h);

        drawShapes();

        return canvas;
    }

    private void drawShapes() {
        for (int i = 0; i <= getCountShapes(); i++) {
            Graphics g = canvas.getGraphics();
            Graphics2D g2d = (Graphics2D) g;
        }
    }

    private int getCountShapes() {
        Random rand = new Random();
        return rand.nextInt(4, 18);
    }

    private ShapesType getShapeType() {
        Random rand = new Random();
        int probability = rand.nextInt(1, 100);

        if (probability > 0 && probability <= 20) return ShapesType.POINT;
        if (probability > 20 && probability <= 40) return ShapesType.LINE;
        if (probability > 40 && probability <= 60) return ShapesType.CIRCLE;
        if (probability > 60 && probability <= 70) return ShapesType.TRIANGLE;
        if (probability > 70 && probability <= 80) return ShapesType.SQUARE;
        if (probability > 80 && probability <= 90) return ShapesType.RECTANGLE;
        if (probability > 90 && probability <= 100) return ShapesType.POLYGON;

        return null;
    }
}
