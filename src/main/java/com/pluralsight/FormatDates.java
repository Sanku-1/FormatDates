package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
//        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(today.getMonthValue() + "/" + today.getDayOfMonth() + "/" + today.getYear());
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");


    }
}
