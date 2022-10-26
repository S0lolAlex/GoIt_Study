public class ShowFigure extends Shape {
   public void showFigure(Shape figure){
       System.out.println(figure.getFigure());
   }

   public static void main(String[] args){
       Circle figure = new Circle(12.2);
       ShowFigure example = new ShowFigure();

       example.showFigure(figure);
   }

}

