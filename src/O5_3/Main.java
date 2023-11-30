package O5_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Huisdier> huisdieren = new ArrayList<Huisdier>();

        Huisdier hond = new Huisdier("Henk", "Golden Retriever");
        Huisdier kat = new Huisdier("Miesje", "kat");

        huisdieren.add(hond);
        huisdieren.add(kat);
        huisdieren.add(new Huisdier("Peter", "schildpad"));

        System.out.println("Huisdieren:");
        for (Huisdier huisdier : huisdieren) {
            System.out.println("\t" + huisdier);
        }

        huisdieren.addFirst(new Huisdier("Witje", "hamster"));
        huisdieren.set(2, new Huisdier("Streepje", "hamster"));

        System.out.println("Huisdieren na toevoeging:");
        for (Huisdier huisdier : huisdieren) {
            System.out.println("\t" + huisdier);
        }
    }
}
