package com.wich0d.conversor.principal;

import com.wich0d.conversor.API.Conversion;
import com.wich0d.conversor.API.Divisa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Conversion conversion = new Conversion();

        var opc = 0;
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
        }

    }
}