package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("CLASE ANEMICA");
        var tiempoA = new TiempoAnemico(LocalDate.now());
        System.out.println("Formato largo: " + tiempoA.formatoLargo());
        System.out.println("Formato corto: " + tiempoA.formatoCorto());

        System.out.println("CLASE NO ANEMICA");

        var tiempoNoA = new TiempoNoAnemico();
        System.out.println("Formato largo: " + tiempoNoA.formatoLargo());
        System.out.println("Formato corto: " + tiempoNoA.formatoCorto());
    }
}