import java.util.ArrayList;
import java.util.List;

/*
*  Created by
*  @Author Avanish Patel
*/

abstract class Shape{
	
	abstract void draw();
}

class Rectangle extends Shape{
	
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape{
	
	void draw() {
		System.out.println("Drawing Circle");
	}
}

public class Generics3 {
	
	// method that accepts only child class of Shape
	public static void drawShape(List<? extends Shape> list) {
		
		for(Shape s: list) {
			s.draw();
		}
	}
	
	public static void main(String[] args) {
		
		List<Rectangle> list1 = new ArrayList<>();
		list1.add(new Rectangle());
		
		List<Circle> list2 = new ArrayList<>();
		list2.add(new Circle());
		list2.add(new Circle());
		
		drawShape(list1);
		drawShape(list2);
		
	}

}
