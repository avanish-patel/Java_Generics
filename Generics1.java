/*
*  Created by
*  @Author Avanish Patel
*/
// generic class demo
class GenericDemo <T>{
	
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}

public class Generics1 {
	
	public static void main(String[] args) {
		
		GenericDemo<Integer> g = new GenericDemo();
		
		g.add(23);
		System.out.println(g.get());
	}

}
