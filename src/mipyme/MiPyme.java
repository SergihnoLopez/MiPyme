/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mipyme;
import Vistas.Sistema;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager;

/**
 *
 * @authors Sergio, Brayan, Santiago, Andres
 */
public class MiPyme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");//ESTA LINEA DA EL ESTILO PARA LOS FORMULARIOS.
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e){
            
           
        }
        Sistema sistema=new Sistema();  //OBJETO DEL FORMULARIO 
        sistema.setExtendedState(MAXIMIZED_BOTH);//PARA ABRIR SIEMPRE EN VENTANA MAXIMIZADA
        sistema.setVisible(true);
       
        
    }
    
}
