package problem3;

public class ExponentApp {
    private double x;
    private double accuracy;

    public ExponentApp(double x)
    {
        setX(x);
    }
    public ExponentApp()
    {
        setX(0);
    }

    public double getX()
    {
        return x;
    }
    public void setX(double x)
    {
        this.x = x;
    }

    public double getAccuracy()
    {
        return accuracy;
    }
    public void setAccuracy(double accuracy)
    {
        this.accuracy = accuracy > 0 && accuracy < 1 ? accuracy : 0;
    }
}
