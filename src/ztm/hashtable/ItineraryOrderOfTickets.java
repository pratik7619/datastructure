package ztm.hashtable;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

public class ItineraryOrderOfTickets {
    //?Pratik Sherdiwala (Codelytics)

    static void convertInItineraryOrder(Map<String, String> flightsMap) {

    }

    public static void main(String[] args) {

        Map<String, String> flightsMap = new TreeMap<>();
        flightsMap.put("Chennai", "Bangalore");
        flightsMap.put("Bombay", "Delhi");
        flightsMap.put("Goa", "Chennai");
        flightsMap.put("Delhi", "Goa");

        System.out.println(flightsMap);

        AtomicReference<String> lastVisitedDestination = new AtomicReference<>("");

        flightsMap.forEach((destinationOne, destinationTwo) -> {
            if (lastVisitedDestination.get().isEmpty()) {
                System.out.println(destinationOne + "->" + destinationTwo);
            } else {
                if (flightsMap.containsKey(lastVisitedDestination.get())) {
                    System.out.println(lastVisitedDestination + "->" + flightsMap.get(lastVisitedDestination.get()));
                }
            }
            lastVisitedDestination.set(destinationTwo);
        });
    }
}
