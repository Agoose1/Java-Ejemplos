package practica4;

public class Gerente extends Empleado {

    private float SalarioGerente;

    public Gerente(float salario) {
        super(salario);
        SalarioGerente = 0;
    }

    public void setSalarioGerente(float SalarioGerente) {
        this.SalarioGerente = SalarioGerente;
    }

    public float getSalarioGerente() {
        return SalarioGerente;
    }

}
