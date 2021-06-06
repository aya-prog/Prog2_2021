package aufgaben.aufgabe6;

import java.util.*;

public class PizzaMenu {

	public static boolean existingPizza(Map<String, Double> menu, String pizza) {

		if (menu.containsKey(pizza)) {
			System.out.println("Die Pizza " + pizza + "  ist erhältlich. ");
		} else {
			return false;
		}
		return false;

	}

	public static void printPrice(Map<String, Double> menu, String pizza) {

		if (existingPizza(menu, pizza)) {
			System.out.println(pizza + menu.getOrDefault(pizza, null) + "kostet diese Pizza");
		} else {
			System.out.println("Die Pizza : " + pizza + "die Sie bestellen möchten, ist heute nicht erhältlich");
		}
		System.out.println();
	}

	public static void printMenu(Map<String, Double> menu) {
		System.out.println();
		System.out.println("###########################");
		System.out.println();
		System.out.println("Die Speisekarte enthält " + menu.size() + " Pizzen.");
		if (menu.isEmpty()) {
			System.out.println("#######################");
		}
		for (Map.Entry<String, Double> pizza : menu.entrySet()) {
			System.out.println("Pizza " + pizza.getKey() + ": " + " kostet " + pizza.getValue() + "€");
		}
		System.out.println();
	}

	public static void affordablePizza(Map<String, Double> menu, double maxPrice) {
		Set<String> pizzaSorte = new HashSet<>();
		System.out.println("Für das Budget " + maxPrice + "€");

		for (Map.Entry<String, Double> pizza : menu.entrySet()) {
			if (pizza.getValue() < maxPrice) {
				pizzaSorte.add(pizza.getKey());
			}
		}
		if (pizzaSorte.isEmpty()) {
			System.out.println(" Für dieses Budget kann ich Ihnen leider keine Pizza anbieten ");
		} else {
			System.out.println(" Für ihr Budget gibt es folgende Pizzen : " + pizzaSorte);
		}

	}

	public static void main(String[] args) {

		Map<String, Double> menu = new HashMap<>();
		menu.put(" Margheritta ", 7.00);
		menu.put(" Veggi ", 7.50);
		menu.put(" Salami ", 8.50);
		menu.put(" Schinken ", 8.50);

		printPrice(menu, " Salami ");
		printPrice(menu, " Veggi ");
		printMenu(menu);

		menu.put("Schinken", 8.2);
		System.out.printf("Schninken mit anderem Price%n");
		printMenu(menu);

		affordablePizza(menu, 5.0);
		affordablePizza(menu, 8.0);

		menu.clear();
		System.out.println();
		printMenu(menu);

		menu.put(" Marinara ", 7.0);
		menu.put(" Quattro Stagioni ", 8.2);
		menu.put(" Diavola", 8.5);
		printMenu(menu);

		Map<String, Double> menu2 = new HashMap<>();
		menu2.putAll(menu);
		System.out.println("Menu 2");
		printMenu(menu2);
		menu2.remove("Hawaii");
		System.out.println("nachdem Hawaii Pizza gelöscht wurde");
		printMenu(menu2);
	}

}
