package org.j6toj8.localization.datetime.localdate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate_05_Invalid {

  public static void main(String[] args) {
    // tag::code[]
    System.out.println(LocalDate.of(2019, Month.MAY, 33));
    // end::code[]
  }
}
