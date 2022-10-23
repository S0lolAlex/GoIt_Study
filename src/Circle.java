public class Circle extends Shape implements Geometry{
    private final double radius;
    private final double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public double getSquare(){
        return PI * Math.pow(radius,2);
    }
    @Override
    public double getPerimetr(){
        return 2 * PI * radius;
    }

    @Override
    public String getFigure(){
        return "This is " + getClass() + "\n radius of Circle: " + radius;
    }
}
