public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(13.1);
        Shape cube = new Cube(6);
        Shape triangle = new Triangle(5,4,3);
        Shape hexagon = new RegularHexagon(4);
        Shape rectangle = new Rectangle(2,4);
        ShowFigure.showFigure(circle);
        ShowFigure.showFigure(cube);
        ShowFigure.showFigure(triangle);
        ShowFigure.showFigure(hexagon);
        ShowFigure.showFigure(rectangle);
    }
}
