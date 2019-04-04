package factoryPattern.factoryMethodPattern.pizza.newyork;

import factoryPattern.factoryMethodPattern.pizza.Pizza;

public class NewYorkStyleCheesePizza extends Pizza {

	public NewYorkStyleCheesePizza() {
		this.name = "New York Style Cheese Pizza";
		this.dough = "Thin Dough";
		this.sause = "Marinara Sauce";
		
		toppings.add("Grated Reggiano Cheese");
	}

}
