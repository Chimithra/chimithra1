package com.company;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeProgramPractice {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Current Date & Time : "+d);
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Local Date : "+ld);
        System.out.println("Local Time : "+lt);
        System.out.println("Local Date & Time : "+ldt);
        LocalDate d1 = LocalDate.of(2022,9,4);
        LocalDate d2 = LocalDate.of(2022, Month.SEPTEMBER,4);
        System.out.println(d1 + "," + d2);
        DateTimeFormatter d3 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String std = d1.format(d3);
        System.out.println(std);
        LocalDate parsedt = LocalDate.parse(std,d3);
        System.out.println(parsedt);
        ZonedDateTime d4 = ZonedDateTime.now();
        System.out.println("I am ZonedDateTime : "+d4);
        ZonedDateTime d5 = LocalDateTime.now().atZone(ZoneId.of("CET"));
        System.out.println(d5);
        /*for(String ZoneId : ZoneId.getAvailableZoneIds()){
            System.out.println("Zone Id : "+ZoneId);
        }*/
    }
}
