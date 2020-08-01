import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ShapeDriver {

    public static void main(String[] args) {
        BufferedImage myImage = null;
        File inputFilePath = null;
        final String dir = System.getProperty("user.dir");

        String inFile;
        String shape;
        int xPos;
        int yPos;
        int width;
        int height;
        String colorName;
        String outFile;
        Color color;

        if (args.length == 8) {
            inFile = args[0];
            try {
                inputFilePath = new File(dir +"\\"+ inFile);
                myImage = ImageIO.read(inputFilePath);
            } catch (IOException ioe) {
                System.out.println(ioe);

            }
            shape = args[1];
            xPos = Integer.parseInt(args[2]);
            yPos = Integer.parseInt(args[3]);
            width = Integer.parseInt(args[4]);
            height = Integer.parseInt(args[5]);
            colorName = args[6];
            color = getColor(colorName);
            outFile = args[7];
        } else {
            try {
                inputFilePath = new File(dir +"\\apple.jpeg");
                myImage = ImageIO.read(inputFilePath);
            } catch (IOException ioe) {
                System.out.println(ioe);

            }
            shape = args[0];
            xPos = Integer.parseInt(args[1]);
            yPos = Integer.parseInt(args[2]);
            width = Integer.parseInt(args[3]);
            height = Integer.parseInt(args[4]);
            colorName = args[5];
            color = getColor(colorName);
            outFile = args[6];
        }

        if (shape.equalsIgnoreCase("rectangle")) {
            Rectangle rectangle = new Rectangle(xPos, yPos, width, height, color);
            rectangle.draw(myImage);

        } else if (shape.equalsIgnoreCase("triangle")) {
            Triangle triangle = new Triangle(xPos, yPos, width, height, color);
            triangle.draw(myImage);

        } else if (shape.equalsIgnoreCase("oval")) {
            Oval oval = new Oval(xPos, yPos, width, height, color);
            oval.draw(myImage);

        }
        try {
            File outputFileDir = new File(dir + "\\" + outFile);
            ImageIO.write(myImage, "png", outputFileDir);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
    static Color getColor(String col) {
        Color color;
        switch (col.toLowerCase()) {
            case "red":
                color = new Color(255, 0, 0);
                break;
            case "green":
                color = new Color(0, 255, 0);
                break;
            case "white":
                color = new Color(255, 255, 255);
                break;
            case "black":
                color = new Color(0, 0, 0);
                break;
            case "yellow":
                color = new Color(255,255,  0);
                break;
            case "grey":
                color = new Color(128, 128, 128);
                break;
            case "magenta":
                color = new Color(255, 0, 255);
                break;
            case "cyan":
                color = new Color(0, 255, 255);
                break;
            case "blue":
                color = Color.BLUE;
                break;
            case "darkgrey":
                color = Color.DARK_GRAY;
                break;
            case "lightgray":
                color = Color.LIGHT_GRAY;
                break;
            case "orange":
                color = Color.ORANGE;
                break;
            case "pink":
                color = Color.PINK;
                break;
            default:
                color = null;
        }
        return color;
    }

}


