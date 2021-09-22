package com.company;
public class Main {
    public static void main(String[] args) {        //Metoden sættes i gang i main.
    squareRoot(9);
    }                                               //Der oprettes en metode med en double, der kan returneres.
    public static double squareRoot (double a){
                                                    //Der oprettes variable (double), der gemmer ting i hukommelsen, og programmet kan bruge.
        double x = 2.0, x_1 = 0.0, temp = x;        //Der oprettes en temporary variabel, så der kan eksistere en forskelsvariabel - det er i stedet for en "oldX".
        while(Math.abs(x_1 - temp) > 0.0001){       //Der oprettes et loop, der kører differencen mellem x_1 og den midlertidige variabel "temp". Differencen slutter ved 0.0001.
            x_1 = (x+a/x) / 2.0;
            temp = x;
            x = x_1;
        System.out.println(x_1);                    //Programmet "souter" x_1-værdien.
        }
    return x_1;                                     //Programmet returnerer og kører igen.
    }
}