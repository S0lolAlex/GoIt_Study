public class Cube extends Shape implements Geometry{
    private final double sideLength;
    private final int SIDECOUNT = 6;
    private final int FACETS = 12;

    public Cube(double side){
        sideLength = side;
    }

    public double getSide(){
        return sideLength;
    }
    @Override
    public double getSquare(){
        return SIDECOUNT * Math.pow(sideLength, 2);
    }

    public double getCapacity(){
        return Math.pow(sideLength, 3);
    }
    @Override
    public double getPerimetr(){
        return FACETS * sideLength;
    }

    public double getDiagonal(){
        return sideLength * Math.sqrt(3);
    }


    @Override
    public String getFigure(){
        return "This is " + getClass() + "\n cube side is: " + sideLength;
    }
}
