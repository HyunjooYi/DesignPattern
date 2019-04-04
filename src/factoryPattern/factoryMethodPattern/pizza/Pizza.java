package factoryPattern.factoryMethodPattern.pizza;

import java.util.ArrayList;

public abstract class Pizza {
	protected String name = "default pizza";
	protected String dough = "default dough";
	protected String sause = "default sause";
	protected ArrayList<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough : " + dough);
		System.out.println("Adding sauce : " + sause);
		System.out.println("Adding toppings : ");
		for(int i = 0, size = toppings.size(); i < size; i++)
			System.out.println("      " + (i+1) + ") " + toppings.get(i));
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place Pizza in official pizzaStore box");
	}
	
	public String getName() {
		return name;
	}

}
