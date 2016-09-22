package practica4;

// Cada archivo .java contiene una clase pública, con el mismo nombre del archivo.
public class Ejemplo {

    // Un programa debe tener un método 'main' como punto de entrada
    public static void main(String[] args) {
        
        Empleado emp = new Empleado(0);
        Gerente gerente = new Gerente(0);
        Contador contador = new Contador(0);
       
        float salarioBase=100;
        
        emp.setEdad(23);
        emp.setSalario(salarioBase);
        gerente.setSalario(salarioBase);
        contador.setSalario(salarioBase);
        
        //System.out.println(emp.getEdad());
        System.out.println("salario de empleado: "+emp.getSalario());
        System.out.println("salario de contador: "+ ((emp.getSalario())*35/100+contador.getSalario()));
        System.out.println("salario de gerente : "+ ((emp.getSalario())*50/100+gerente.getSalario()));
        
    }
}
