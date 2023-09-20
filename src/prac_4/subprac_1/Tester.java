package prac_4.subprac_1;

import java.util.logging.Level;

public class Tester {
    public static String iLoveSummer(Season season) {
        switch (season) {
            case WINTER -> {
                return "Я люблю зиму";
            }
            case SPRING -> {
                return "Я люблю весну";
            }
            case SUMMER -> {
                return "Я люблю лето";
            }
            case AUTUMN -> {
                return "Я люблю осень";
            }
        }
        return "";
    }

    public static void printDescriptions() {
        for (Season season: Season.values()) {
            System.out.println(season.toString() + " " + season.getAvg_temperature() + " " + season.getDescription());
        }
    }

    public static void main(String[] args) {
        Season favorite_season = Season.SUMMER;
        printDescriptions();
    }
}
