package geometry;

public class Circle extends Shape {
	
	public double radius;
	public final double pi = 3.14;
	
	public Circle(double x, double y, double radius) {
		this.setxCoordinate(x);
		this.setyCoordinate(y);
		this.radius = radius;
	}
	
	public double circumference() {
		return 2*this.pi*this.radius;
	}
	
	public double area() {
		return this.pi*this.radius*this.radius;
	}
	
	

}
