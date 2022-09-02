package astro;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

enum PlanetLabel {
    ATMAKARAM,
    AMATYAKARAK,
    BHATRAKARAK,
    MATRAKARAK,
    PUTRAKARAK,
    GYATIKARAK,
    DHARAKARAK
}

public class SortPlanetDegrees {
    //?Pratik Sherdiwala (Codelytics)
    double marsDegree = 8.2420;
    double mercuryDegree = 3.4119;
    double jupiterDegree = 11.5709;
    double saturnDegree = 6.1840;
    double venusDegree = 26.4425;
    double moonDegree = 13.1637;
    double sunDegree = 11.4019;

    SortPlanetDegrees() {}

    SortPlanetDegrees(
            double marsDegree,
            double mercuryDegree,
            double jupiterDegree,
            double saturnDegree,
            double venusDegree,
            double moonDegree,
            double sunDegree
    ) {
        this.jupiterDegree = jupiterDegree;
        this.saturnDegree = saturnDegree;
        this.marsDegree = marsDegree;
        this.mercuryDegree = mercuryDegree;
        this.moonDegree = moonDegree;
        this.venusDegree = venusDegree;
        this.sunDegree = sunDegree;
    }

    HashMap<Double, String> sortPlanetDegrees() {
        Map<String, Double> sortedPlanetDegrees = new TreeMap<>();
        sortedPlanetDegrees.put("Mars", marsDegree);
        sortedPlanetDegrees.put("Sun", sunDegree);
        sortedPlanetDegrees.put("Mercury", mercuryDegree);
        sortedPlanetDegrees.put("Saturn", saturnDegree);
        sortedPlanetDegrees.put("Moon", moonDegree);
        sortedPlanetDegrees.put("Venus", venusDegree);
        sortedPlanetDegrees.put("Jupiter", jupiterDegree);

        return sortHashMapByValues(sortedPlanetDegrees);
    }

    public LinkedHashMap<Double, String> sortHashMapByValues(
            Map<String, Double> passedMap
    ) {
        List<String> mapKeys = new ArrayList<>(passedMap.keySet());
        List<Double> mapValues = new ArrayList<>(passedMap.values());
        Collections.sort(mapValues);
        Collections.sort(mapKeys);

        LinkedHashMap<Double, String> sortedMap =
                new LinkedHashMap<>();

        for (double val : mapValues) {
            Iterator<String> keyIt = mapKeys.iterator();

            while (keyIt.hasNext()) {
                String key = keyIt.next();
                Double comp1 = passedMap.get(key);
                Double comp2 = val;

                if (comp1.equals(comp2)) {
                    keyIt.remove();
                    sortedMap.put(val, key);
                    break;
                }
            }
        }
        return sortedMap;
    }

    public static void main(String[] args) {

        SortPlanetDegrees deepakDegree = new SortPlanetDegrees(
                19.0203,
                3.3157,
                3.0824,
                16.2305,
                14.5258,
                26.4201,
                28.0640
        );

        SortPlanetDegrees radhaDegree = new SortPlanetDegrees(
                29.2255,
                12.0309,
                29.4208,
                3.0316,
                14.0810,
                12.0805,
                26.3035
        );

        HashMap<Double, String> map = new SortPlanetDegrees().sortPlanetDegrees();

        AtomicInteger count = new AtomicInteger();
        count.set(6);

        map.forEach((key, value) -> {
            System.out.println(PlanetLabel.values()[count.get()] + "\t\t\t" + key + "\t\t\t" + value);
            System.out.println("------------------------------------------");
            count.decrementAndGet();
        });
    }
}
