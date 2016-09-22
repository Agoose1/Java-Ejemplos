package practica4;

public class Contador extends Empleado {

    private float SalarioContador;

    public Contador(float salario) {
        super(salario);
        SalarioContador = 0;
    }

    public void setSalarioContador(float SalarioContador) {
        this.SalarioContador = SalarioContador;
    }

    public float getSalarioContador() {
        return SalarioContador;
    }
}
