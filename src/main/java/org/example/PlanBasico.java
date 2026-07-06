public class PlanBasico implements PlanSuscripcion {

    @Override
    public double calcularCosto(int meses) {
        return meses * 5.0;
    }

    @Override
    public String getNombrePlan() {
        return "Plan Básico";
    }

}