package org.aplas.basicappx;
public class Temperature {
    private double celcius;

    public Temperature(){
        this.celcius = 0;
    }
    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public void setFahrenheit(double celcius) {
        this.celcius = (celcius - 32) / 9 * 5;
    }

    public void setKelvins(double celcius) {
        this.celcius = celcius - 273.15;
    }


    public double getCelcius() {
        return celcius;
    }

    public double getFahrenheit() {
        return celcius * 9 / 5 + 32;
    }

    public double getKelvins() {
        return celcius + 273.15;
    }

    public double convert(String oriUnit, String convUnit, double value){
        if (oriUnit.equals("°C")){
            setCelcius(value);
        } else if (oriUnit.equals("°F")){
            setFahrenheit(value);
        } else if (oriUnit.equals("K")){
            setKelvins(value);
        }
        if (convUnit.equals("°C")){
            return getCelcius();
        } else if (convUnit.equals("°F")){
            return getFahrenheit();
        } else if (convUnit.equals("K")){
            return getKelvins();
        }
        return value;
    }
}









