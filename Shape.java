package task_7;

public class Shape { //superclass
	private String colour;
	public Shape(String colour) {
		this.setColour(colour);
	}
	public String getShapeType() {
		String s = "I'm a shape";
		return s;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
}

