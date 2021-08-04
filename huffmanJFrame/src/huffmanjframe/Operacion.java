/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmanjframe;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author asael
 */
public class Operacion {
    char[] letras = {'C', 'I', 'O', 'E', 'P', 'R', 'B', 'U', 'A'};
    String[] camino = {"111", "110", "101", "100", "0111", "0110", "010", "001", "000"};
    LinkedList<String> prueba = new LinkedList();

    Nodos padre = new Nodos(0);
    Nodos nodo1 = new Nodos(0);
    Nodos nodo2 = new Nodos(0);
    Nodos nodo3 = new Nodos(0);
    Nodos nodo4 = new Nodos(0);
    Nodos nodo5 = new Nodos(0);
    Nodos nodo6 = new Nodos(0);
    Nodos nodo7 = new Nodos(0);
    Nodos nodo8 = new Nodos(7);
    Nodos nodo9 = new Nodos(8);
    Nodos nodo10 = new Nodos(9);
    Nodos nodo11 = new Nodos(10);
    Nodos nodo12 = new Nodos(10);
    Nodos nodo13 = new Nodos(4);
    Nodos nodo14 = new Nodos(6);
    Nodos nodo15 = new Nodos(11);
    Nodos nodo16 = new Nodos(12);

    public Operacion() {
        padre.setNodoIzquierdo(nodo1);
        padre.setNodoDerecho(nodo2);

        nodo1.setNodoIzquierdo(nodo3);
        nodo1.setNodoDerecho(nodo4);

        nodo2.setNodoIzquierdo(nodo5);
        nodo2.setNodoDerecho(nodo6);

        nodo3.setNodoIzquierdo(nodo8);
        nodo3.setNodoDerecho(nodo9);

        nodo4.setNodoIzquierdo(nodo10);
        nodo4.setNodoDerecho(nodo11);

        nodo5.setNodoIzquierdo(nodo7);
        nodo5.setNodoDerecho(nodo12);

        nodo7.setNodoIzquierdo(nodo13);
        nodo7.setNodoDerecho(nodo14);

        nodo6.setNodoIzquierdo(nodo15);
        nodo6.setNodoDerecho(nodo16);

    }

    public boolean comprobarArray(char[] array) {
        boolean existe = false;
        try {
            for (int i = 0; i < array.length; i++) {
                int valor = array[i] - '0';
                if (valor > 1 || valor < 0) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            return existe;
        }

    }

    public void decodificar(String valor) {
        Nodos copia = padre;//creo una copia del nodo padre para poder trabajar a base de este y no alterar el padre

        int size = valor.length();//obtengo el largo del string
        char[] arrayNumero; //creo el array de char para poder trabajar por caracter
        int numerito = 0;//creo un numero que almacenera la palbra encontrada
        arrayNumero = valor.toCharArray();//relleno el array con un array de la palabra separada por los caracteres

        boolean bandera = true;;//creo unas banderas que me ayudara
        boolean verificar = true;
        //creo 3 enteros, contador para la posicion del array, value para el valor del numero de la letra, y el numero auxiliar que me ayudara adelante
        int contador = 0;
        int value;
        int numeroAuxiliar = 0;
        // System.out.println(arrayNumero[contador]+" aaaa la ptm jalaaa");//pa desbuggear el proyecto 

        if (comprobarArray(arrayNumero) == true) {
            while (verificar) {//creo un while para que recorra todo el array de caracteres
                copia = padre;//al dar una segunda vuelta requiero trabajar otra vez con una copia, por eso esta aqui la igualacion de la copia al padre
                //aqui es donde se hace el descodificador
                while (bandera) {//bandera para verificar que si lo encontro o no
                    //para el lado izquierdo1
                    value = arrayNumero[contador] - '0';//transformo a int el valor del array en la posicion contador
                    if (value == 1) {//lo comparo, si es uno es para la izquierda
                        copia = copia.getNodoIzquierdo();//avanzo a la izquierda
                        numerito = copia.getDato();//obtengo el valor que hay en ese nodo
                    }//para el lado derecho
                    else if (value == 0) {//si es cero es para la derecha
                        copia = copia.getNodoDerecho();//avanzo a la derecha
                        numerito = copia.getDato();//obtengo el valor que hay en ese nodo
                    } else {
                        //numero incorrecto agragar JOption
                    }
                    contador++;//aumento el contador en uno para que pueda avanzar en el array de los caracteres
                    if (numerito != 0 || copia == null) {//si el numero obtenido del nodo es diferente a cero significa que hay una letra
                        bandera = false;//rompo el ciclo y obtengo la posicion en la que se quedo
                        System.out.println("numero encontrado en la vuelta: " + contador + " con el valor: " + numerito);//desbuggeado
                        numeroAuxiliar = contador;
                    }
                    if (contador >= size) {//verifico si el contador es mayor o igual al tamaño del array
                        System.out.println("Numero no encontrado");
                        bandera = false;
                        break;//si es asi entonces rompo el while principal
                    }

                }

                if (contador >= size) {//verifico si el contador es mayor o igual al tamaño del array
                    break;//si es asi entonces rompo el while principal
                } else {
                    contador = numeroAuxiliar;//el contador lo igualo a la posicion auxiliar
                    bandera = true;//vuelvo a iniciar la bandera en true para que se repita el while anterior
                }
            }
        } else {
            JOptionPane.showMessageDialog(null,"Ingresa un caracter permitiido");
        }

    }

    public void buscarCamino(char mensaje) {
        boolean encontrado=false;
        int i ;
        for (i=0; i < letras.length; i++) {

            if (letras[i] == mensaje) {
                JOptionPane.showMessageDialog(null,"Letra : "+letras[i]+"\n"+"Camino : "+camino[i] );
                
                encontrado = true;

            }

        }
        if (encontrado) {
            
            //JOptionPane.showMessageDialog(null,"Encontrado \n "+i);

        } else {
            JOptionPane.showMessageDialog(null,"Letra "+mensaje+" No encontrado");
        }

        /*for (int i = 0; i < letras.length; i++){
            if (mensaje != letras[i]){
                System.out.print(i+"\n");
                
            }

        }¨*/
        Nodos copia = padre;
        inOrder(copia);
        // System.out.print("Otra madre: \n"+prueba);
    }

    public void inOrder(Nodos raiz) {

        if (raiz != null) {
            // System.out.print("1");

            inOrder(raiz.getNodoIzquierdo());
            //     System.out.print(raiz.getDato()+" ");
            if (raiz.getDato() != 0) {
                prueba.add(raiz.getDato() + "");
            }
            //    System.out.print("0");
            inOrder(raiz.getNodoDerecho());

        }

    }
}
