import java.util.ArrayList;

import geometry.Circle;
import geometry.Point;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> circles = new ArrayList<>();
        circles.add(new Circles(4));
        circles.add(new Circles(8));
        circles.add(new ColoredCircle(null, 3, "Red"));
        circles.add(new ColoredCircle(null, 1, "Blue"));
        for (Object obj : circles) {
            if (obj instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) obj;
                System.out.println("Area: " + coloredCircle.calculateArea());
                System.out.println("Color: " + coloredCircle.getColor());
            } else if (obj instanceof Circle) {
                Circle circle = (Circle) obj;
                System.out.println("Area: " + circle.calculateArea());
    }

}