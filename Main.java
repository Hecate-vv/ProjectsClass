import geometry.Circle;
import geometry.Point;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(1, 2);
        Circle circle = new Circle(center, 5);
        System.out.println("Współrzędne środka koła:(" + circle.getCenter().getX() +"," + circle.getCenter().getY() +")");
        System.out.println("Promień:" + circle.getRadius());
        System.out.println("Obwówd:" + circle.calculatePerimeter());
        ColoredCircle coloredCircle = new ColoredCircle(center, 5, "Fiolet");
        System.out.println("Kolor: " + coloredCircle.getColor());
    }

}