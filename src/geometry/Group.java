package geometry;

import java.util.ArrayList;

public class Group {
	
	ArrayList<Shape> shapes= new ArrayList<Shape>();
	
	public void addShape(Shape shape) {
		this.shapes.add(shape);
	}
	
	public void removeShape(Shape shape) {
		this.shapes.remove(shape);
	}
	
	public double overallArea() {
		double area = 0;
		for(Shape s : this.shapes) {
			area += s.area();
		}
		return area;
	}
	
	public double overallCircumfence() {
		double circumference = 0;
		for(Shape s : this.shapes) {
			circumference += s.circumference();
		}
		return circumference;
	}
	
	public double biggestArea() {
		double max = 0;

		for(Shape s : this.shapes) {
			if(s.area() > max) {
				max = s.area();
				System.out.println("Biggest Body: " + s.toString());
			}
		}
		return max;
	}
	
	public void printAll() {
		for(Shape s : shapes) {
			System.out.println(s);
		}
	}
	
	
	
	

}
