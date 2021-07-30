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
        

        Codificador demo = new Codificador();
        int ciclo = 1;
        while (ciclo != 2) {
          try{
           int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu \n1.-Codificacion\n2.-Decodificacion\n3.-Byebye"));
            switch (menu) {
                case 1:
                    String mensaje = JOptionPane.showInputDialog(null, "Caracteres admitidos \nA\nE\nI\nO\nC\nR\nB\nP\nU");
                    mensaje = mensaje.toUpperCase();
                    char[] mensajeChar = mensaje.toCharArray();
                    System.out.println("Palabra ingresada: " + mensaje);
                    System.out.print("Codificacion de la palabra " + mensaje + " es: ");
                    for (int i = 0; i < mensajeChar.length; i++) {

                        demo.buscarCamino(mensajeChar[i]);
                    }

                    String buscar = "11111010110001110110010001000";//probando que todos los nodos esten bien por eso el numerote
                    demo.decodificar(buscar);
                break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Aun no IMplementado");
                    break;
                case 3:
                    ciclo=2;
                    break;
            }
            
          }catch(Exception e){
              JOptionPane.showMessageDialog(null,"Introduce algo correcto");
          }
        }

    }
}
