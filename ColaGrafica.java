package cola;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
    Nodo Cola = null;                     

    private void BTNinsertarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        if(TXTinsertar.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Ingrese un Dato");
        }else{
        String dato = TXTinsertar.getText();
        Cola = Nodo.insertarCola(Cola, dato);
        TXTinsertar.setText("");           
        JOptionPane.showMessageDialog(null,"Elemento ingresado");
        }
        
    }                                           

    private void BTNeliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Cola = Nodo.eliminarCola(Cola);
    }                                           

    private void BTNbuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(TXTbuscar.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Ingrese Dato a Buscar");
        }else{
        String dato = TXTbuscar.getText();
        Nodo.buscarCola(Cola, dato);
        TXTbuscar.setText("");  
        }
        
    }                                         

    private void BTNimprimirActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Nodo.imprimirCola(Cola);
    }                                           

    private void BTNsalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        dispose();
    }                                        

    private void BTNimprimirprimerelementoActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
        Nodo.imprimirColaInicio(Cola);
    } 