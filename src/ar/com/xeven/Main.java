package ar.com.xeven;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Pedirle al usuario dia y mes de su cumpleanios e informarle
    que dia del anio cumple
	*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el dia de su cumple: ");
        int elDia = sc.nextInt();
        System.out.print("Ingrese el mes de su cumple: ");
        int elMes = sc.nextInt();
        LocalDate elCumple = LocalDate.of(2021,elMes,elDia); //fecha de cumple
        int elDiaDelAnio = elCumple.getDayOfYear();
        System.out.printf("Tu cumpleaños cae el dia %d de este año.",elDiaDelAnio);


    }
}
