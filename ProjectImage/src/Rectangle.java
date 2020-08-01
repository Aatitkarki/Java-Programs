import java.awt.Color;
import java.awt.image.BufferedImage;

public class Rectangle {
    static int x;
    static int y;
    static int sizex;
    static int sizey;
    static Color color;

    public Rectangle(int x, int y, int sizex, int sizey, Color color) {
        this.x = x;
        this.y = y;
        this.sizex = sizex;
        this.sizey = sizey;
        this.color = color;
    }

    public void draw(BufferedImage image) {
        int imgHeight = image.getHeight();
        int imgWidth = image.getWidth();
        for (int p = x; p < x + sizex; p++) {
            for (int q = y; q < y + sizey; q++) {
                if (q < imgHeight && p < imgWidth) {
                    image.setRGB(p, q, color.getRGB());
                }

            }
        }

    }
}
