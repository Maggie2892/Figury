package com.sdajava.figury;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-20.
 */

/*
specyfikator_dostepu class NazwaKlasy{
specyfikator_dostepu typ_zwracany nazwaMetody(parametry_po_przecinku){
  jeśli typ zwracany inny niż void to trzeba użyć słówka return i zwrócić wynik odpowiadający właśnie temu typowi
}
}
*/
public class Pola {
    public int a;
    public int b;

    // nazwy klas zaczynają się wielkimi literami
    public Pola(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int poleKwadratu (){
        return a*a;
    }

    public int poleProstokata(){
        return a*b;
    }

    public double poleTrojkata(){
        return a*b*0.5;
    }


/* Accessors (also known as getters and setters) are methods that let you read and write
the value of an instance variable of an object.
    public class AccessorExample {
         private String attribute;

         public String getAttribute() {
         return attribute;
        }
        public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
*/
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }

//konstruktor bezparametrowy, dla wyliczenia pola kwadrat1 z "czytajDane"
      public Pola(){
    }

public void czytajDane(){
    Scanner wejscie = new Scanner(System.in);
    System.out.println("Wpisz a: ");
    this.a = wejscie.nextInt();
    System.out.println("Wpisz b: ");
    this.b = wejscie.nextInt();
}

}

