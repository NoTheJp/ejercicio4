package org.example;
import java.util.ArrayList;

public class PlataformaStreaming {

        private ArrayList<CuentaUsuario> cuentas;
        public PlataformaStreaming(){
            cuentas = new ArrayList<>();
        }
        public void registrarUsuario(CuentaUsuario cuenta){
            cuentas.add(cuenta);
        }

        public void imprimirReporte(){
            double total = 0;

            System.out.println("reporte");
            for(CuentaUsuario cuenta : cuentas){
                double pago = cuenta.obtenerTotalApagar();

                total += pago;

                System.out.println("correo :" + cuenta.getCorreoElectronico());
                System.out.println("plan   :" + cuenta.getPlan().getNombrePlan());
                System.out.println("meses  :" + cuenta.getMesesActivo());
                System.out.println("total  : $" + pago );
            }
            System.out.println("total recaudado : $" + total);
        }
}
