package factoryPattern.factoryMethodPattern.pizza.newyork;

import factoryPattern.factoryMethodPattern.pizza.Pizza;
import factoryPattern.factoryMethodPattern.pizza.PizzaName;
import factoryPattern.factoryMethodPattern.pizza.PizzaStore;

public class NewYorkPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		switch(type) {
		case PizzaName.cheesePizza:
			return new NewYorkStyleCheesePizza();
		case PizzaName.potatoPizza:
			return new NewYorkStylePotatoPizza();
		}
		return null;
	}

}
