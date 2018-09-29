public class Convert {
    Convert(){
    }

    double toUSD(double value, String valueName){
        if (valueName.equals("UAH")) return value/28;
        else if (valueName.equals("EUR")) return value*1.17;
        else if (valueName.equals("RUB")) return value/65.84;
        else if (valueName.equals("USD")) return value;
        return 0;
    }

    double toEUR(double value, String valueName){
        if (valueName.equals("UAH")) return value/32.8;
        else if (valueName.equals("USD")) return value/1.17;
        else if (valueName.equals("RUB")) return value/77.08;
        return 0;
    }
}
