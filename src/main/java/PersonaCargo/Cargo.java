package PersonaCargo;

public class Cargo {

    private String nombreCargo;
    private double salarioMensual;

    public Cargo(String nombreCargo, double salarioMensual) {
        this.nombreCargo = nombreCargo;
        this.salarioMensual = salarioMensual;

    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return "Cargo{" + "nombreCargo=" + nombreCargo + ", salarioMensual=" + salarioMensual + '}';
    }

}
