package org.example;
import java.util.ArrayList;

public class PlataformaStreaming {

    private ArrayList<CuentaUsuario> cuentas;

    public PlataformaStreaming() {

        cuentas = new ArrayList<>();

    }

    public void registrarUsuario(CuentaUsuario cuenta) {

        cuentas.add(cuenta);

    }

    public void imprimirReporte() {

        double total = 0;

        System.out.println("\n========== REPORTE ==========\n");

        for (CuentaUsuario cuenta : cuentas) {

            double pago = cuenta.obtenerTotalAPagar();

            total += pago;

            System.out.println("Correo : " + cuenta.getCorreoElectronico());
            System.out.println("Plan   : " + cuenta.getPlan().getNombrePlan());
            System.out.println("Meses  : " + cuenta.getMesesActivo());
            System.out.println("Total  : $" + pago);



        }

        System.out.println("TOTAL RECAUDADO: $" + total);

    }

}