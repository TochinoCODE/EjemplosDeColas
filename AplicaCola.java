//Anthony joel Carhuachin Calixto
package clases;

import java.util.Scanner;

public class AplicaCola {
    static CColas cola;
    static Scanner entrada = new Scanner (System.in);
    public static void main (String[] args){
        menu();
    }
    
    static void crearCola(){
        int tam ;
        System.out.print("Ingres Tamaño de la Cola : ");
        tam = entrada.nextInt();
        cola = new CColas(tam);
        System.out.println("Cola creada ... \n");
    }
    
    public static void menu(){
        int opcion;
        
        do {
            System.out.println("\n========================");
            System.out.println("|       Menu del Día :v |");
            System.out.println("========================| ");
            System.out.println("| [1] Crear Cola        |");
            System.out.println("========================");
            System.out.println("| [2] Ingresar Datos    |");
            System.out.println("| [3] Mostrar Datos     |");
            System.out.println("| [4] Eliminar Datos    |");
            System.out.println("| [5] Vaciar Cola       |");
            System.out.println("========================");
            System.out.println("| [0] Exit              |");
            System.out.println("========================");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            System.out.println();
            switch (opcion){
                case 1: 
                    crearCola();
                    break;
                case 2: 
                    cola.insertarCola();
                    break;
                case 3:
                    cola.mostrarCola();
                    break;
                case 4:
                    cola.eliminarCola();
                    break;
                case 5:
                    cola.vaciarCola();
                    break;
                    
                    
                case 0:
                    System.exit(0);
                    break;
            }
        }while(opcion != 0);
    }
}
