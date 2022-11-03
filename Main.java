package task_7;
/**
 * Assignment Task 7: Polymorphism
 * Author: Aadil Imran, 2022
 */
import static java.lang.System.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Shape> shapes = new LinkedList<>();
		shapes.add(new Shape("white"));
		shapes.add(new Rectangle("red", 10, 6));
		shapes.add(new Rectangle("black", 20, 9));
		shapes.add(new Shape("orange"));
		showShapeNames(shapes);//produces output part 1 
		
		Rectangle[] rectangleArray1 = { 
				new Rectangle("white", 4, 3), 
				new Rectangle("red", 9, 5), 
				new Rectangle("purple", 3, 6), 
				new Rectangle("orange", 15, 10), 
				new Rectangle("black", 4, 14), };
		
		Rectangle[] rectangleArray2 = { 
				new Rectangle("pink", 3, 4), 
				new Rectangle("red", 10, 2), 
				new Rectangle("white", 8, 5), 
				new Rectangle("blue", 14, 4), 
				new Rectangle("bindle", 10, 15), }; 
		        //produces output part 2 
		countOverlapRectangles(rectangleArray1, rectangleArray2);
	}
	
	public static void showShapeNames(List<Shape> shapes){ 
		for (Shape s: shapes) {
			out.printf("%s\n", s.getShapeType());
		}
	} 
	
	public static void countOverlapRectangles(Rectangle[] group1, Rectangle[] group2){
		int i = 0;
		int j =0;
		int coverlap = 0;
		int poverlap = 0;
		for (i=0 ; i<group1.length; i++) {
			for(j=0; j<group2.length; j++) {
				if (group1[i].getColour().equalsIgnoreCase(group2[j].getColour()))
					coverlap ++;
				if (group1[i].getPerimeter() == group2[j].getPerimeter()) {
					poverlap ++;
				}
			}
		}
		out.printf("\nThere are %d rectangle objects with overlapping colour between the two arrays\n", coverlap);
		out.printf("There are %d rectangle objects with overlapping perimeter between the two arrays\n", poverlap);
	}
}


