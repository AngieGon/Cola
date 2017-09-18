package cola;


import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Nodo {
   
    String dato;
    Nodo enlace;

    public Nodo() {
        //Sobrecarga del constructor, para no recibir parámetros
        dato = "";
        enlace = null;
    }

    public Nodo(String dato) {
        //Sobrecarga del constructor, para recibir parámetros
        this.dato = dato;
        enlace = null;
    }

    public static void imprimirCola(Nodo Cola) {
        Nodo temporal = Cola;

        if (Nodo.colaVacia(temporal)) {
            System.out.println("La Cola no contiente elementos..");
            JOptionPane.showMessageDialog(null,"La Cola no contiente elementos.." );
        } else {
            int numeroElemento = 0;
            while (temporal != null) {
                System.out.printf("\nImprimiento elemento Nro. %d: %s \n", numeroElemento, temporal.dato);
                Principal.TXTimprimirprimerelemeto.setText(Principal.TXTimprimirprimerelemeto.getText() + temporal.dato + "-");
                numeroElemento++;
                temporal = temporal.enlace;
            }
        }
    }
    
    public static void imprimirColaInicio(Nodo Cola) {
        Nodo temporal = Cola;
        Nodo primero = temporal;

        if (Nodo.colaVacia(temporal)) {
            System.out.println("La Cola no contiente elementos..");
            JOptionPane.showMessageDialog(null,"La Cola no contiente elementos.." );
        } else {
            int numeroElemento = 0;
            while (temporal != null) {
                if(temporal == primero){
                System.out.printf("\nImprimiento el inicio elemento Nro. %d: %s \n", numeroElemento, temporal.dato);
                Principal.TXTimprimirprimerelemento.setText(temporal.dato);
                }
                numeroElemento++;
                temporal = temporal.enlace;
            }
        }
    }
    

    

    public static void buscarCola(Nodo Cola, String datoBusqueda) {
        Nodo temporal = Cola;
        if (Nodo.colaVacia(temporal)) {
            System.out.println("La Cola no contiente elementos..");
            JOptionPane.showMessageDialog(null,"La Cola no contiente elementos.." );
        } else {
            int numeroElemento = 0;
            while (temporal != null) {
                if (datoBusqueda.equals(temporal.dato)) {
                System.out.println("El elemento si se encuentra en la cola.");
                JOptionPane.showMessageDialog(null,"El elemento si se encuentra en la cola." );
                 
                    break;
                }else{
                          System.out.println("El elemento" + datoBusqueda.toUpperCase() +" no se encuentra en la cola."); 
                           JOptionPane.showMessageDialog(null,"El elemento " + datoBusqueda.toUpperCase() + " no se encuentra en la cola." );
                          break;
                            }
                }
                numeroElemento++;
                temporal = temporal.enlace;
               
            }
        }



    public static Nodo insertarCola(Nodo Cola, String dato) {

        Nodo nodoNuevo = new Nodo(dato);
        if (Nodo.colaVacia(Cola)) {
            Cola = nodoNuevo;
        } else {
            Nodo anterior = new Nodo();
            Nodo temporal = Cola;
            while (temporal != null) {
                anterior = temporal;
                temporal = temporal.enlace;
                
            }
            System.out.println("Elemento ingresado");
            anterior.enlace = nodoNuevo;
        }
        return Cola;
    }

    public static Nodo eliminarCola(Nodo Cola) {
        if (Nodo.colaVacia(Cola)) {
            System.out.println("La pila no contiente elementos..");
            JOptionPane.showMessageDialog(null,"La Cola no contiente elementos.." );
            return Cola;
        }
        System.out.println("Se ha eliminado del tope de la cola");
        JOptionPane.showMessageDialog(null,"Se ha eliminado del tope de la cola" );
        Cola = Cola.enlace;
        return Cola;
    }

    public static boolean colaVacia(Nodo Cola) {
        if (Cola == null) {
            return true;
        }
        return false;
    }
}
