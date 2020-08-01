import java.awt.Color;
import java.awt.image.BufferedImage;

public class Oval {
    static int x;
    static int y;
    static int sizex;
    static int sizey;
    static Color color;

    public Oval(int x, int y, int sizex, int sizey, Color color) {
        this.x = x;
        this.y = y;
        this.sizex = sizex;
        this.sizey = sizey;
        this.color = color;
    }

    public void draw(BufferedImage image) {

        int imgHeight = image.getHeight();
        int imgWidth = image.getWidth();
        int circleX = x + sizex/2;
        int circleY = y + sizey/2;
        System.out.println();
        for (int p = x; p < x + sizex; p++) {
            for (int q = y; q < y + sizey; q++) {
                if (q < imgHeight && p < imgWidth) {
                    if(checkpoint(circleX,circleY,p,q,sizex/2,sizey/2) <= 1){
                        image.setRGB(p, q, color.getRGB());
                    }
                }
            }
        }
    }

    static float checkpoint(int h, int k, int x, int y, int a, int b)
    {
        float p = ((float)Math.pow((x - h), 2) / (float)Math.pow(a, 2))
                + ((float)Math.pow((y - k), 2) / (float)Math.pow(b, 2));
        return p;
    }
}
