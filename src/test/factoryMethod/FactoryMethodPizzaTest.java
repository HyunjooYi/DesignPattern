package test.factoryMethod;

import factoryPattern.factoryMethodPattern.pizza.PizzaName;
import factoryPattern.factoryMethodPattern.pizza.PizzaStore;
import factoryPattern.factoryMethodPattern.pizza.newyork.NewYorkPizzaStore;

public class FactoryMethodPizzaTest {

	public static void main(String[] args) {
		PizzaStore store = new NewYorkPizzaStore();
		store.orderPizza(PizzaName.cheesePizza);
		System.out.println("---------------------");
		store.orderPizza(PizzaName.potatoPizza);
	}
}
