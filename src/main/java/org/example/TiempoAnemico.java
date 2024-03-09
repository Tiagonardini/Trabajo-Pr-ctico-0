package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public record TiempoAnemico(LocalDate fecha) {

    public String formatoLargo (){
        return fecha.format(DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy"));
    }
    public String formatoCorto (){
        return fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
