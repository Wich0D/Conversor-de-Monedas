package com.wich0d.conversor.API;

public class Conversor {
    public void convertir(Divisa divisa,double cantidad, String divisaConvertida){
        Double valorDivisaNueva = 0.00;
        switch (divisaConvertida){
            case "ARS":
                valorDivisaNueva = divisa.conversion_rates().ARS();
                break;
            case "BRL":
                valorDivisaNueva = divisa.conversion_rates().BRL();
                break;
            case "COP":
                valorDivisaNueva = divisa.conversion_rates().COP();
                break;
            case "USD":
                valorDivisaNueva = divisa.conversion_rates().USD();
                break;

        }
        System.out.println(cantidad +" [ "+divisa.base_code()+" ] equivale a  "+valorDivisaNueva*cantidad
                + " [ "+divisaConvertida+" ]");
    }
}
