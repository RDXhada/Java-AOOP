public class Rectangle {
    private double width;
    private double height;
    private String color = "Black";

    public Rectangle()
    {
        width = 0;
        height = 0;
        color = "Black";
    }
    public Rectangle(double width, double height)
    {
        this.width = width >= 0 ? width : 0;
        this.height = height >= 0 ? height : 0;
    }

    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width >= 0 ? width : 0;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height = height >= 0 ? height : 0;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color != null ? color : "No color??";
    }
    public double getArea()
    {
        return getHeight() * getWidth();
    }
    public double getPerimeter()
    {
        return 2 * (getHeight() + getWidth());
    }
}
