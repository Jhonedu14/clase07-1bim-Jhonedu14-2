/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Proyecto01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String mensaje_final= "";   
        String nombre;
        int dias;
        double costo_dia;
        double valor_cancelar;

        int contador = 1;

        while (contador <= 5) {
            System.out.println("Ingrese el nombre del empleado:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese los días trabajados:");
            dias = entrada.nextInt();

            System.out.println("Ingrese el valor de costo por día:");
            costo_dia = entrada.nextDouble();
            
            entrada.nextLine(); 

            valor_cancelar = dias * costo_dia;
            
            mensaje_final
                    = String.format("%sNombre: días %d, costo por día $%.2f, "
                            + "total $%.2fn", nombre, dias, costo_dia,
                            valor_cancelar , mensaje_final);
                            

            contador= contador+1;
        }

        System.out.printf("\n mensaje_final ");
    }
}
