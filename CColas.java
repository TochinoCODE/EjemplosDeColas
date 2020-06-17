//Anthony Joel Carhiuachin Calixto
package clases;

import java.util.Scanner;

public class CColas {
    static Scanner entrada = new Scanner(System.in);
    private int max;
    private int[] cola; //arrego cola
    private int frente; //variable inicial
    private int Final; //variable final el igual qeu tope
    
    //metodo constructura para inicializar la cola
    public CColas(){
        this.max = 10; //este es el valor que establesemos por defecto
        this.frente = 0; // iniciamos el frente de la cola
        this.Final = 0; // iniciamos el final de la cola
        this.cola =new int [this.max+1]; 
    }
    
    //sobrecargar el constructor
    public CColas(int max){
        this.max = max;
        this.frente = 0;
        this.Final = 0;
        this.cola =new int [this.max+1];
    }
    
    public boolean isColaLlena(){
        if(this.Final == this.max){
            return true;
        }else return false;
    }
    
    public boolean isColaVacia(){
        if(this.frente == this.Final){
            return true;
        }else return false;
    }
    
    public void mostrarCola(){
        if (this.isColaVacia()){
            System.out.println("La Cola Esta Vacia no hay Datos...");
        }else {
            System.out.println("Los eleemntos son : ");
            for (int i = frente+1; i< Final; i++){
                System.out.print(cola[i] + " <--");
            }
        }
    }
    
    public void eliminarCola(){
        if (this.frente == this.Final) System.out.println("La cola ya está vacia");
        else {
            for (int i = frente; i < Final - 1; i++){
                cola[i] = cola[i + 1];
            }
            System.out.println("Elemnto Eliminado...");
            Final--;
        }
    }
    
    public void vaciarCola() {
        frente = 0;
        Final = 0;
        System.out.println("Elementos Eliminados...");
    }
    
    public void insertarCola(){
    if (isColaLlena())  System.out.println("La pila ya está llena");
    else {
      int aux;
        System.out.print("Ingrese el elemento a Ingresar : ");
        aux = entrada.nextInt();
        this.cola[Final] = aux;
        this.Final++;
    }
    }
}
