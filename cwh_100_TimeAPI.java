package com.company;

import java.time.*;

public class cwh_100_TimeAPI {
    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        Instant i = Instant.now();
        System.out.println(i);

        ZonedDateTime z = ZonedDateTime.now();
        System.out.println(z);
    }
}
