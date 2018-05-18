/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



/**
 *
 * @author LN710Q
 */
public final class Interfaz extends javax.swing.JFrame{

    JLabel lblNombre;
    JTextField txtNombre;
    JPanel panel;
    
    JButton numeros[];
    String lblnumeros []={"7","8","9","4","5","6","1","2","3"};
    
    
    public Interfaz()
    {
        super("Calculadora");
        initComponets();
    }
    
    public void initComponets()
    {
        setSize(500, 500); //tamaño de la ventana
       setResizable(false); // indicar que no se ajustara 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para que cierre la ventana
        
        panel = new JPanel(); //panel donde colocara todos los elementos
        panel.setLayout(null); // le indicamos el tipo de layout que colocara
        this.add(panel); // agregamos el panel al layout
        
        /*lblNombre = new JLabel("CLick aca");  //creamos un boton 
        lblNombre.setBounds(0, 0, 100, 40); // le indicamos su tamaño  y posiciones que usara
        panel.add(lblNombre); // agragamos el elemeto al panel*/
        numeros = new JButton[9];
        int l=0;
        for(int i=0 ; i<3; i++)
        {
           for(int j=0 ; j<3 ; j++)
           {
                numeros[j] = new JButton(lblnumeros[l]);
                numeros[j].setBounds((j*60)+10,(i*60)+60,60,40);
                panel.add(numeros[j]);
                l++;
           }
           
        }
        
    }
}
