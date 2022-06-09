package Objektorientierung;

import Objektorientierung.Vorlagen.Pizza;

public class Pizzabestellen {
    public static void main(String[] args) {
        //Pizza Pizza1 = new Pizza(26);

        String[][] pizza = {
                {"Durchmesser 26 cm", "6,50", "true"},
                {"Durchmesser 30 cm", "8,00", "true"},
                {"Durchmesser 44 cm", "15,00", "true"}};


        System.out.println("Wir haben folgende Pizza größen zur Auswahl:");
        for (int i = 0; i < pizza.length; i++) {
            if (Boolean.parseBoolean(pizza[i][2])) {
                System.out.println((i + 1) + ": " + pizza[i][0]);
            }
        }

        Pizza Pizza1 = new Pizza(26);
        Pizza Pizza2 = new Pizza(26,true);
        Pizza Pizza3 = new Pizza(40,true,5);

        System.out.printf("\nPreis für ihre Bestellung beträgt: %.2f", Pizza3.getPreis());



    }
}
