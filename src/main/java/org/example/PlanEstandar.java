package org.example;

public class PlanEstandar implements PlanSuscripcion{

    @Override
    public double calcularCosto(int meses) {
        return meses * 9.0;
    }

    @Override
    public String getNombrePlan() {
        return "plan estandar";
    }
}
