import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import static java.awt.image.BufferedImage.TYPE_INT_RGB;

public class JImageDisplay extends JComponent
{
    private BufferedImage image;

    // Конструктор класса
    public JImageDisplay(int x, int y)
    {
        image = new BufferedImage(x,y,TYPE_INT_RGB); //ширина высота и тип изображения
        setPreferredSize(new Dimension(x, y));
    }
    // Метод для отрисовки фракталов
    public void paintComponent (Graphics g)
    {
        g.drawImage (image, 0, 0, image.getWidth(), image.getHeight(), null);
    }
    // Метод для установки всех пикселей изображения в черный цвет
    public void clearImage ()
    {
        for (int x = 0; x < image.getWidth(); x++)
        {
            for (int y = 0; y < image.getHeight(); y++)
            {
                image.setRGB(x, y, 0);
            }
        }
    }
    // Метод для установки всех пикселей изображения в определенный цвет
    public void drawPixel (int x, int y, int rgbColor)
    {
        image.setRGB(x, y, rgbColor);
    }
}