class Scales {

    static String cel2Fah(double temp) {
        double celsFahr = (temp * 1.8) + 32;
        return String.format("Celsius to Fahrenheit: %4.2f", celsFahr);
    }

    static String cel2Kel(double temp) {
        double celsKel = temp + 273.15;
        return String.format("Celsius to Kelvin: %4.2f", celsKel);
    }

    static String fah2Cel(double temp) {
        double fahrCel = (temp - 32) / 1.8;
        return String.format("Fahrenheit to Celsius: %4.2f", fahrCel);
    }

    static String fah2Kel(double temp){
        double fahrKel = (temp + 459.67) / 1.8;
        return String.format("Fahrenheit to Kelvin: %4.2f", fahrKel);
    }

    static String kel2Cel(double temp) {
        double kelvCel = temp - 273.15;
        return String.format("Kelvin to Celsius: %4.2f", kelvCel);
    }

    static String kel2Fah(double temp) {
        double kelvFah = (temp * 1.8) - 459.67;
       return String.format("Kelvin to Fahrenheit: %4.2f", kelvFah);

    }
}