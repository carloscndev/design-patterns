public class FactoryPatternDemo {

  public static void main(String[] args) {

    ShapeFactory shapeFactory = new ShapeFactory();

    Shape circle = shapeFactory.getShape("CIRCLE");
    circle.draw();

    Shape rentagle = shapeFactory.getShape("RENTANGLE");
    rentagle.draw();

    Shape square = shapeFactory.getShape("SQUARE");
    square.draw();
  }
}
