public class Rectangle extends Shape implements Geometry{
    private final double sideA, sideB;

    public Rectangle(double a, double b){
        sideA = a;
        sideB = b;
    }

    public double getSideA(){
        return sideA;
    }

    public double getSideB(){
        return  sideB;
    }
    @Override
    public double getSquare(){
        return sideA * sideB;
    }
    @Override
    public double getPerimetr(){
        return (sideA + sideB) * 2;
    }
    @Override
    public String getFigure(){
        return "This is " + getClass() + "\n it's have side A " + sideA +"length and side B " + sideB + " length";
    }
}
