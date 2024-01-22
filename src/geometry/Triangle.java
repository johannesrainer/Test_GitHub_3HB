package geometry;

public class Triangle extends Shape {
	
	public double sideA;
	public double sideB;
	public double sideC;
	public double height;
	
	public Triangle(double x, double y, double sideA, double sideB, double sideC, double height) {
		this.setxCoordinate(x);
		this.setyCoordinate(y);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		this.height = height;
	}
	
	public double circumference() {
		return this.sideA += this.sideB += sideC;
	}
	
	public double area( ) {
		return (this.sideA * this.height)/2; 
	}

}
