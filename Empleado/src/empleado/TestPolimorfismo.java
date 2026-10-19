
package empleado;


public class TestPolimorfismo {
    public static void main(String[] args){
        Empleado[] nomina = new Empleado[2];
        nomina[0] = new EmpleadoFijo("Fabricio Ruiz Diaz", 3500000);
         nomina[1] = new EmpleadoPorHora("Roberto Acosta", 40, 50000);
         
         for (Empleado e : nomina){
             System.out.println(e.getNombre() + " -> Sueldo: Gs. " + e.calcularSueldo());
         }
    }
}
