package entities;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhatDayWasBorn {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();

        ZoneId currentZone = ZoneId.systemDefault();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        System.out.println("Data e Hora Atuais (" + currentZone + "): " + formattedTime);

        List<List<String>> birthPlacesByDate = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma data (dd/MM/yyyy HH:mm:ss): ");
        String userInput = scanner.nextLine();

        LocalDateTime userDateTime = LocalDateTime.parse(userInput, formatter);

        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            ZonedDateTime zonedDateTime = userDateTime.atZone(currentZone).withZoneSameInstant(zoneId);
            String convertedTime = zonedDateTime.format(formatter);

            String convertedDate = convertedTime.split(" ")[0];

            List<String> birthPlaces = null;
            for (List<String> entry : birthPlacesByDate) {
                if (entry.get(0).equals(convertedDate)) {
                    birthPlaces = entry;
                    break;
                }
            }

            if (birthPlaces == null) {
                birthPlaces = new ArrayList<>();
                birthPlaces.add(convertedDate);
                birthPlacesByDate.add(birthPlaces);
            }

            birthPlaces.add(availableZoneId);
        }

        System.out.println("\nDatas e Locais de Nascimento:");
        for (List<String> entry : birthPlacesByDate) {
            System.out.println("Data: " + entry.get(0));
            for (int i = 1; i < entry.size(); i++) {
                System.out.println("- " + entry.get(i));
            }
            System.out.println();
        }
    }
}