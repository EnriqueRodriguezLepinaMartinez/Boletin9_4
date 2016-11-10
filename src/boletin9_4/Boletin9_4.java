/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Boletin9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int num = Integer.parseInt(JOptionPane.showInputDialog("Introuzca un numero:"));
          
        if(num==0){
            System.exit(0);
        }
          else {
            for(int i=0; i<11; i++){
            System.out.println( num + " X " + (i) + " = " + (num*i));
                    }
        
        }
    }
    
}
