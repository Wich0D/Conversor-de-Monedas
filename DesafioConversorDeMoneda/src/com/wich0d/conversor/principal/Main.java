package com.wich0d.conversor.principal;

import com.wich0d.conversor.API.BuscadorDivisas;
import com.wich0d.conversor.API.Conversor;
import com.wich0d.conversor.API.Divisa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        BuscadorDivisas buscadorDivisas = new BuscadorDivisas();
        Conversor conversor = new Conversor();

        int opc = 0;
        double cantidad = 0.00;
        Divisa divisa = null;
        while (opc != 7) {
            System.out.println("""
                    =============================================
                    Bienvendio al conversor de Monedas
                                    
                    1) Dólar            -> Peso Argentino
                    2) Peso Argentino   -> Dólar
                    3) Dólar            -> Real Brasileño
                    4) Real Brasileño   -> Dólar
                    5) Dólar            -> Peso Colombiano
                    6) Peso Colombiano  -> Dólar
                    7) Salir
                                    
                    Selecciona una opción:
                                    
                    """);
            opc = lectura.nextInt();
            if (opc != 7){
                System.out.println("Ingresa la cantidad que deseas convertir");
                cantidad = lectura.nextDouble();
            }

            switch (opc){
                case 1:
                    divisa = buscadorDivisas.buscar("USD");
                    conversor.convertir(divisa,cantidad, "ARS");
                    break;
                case 2:
                    divisa = buscadorDivisas.buscar("ARS");
                    conversor.convertir(divisa,cantidad, "USD");
                    break;
                case 3:
                    divisa = buscadorDivisas.buscar("USD");
                    conversor.convertir(divisa,cantidad, "BRL");
                    break;
                case 4:
                    divisa = buscadorDivisas.buscar("BRL");
                    conversor.convertir(divisa,cantidad, "USD");
                    break;
                case 5:
                    divisa = buscadorDivisas.buscar("USD");
                    conversor.convertir(divisa,cantidad, "COP");
                    break;
                case 6:
                    divisa = buscadorDivisas.buscar("COP");
                    conversor.convertir(divisa,cantidad, "USD");
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    break;
            }

        }

    }
}