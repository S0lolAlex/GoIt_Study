public class Cube extends Shape implements Geometry{
    private final double cubeSide;

    public Cube(double side){
        cubeSide = side;
    }

    public double getSide(){
        return cubeSide;
    }
    @Override
    public double getSquare(){
        return 6 * Math.pow(cubeSide, 2);
    }

    public double getCubeCapacity(){
        return Math.pow(cubeSide, 3);
    }
    @Override
    public double getPerimetr(){
        return 12 * cubeSide;
    }

    public double getCubeDiagonal(){
        return cubeSide * Math.sqrt(3);
    }


    @Override
    public String getFigure(){
        return "This is " + getClass() + "\n cube side is: " + cubeSide;
    }
}
