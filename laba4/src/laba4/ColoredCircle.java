package laba4;

public class ColoredCircle {
	
	private Point center;
    private int radius;
    private String color;
    
    public ColoredCircle(Point center, int radius, String color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }
    
    public Point getCenter() {
        return center;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public String getColor() {
        return color;
    }
}
