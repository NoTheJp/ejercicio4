package org.example;

public class PlanPremiun implements PlanSuscripcion {

    @Override
    public double calcularCosto(int meses){
        return (meses * 14.0) + 3.0;

    }

    @Override
    public String getNombrePlan() {
        return "plan premiun";
    }
}
