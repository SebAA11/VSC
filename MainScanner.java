
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);
        System.out.println("Ingrese el salario sin ajuste: ");
        float salarioActual = sal.nextFloat();
        System.out.println("Ingrese el porcentaje del aumento(si es el 15% ingresar 0.15): ");
        float Aumento = sal.nextFloat();
        Code pruebaScanner = new Code (salarioActual, Aumento, 0);
        float salarioFinal = pruebaScanner.calcularSalario();
        System.out.println("El salario ajustado es igual a: "+salarioFinal);
        sal.close(); 
    }
}
