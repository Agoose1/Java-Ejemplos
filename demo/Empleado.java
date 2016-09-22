
package practica4;


public class Empleado {
	private String nombre;
	private String apellidos;
	private int edad;
	float salario;
        private String apellidoPaterno;
        private String apellidoMaterno;

	public Empleado(float salario) {

	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;}

    public void setEdad(int edad) {
        if(edad > 0 && edad <= 100) {
            this.edad = edad;}
    }

    public float getSalario() {
        return salario;}

    public void setSalario(float salario) {    
    	this.salario = salario;}
    
}
