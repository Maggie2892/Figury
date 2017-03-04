package com.sdajava.figury;

public class Main {

    public static void main(String[] args) {
	// main jest metodą, static - metoda statyczna, metod main musi być metodą statyczną

        Pola kwadrat = new Pola (3, 8);
        System.out.println("Pole kwadratu o boku 3 wynosi: " + kwadrat.poleKwadratu());

        Pola prostokat = new Pola(4,3);
        System.out.println("Pole prostokąta o bokach 2 i 5 wynosi: " + prostokat.poleProstokata());

        Pola trojkat = new Pola(3,6);
        System.out.println("Pole trojkata o podstawie 3 i wysokości 6 wynosi: " + trojkat.poleTrojkata());


        System.out.println("\n a = 12, b = 15");
        kwadrat.setA(12);
        kwadrat.setB(15);
        System.out.println("Nowe pole kwadratu: " + kwadrat.poleKwadratu());
        System.out.println("Nowe pole prostokata: " + prostokat.poleProstokata());
        System.out.println("Nowe pole trojkata: " + trojkat.poleTrojkata());

        System.out.println("\n");
        Pola kwadraty = new Pola();
        kwadraty.czytajDane();
        System.out.println(kwadraty.poleKwadratu());

        Pola prostokaty = new Pola();
        prostokaty.czytajDane();
        System.out.println(prostokaty.poleProstokata());

        Pola trojkaty = new Pola();
        trojkaty.czytajDane();
        System.out.println(trojkaty.poleTrojkata());

    }
}
