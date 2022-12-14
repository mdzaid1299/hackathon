package com.jap;

public class SortingCities {
    public static void main(String[] args) {
        String[] cityName = {"Bern", "Lucerne", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch" };
        int[] distance = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        String[] toUpperCase = upperCase(cityName);
        for (int i = 0; i < toUpperCase.length; i++) {
            System.out.println(toUpperCase[i]);
        }
    }

    public static String[] upperCase(String[] cityName) { // The Cities are not given in same case, convert all the cities in uppercase.
        String[] newTemp = new String[cityName.length];
        if (cityName.length == 0) {
            return null;
        }
        for (int i = 0; i < cityName.length; i++) {
            newTemp[i] = cityName[i].toUpperCase();
        }
        return newTemp;
    }

    //   Find the city which is 52 kms from Zurich
    public static String[] findCity(String[] distance, String[] cityName) {
        int temp = 52
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] == temp) {
              cityName[i]=distance[i];
            }
        }
        return cityName;
    }

    // Find the city which is greater than or equal to 270 kms from Zurich.
    public void greatCity(int[] distance, String[] city) {
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] == 270) {
                return
            }
        }
    }
}
