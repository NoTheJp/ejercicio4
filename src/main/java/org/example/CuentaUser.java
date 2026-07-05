package org.example;

abstract class CuentaUser {
    private String correo;
    private int meses;
    private PlanSuscripcion plan;

    public CuentaUser (String Correo,  int Meses, PlanSuscripcion Plan){
        this.correo = Correo;
        this.meses = Meses;
        this.plan = Plan;
    }


    public double obtenerTotalAPagar(){
        return this.plan.calcularCosto(this.meses);
    }

}

