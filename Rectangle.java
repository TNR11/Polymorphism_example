package task_7;

public class Rectangle extends Shape {
	private double height;
	private double width;
	public Rectangle(String colour, double height, double width) {
		super(colour);
		this.setHeight(height);
		this.setWidth(width);
	}
	
	@Override //Override keyword is implimentation of polymorphism concept. 
	public String getShapeType() {
		String s = "I'm a rectangle";
		return s;
	}
	 public double getPerimeter() {
		 double perimeter = 0;
		 perimeter = ((this.height * 2)) + ((this.width * 2));
		 return perimeter;
	 }
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
}
