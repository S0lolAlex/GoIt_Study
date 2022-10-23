public class RegularHexagon extends Shape implements Geometry{
    private final double side;

    public RegularHexagon(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }
    @Override
    public double getPerimetr(){
        return 6 * side;
    }
    @Override
    public double getSquare(){
        return ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);
    }
    @Override
    public String getFigure(){
        return "This is " + getClass() + "\n it's have side " + side + " length";
    }
}
