package factoryPattern.factoryMethodPattern.pizza.newyork;

import factoryPattern.factoryMethodPattern.pizza.Pizza;

public class NewYorkStylePotatoPizza extends Pizza {

	public NewYorkStylePotatoPizza() {
		this.name = "New York Style Potato Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sause = "Plum Tomato Sauce";
		
		toppings.add("Sharedded Mozzarella Cheese");
		toppings.add("Potato");
		toppings.add("Peperoni");
	}

}
