public class Triangle extends Shape implements Geometry{
    private final double sideA, sideB, sideC;

    public Triangle(double a, double b, double c){
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public double getSideA(){
        return sideA;
    }

    public double getSideB(){
        return sideB;
    }

    public double getSideC(){
        return sideC;
    }
    @Override
    public double getPerimetr(){
        return sideA + sideB + sideC;
    }

    public String getTriangleType(){

        if(sideA == sideB && sideA == sideC){
            return "Triangle is equilateral";
        }

        if(sideA == sideB || sideA == sideC || sideC == sideB){
            return "Triangle is isosceles";
        }

        return "Triangle is versatile";
    }
    @Override
    public double getSquare(){
        double halfPerimetr = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr -sideA) * (halfPerimetr - sideB) * (halfPerimetr - sideC));
    }


    @Override
    public String getFigure(){
        return "This is " + getClass() + "\n " + getTriangleType() +
                "\n it's have side's A,B,C " + sideA + ","+ sideB + "," + sideC  + " length";
    }
}
