package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner teclado = new Scanner (System.in);
    static void main() {
        System.out.println("estoy en tu linea nebbercracker ");
        String correo;
        int meses;
        int opc;
        PlataformaStreaming reporte = new PlataformaStreaming();
        do{
            texto();
            opc = teclado.nextInt();
            switch (opc){

                case 1:
                    System.out.println("Registre su usuario");
                    correo = teclado.next();
                    /* e we aquí te toca pedir los meses y hacer el switch de los 3 planes
                    Luego, crea la cuenta y regístrala
                    sale?
                    */
                break;

                case 2:
                    reporte.reporte();
                break;

                case 0:
                    System.out.println("Saliendo del sistema");
                break;

                default:
                    System.out.println("pepito tenía un clavito");
                break;
            }
        }while(opc != 0);
    }
    public static void texto(){
        System.out.println("""
                SELECCIONE UNA OPCION
                1.- Registrar usuario
                2.- Ver reporte
                0.- Salir
                """);
        System.out.println("holaa");
    }
}
