package org.example;

import java.util.ArrayList;

public class PlataformaStreaming {
    private ArrayList<CuentaUser> Corteos;

    public PlataformaStreaming() {
        this.Corteos = new ArrayList<>();
    }

    public void registrarUsuario(CuentaUser nuevo) {
        this.Corteos.add(nuevo);
    }

    public void reporte(){

        double gantotal = 0;
        for (int i = 0; i < this.Corteos.size(); i++) {
            CuentaUser nuevo = this.Corteos.get(i);
            double totalcuenta = nuevo.obtenerTotalAPagar();

            gantotal += totalcuenta;
            System.out.println("Correo " + nuevo.getCorreo());
            System.out.println("Meses " + nuevo.getMeses());
            System.out.println("Plan " + nuevo.getPlan()); //creo q aqui van a salir cosas raras, así q ahí rifate un get o algo xfa
            System.out.println("Total usuario " + totalcuenta);
        }
        System.out.println("Total recaudado: " + gantotal);
    }
}
