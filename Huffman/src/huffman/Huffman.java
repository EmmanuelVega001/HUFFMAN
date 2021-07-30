/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;

import javax.swing.JOptionPane;

/**
 *
 * @author asael
 */
public class Huffman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Codificador demo=new Codificador();
        
        
        String mensaje = JOptionPane.showInputDialog(null, "Caracteres admitidos \nA\nE\nI\nO\nC\nR\nB\nP\nU");
        mensaje = mensaje.toUpperCase();
        char [] mensajeChar = mensaje.toCharArray();
        System.out.println("Palabra ingresada: " + mensaje);
        System.out.print("Codificacion de la palabra " + mensaje + " es: ");
        for (int i = 0; i < mensajeChar.length; i++){
            
            demo.buscarCamino(mensajeChar[i]);
        }

        String buscar="11111010110001110110010001000";//probando que todos los nodos esten bien por eso el numerote
        demo.decodificar(buscar);
    }
    
}
