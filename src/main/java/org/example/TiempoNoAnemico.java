package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public record TiempoNoAnemico (LocalDate tiempo) {
  public TiempoNoAnemico(){
      this(LocalDate.now());
  }

    public String formatoLargo() {
        return tiempo.format(DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy"));
    }

    public String formatoCorto() {
        return tiempo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}
