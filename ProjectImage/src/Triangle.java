import java.awt.Color;
import java.awt.image.BufferedImage;

public class Triangle {
    static int x;
    static int y;
    static int sizex;
    static int sizey;
    static Color color;

    public Triangle(int x, int y, int sizex, int sizey, Color color) {
        this.x = x;
        this.y = y;
        this.sizex = sizex;
        this.sizey = sizey;
        this.color = color;
    }

    public void draw(BufferedImage image) {
        int imgHeight = image.getHeight();
        int imgWidth = image.getWidth();
        int halfPart = x+(sizex)/2;
        float leftPoint = x;
        float rightPoint = sizex+x;
        System.out.println(halfPart+" "+leftPoint+" "+rightPoint);
        System.out.println(y+" "+(y+sizey));
        for (float q = y; q < y+(sizex/2); q++) {
            for (float p = leftPoint ; p <= halfPart ; p++) {
                if (q < imgHeight && p < imgWidth) {
                    image.setRGB((int)p, (int)q, color.getRGB());
                }
            }
            for (float r = rightPoint; r >= halfPart ; r--) {
                if (q < imgHeight && r < imgWidth) {
                    image.setRGB((int)r, (int)q, color.getRGB());
                }
            }
            leftPoint++;
            rightPoint--;
        }
    }
}