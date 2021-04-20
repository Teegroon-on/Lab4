import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator
{
    public static final int MAX_ITERATIONS = 2000;

    /** Метод, позволяющий генератору фракталов определить наиболее «интересную»
     * 	область комплексной плоскости для конкретного фрактала */
    public void getInitialRange(Rectangle2D.Double range)
    {
        range.x = -2;
        range.y = -1.5;
        range.height = 3;
        range.width = 3;
    }
    // Метод реализует итеративную функцию для фрактала Мандельброта
    public int numIterations(double x, double y)
    {
        double x1 = 0;
        double y1 = 0;

        for(int i = 0; i < MAX_ITERATIONS; i++)
        {
            double x2 = x1 * x1 - y1 * y1 + x;
            double y2 = 2 * x1 * y1 + y;
            x1 = x2;
            y1 = y2;
            if (x1 * x1 + y1 * y1 > 4)
            {
                return i;
            }
        }
        return -1; // выход за границы
    }
}