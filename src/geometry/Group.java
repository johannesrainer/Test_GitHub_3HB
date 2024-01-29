package geometry;

import java.util.ArrayList;

public class Group {
	
	ArrayList<Shape> shapes= new ArrayList<Shape>();
	
	/**
	 * adds a body to the list of all bodies
	 * @param shape
	 */
	public void addShape(Shape shape) {
		this.shapes.add(shape);
	}
	
	/**
	 * removes a body from the list of all bodies
	 * @param shape
	 */
	public void removeShape(Shape shape) {
		this.shapes.remove(shape);
	}
	
	/**
	 * calculates the overall area of all bodies
	 * @return
	 */
	public double overallArea() {
		double area = 0;
		for(Shape s : this.shapes) {
			area += s.area();
		}
		return area;
	}
	
	/**
	 * calculates the overall circumference of all bodies
	 * @return
	 */
	public double overallCircumfence() {
		double circumference = 0;
		for(Shape s : this.shapes) {
			circumference += s.circumference();
		}
		return circumference;
	}
	
	/**
	 * prints the biggest body
	 * @return
	 */
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
	
	/**
	 * prints all shapes
	 */
	public void printAll() {
		for(Shape s : shapes) {
			System.out.println(s);
		}
	}
	
}
