package pack01;

import javafx.scene.shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(1.2);

        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);

        for (int i = 0; i < circles.length; i++) {
            System.out.println(circles[i]);
        };

    }
}
