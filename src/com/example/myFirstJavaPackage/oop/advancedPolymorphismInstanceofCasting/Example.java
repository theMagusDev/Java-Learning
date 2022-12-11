package com.example.myFirstJavaPackage.oop.advancedPolymorphismInstanceofCasting;

public class Example {
}

class Country {

    public static void main(String[] args) {

        Country countryRussia = new Russia();
        Country countryUSA = new USA();
        Country countryChina = new China();
        Country[] countries = {countryChina, countryUSA, countryRussia};

        for(Country country : countries) {
            if (country instanceof Russia) {
                ((Russia)country).bear();
            }
        }
    }
}

class Russia extends Country {

    void bear() {
        System.out.println("Greetings from russian bear!");
    }
}

class USA extends Country {}

class China extends Country {}
