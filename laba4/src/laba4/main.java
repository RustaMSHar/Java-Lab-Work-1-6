package laba4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import laba4.Point;
import laba4.ColoredCircle;


public class main {

	public static void main(String[] args) 
	{
        List<ColoredCircle> circles = new ArrayList<>();
        Random rand = new Random();
        
        for (int i = 0; i < 10000; i++) 
        {
            Point center = new Point(rand.nextInt(1001), rand.nextInt(1001));
            int radius = rand.nextInt(1001);
            String color = rand.nextBoolean() ? "red" : "blue";
            circles.add(new ColoredCircle(center, radius, color));
        }
        
        List<Point> redPoints = circles.stream()
                                       .filter(circle -> circle.getColor().equals("red"))
                                       .sorted((c1, c2) -> Integer.compare(c1.getRadius(), c2.getRadius()))
                                       .filter(circle -> circle.getRadius() < 900)
                                       .map(ColoredCircle::getCenter)
                                       .collect(Collectors.toList());
        
        redPoints.stream()
                 .filter(point -> 
                 {
                     int distanceFromOrigin = (int) Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));
                     return distanceFromOrigin >= 100 && distanceFromOrigin <= 200;
                 })
                 .forEach(System.out::println);
        
        

    }

}
