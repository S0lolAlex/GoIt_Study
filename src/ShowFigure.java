public class ShowFigure extends Shape {
   private Shape figure;

   public ShowFigure(Shape object){
       figure = object;
   }

   public void showFigure(){
       System.out.println(figure.getFigure());
   }

}

