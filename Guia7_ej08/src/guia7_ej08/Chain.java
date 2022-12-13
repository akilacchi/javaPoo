package guia7_ej08;

import java.util.Scanner;

public class Chain {
    String ns = "";
    Scanner scan = new Scanner(System.in);

    private String c;
    private int lon;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public Chain() {
    }

    public void showVowels() {
        int va = 0, ve = 0, vi = 0, vo = 0, vu = 0;
        for (int i = 0; i < lon; i++) {
            switch (c.toLowerCase().charAt(i)) {
                case 'a':
                    va++;
                    break;
                case 'e':
                    ve++;
                    break;
                case 'i':
                    vi++;
                    break;
                case 'o':
                    vo++;
                    break;
                case 'u':
                    vu++;
                    break;
            }
        }
        System.out.println("Hay un total de " + va + " letras 'A' en la frase.");
        System.out.println("Hay un total de " + ve + " letras 'E' en la frase.");
        System.out.println("Hay un total de " + vi + " letras 'I' en la frase.");
        System.out.println("Hay un total de " + vo + " letras 'O' en la frase.");
        System.out.println("Hay un total de " + vu + " letras 'U' en la frase.");
    }

    public void invertPhrase() {
        String ns ="";
        for (int i = lon-1; i >= 0; i--) {
            ns= ns+c.charAt(i);
        }
        System.out.println(ns);
    }

    public void timesRepeated(String letter) {
        int aux = 0;
        for (int i = 0; i < lon; i++) {
            if (c.charAt(i) == letter.charAt(0)) {
                aux++;
            }
        }
        System.out.println("la letra " + letter + " se repite " + aux + " veces en la frase.");
    }

    public void compareLength(String phrase) {
        if (lon == phrase.length()) {
            System.out.println("Ambas frases tienen la misma longitud.");
        } else if (lon > phrase.length()) {
            System.out.println("La frase original es mas larga que la nueva por " + (lon - phrase.length()));
        } else {
            System.out.println("La nueva frase es mas larga que la original por " + (phrase.length() - lon));
        }
    }

    public void joinPhrases(String phrase) {
        System.out.println("La nueva frase es");
        System.out.println(c.concat(phrase));
    }

    public void replace(String letter) {
        c.replace('a', letter.charAt(0));
        System.out.println("La nueva frase es");
        System.out.println(c.replace('a', letter.charAt(0)));

    }

    public void contains(String letter) {
        if (c.contains(letter)) {
            System.out.println("La letra " + letter + " se encuentra dentro de la frase.");
        } else {
            System.out.println("La letra " + letter + " no se encuentra dentro de la frase.");
        }

    }
}
