package main.java.PhysicalAttributes;

import java.util.Random;

public enum Race {
    HUMAN,
    ELF,
    HALF_ELF,
    DWARF,
    HALFLING,
    GNOME;

    public static Race getRandomRace() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    //ToDo: Correct All Age, Weight, and Height values
    public int getRandomAge(Race race, Gender gender) {
        int max = 0;
        if (gender == Gender.Female) {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = 750;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            return new Random().nextInt(max - min + 1) + min;
        } else {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = Integer.MAX_VALUE;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            return new Random().nextInt(max - min + 1) + min;
        }
    }

    public int getRandomHeight(Race race, Gender gender) {
        int max = 0;
        int min = 0;
        if (gender == Gender.Female) {
            switch (race) {
                case HUMAN:
                    max = 76;
                    min = 50;
                    break;
                case ELF:
                    max = 74;
                    min = 48;
                    break;
                case HALF_ELF:
                    max = 75;
                    min = 49;
                    break;
                case DWARF:
                    max = 50;
                    min = 42;
                    break;
                case HALFLING:
                    max = 25;
                    min = 17;
                    break;
                case GNOME:
                    max = 46;
                    min = 34;
                    break;
            }

        } else {
            switch (race) {
                case HUMAN:
                    max = 78;
                    min = 52;
                    break;
                case ELF:
                    max = 76;
                    min = 50;
                    break;
                case HALF_ELF:
                    max = 77;
                    min = 51;
                    break;
                case DWARF:
                    max = 52;
                    min = 44;
                    break;
                case HALFLING:
                    max = 27;
                    min = 19;
                    break;
                case GNOME:
                    max = 48;
                    min = 36;
                    break;
            }

        }
        return new Random().nextInt(max - min) + min;
    }

    public double getRandomWeight(Race race, Gender gender) {
        int max = 0;
        int min = 0;
        if (gender == Gender.Female) {
            switch (race) {
                case HUMAN:
                    min = 110;
                    max = 220;
                    break;
                case ELF:
                    min = 100;
                    max = 200;
                    break;
                case HALF_ELF:
                    min = 105;
                    max = 210;
                    break;
                case DWARF:
                    min = 115;
                    max = 230;
                    break;
                case HALFLING:
                    min = 35;
                    max = 50;
                    break;
                case GNOME:
                    min = 30;
                    max = 45;
                    break;
            }

        } else {
            switch (race) {
                case HUMAN:
                    min = 120;
                    max = 240;
                    break;
                case ELF:
                    min = 110;
                    max = 220;
                    break;
                case HALF_ELF:
                    min = 115;
                    max = 230;
                    break;
                case DWARF:
                    min = 125;
                    max = 250;
                    break;
                case HALFLING:
                    min = 40;
                    max = 60;
                    break;
                case GNOME:
                    min = 35;
                    max = 50;
                    break;
            }
        }
        return new Random().nextInt(max - min) + min;
    }
}


