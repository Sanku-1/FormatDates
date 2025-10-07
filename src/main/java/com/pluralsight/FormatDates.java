package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        ZonedDateTime todayZoned = ZonedDateTime.now();
        ZonedDateTime todayGMT = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter myFormatObj0 = DateTimeFormatter.ofPattern("HH:mma z");
        DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(today.getMonthValue() + "/" + today.getDayOfMonth() + "/" + today.getYear());
        System.out.println(today.getYear() + "-" + today.getMonthValue() + "-" + today.getDayOfMonth());
        System.out.println(today.getMonth() + " " + today.getDayOfMonth() + ", " + today.getYear());
        System.out.println(today.getDayOfWeek() + ", " + today.getMonth() + " " + today.getDayOfMonth() + ", " + today.getYear() + "  " + todayGMT.format(myFormatObj0));

        System.out.println("CHALLENGE");
        System.out.println(todayZoned.format(myFormatObj0) + " on " + today.format(myFormatObj1));


//        System.out.println("");
//        System.out.println("");
//        System.out.println("");


    }
}
