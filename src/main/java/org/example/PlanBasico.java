package org.example;

public class PlanBasico implements PlanSuscripcion{

    @Override
    public double calcularCosto(int meses) {
        return meses * 5.0;
    }
    @override
    public String getNombrePlan(){
        return "plan Basico";
    }
}
