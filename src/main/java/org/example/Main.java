package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PlataformaStreaming plataforma = new PlataformaStreaming();

        int opcion;

        do {

            System.out.println("\n PLATAFORMA STREAMING ");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Mostrar reporte");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Correo electrónico: ");
                    String correo = sc.nextLine();

                    System.out.print("Meses contratados: ");
                    int meses = sc.nextInt();

                    System.out.println("\nSeleccione el plan");
                    System.out.println("1. Básico");
                    System.out.println("2. Estándar");
                    System.out.println("3. Premium");
                    System.out.print("Opción: ");

                    int plan = sc.nextInt();

                    PlanSuscripcion planSeleccionado;

                    switch (plan) {

                        case 1:
                            planSeleccionado = new PlanBasico();
                            break;

                        case 2:
                            planSeleccionado = new PlanEstandar();
                            break;

                        case 3:
                            planSeleccionado = new PlanPremiun();
                            break;

                        default:
                            System.out.println("Plan inválido.");
                            continue;

                    }

                    CuentaUsuario usuario =
                            new UsuarioStreaming(correo, meses, planSeleccionado);

                    plataforma.registrarUsuario(usuario);

                    System.out.println("\nUsuario registrado correctamente.");

                    break;

                case 2:

                    plataforma.imprimirReporte();

                    break;

                case 3:

                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println("Opción inválida.");

            }

        } while (opcion != 3);

    }

}