package cola;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Cola {

    /**
     * @param args the command line arguments
     */
   
        
  public static void Menu(){
        System.out.println("\n\n\t\t\t=========Menú Manejo Cola=============");
        System.out.println("\t\t\t=                                    =");
        System.out.println("\t\t\t= 1- Insertar elemento               =");
        System.out.println("\t\t\t= 2- Eliminar elemento               =");
        System.out.println("\t\t\t= 3- Buscar elemento                 =");
        System.out.println("\t\t\t= 4- Imprimir                        =");
        System.out.println("\t\t\t= 5- Imprimir primer elemento        =");
        System.out.println("\t\t\t= 6- Salir                           =");
        System.out.println("\t\t\t======================================");
        System.out.print("\t\t\tIngrese Opcion: ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Nodo Cola=null;
        Scanner teclado=new Scanner(System.in);
        int opcion;
        String dato;
        
        do{
            Menu();
            opcion=teclado.nextInt();
            switch(opcion){
			case 1: System.out.println("Escriba el dato a guardar en la cola: ");
                                dato=teclado.nextLine();
                                dato=teclado.nextLine();
                                Cola=Nodo.insertarCola(Cola, dato);
			        break;
			case 2: Cola=Nodo.eliminarCola(Cola);
			        break;
                                
                                
			case 3: System.out.println("Escriba el dato a Buscar en la cola: ");
                                dato=teclado.nextLine();
                                dato=teclado.nextLine();
                                Nodo.buscarCola(Cola, dato);
			        break;
                                
                                
			case 4:Nodo.imprimirCola(Cola);
			        break;
                                
                                
			case 5: System.out.println("Se imprimio el primer elemento");
                                Nodo.imprimirColaInicio(Cola);
			        break;
                                
                                
                        case 6: 
			        break;
                            }
        }while(opcion!=6);
        
        
    
    }
}