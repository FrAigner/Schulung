package de.pcCollege.objektorientierung;

public class Pizzabestellung {
    public static void main(String[] args) {

        de.pcCollege.Vorlage.Pizzabestellung Pizza1 = new de.pcCollege.Vorlage.Pizzabestellung(32);
        de.pcCollege.Vorlage.Pizzabestellung Pizza2 = new de.pcCollege.Vorlage.Pizzabestellung(true);
        de.pcCollege.Vorlage.Pizzabestellung Pizza3 = new de.pcCollege.Vorlage.Pizzabestellung(26, true, 11);

        System.out.println("Pizza3: "+ Pizza3.getPreis());


    }
}
