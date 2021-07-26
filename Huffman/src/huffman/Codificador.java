/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman;

/**
 *
 * @author asael
 */
public class Codificador {
    Nodo padre=new Nodo(0);
    Nodo nodo1=new Nodo(0);
    Nodo nodo2=new Nodo(0);
    Nodo nodo3=new Nodo(0);
    Nodo nodo4=new Nodo(0);
    Nodo nodo5=new Nodo(0);
    Nodo nodo6=new Nodo(0);
    Nodo nodo7=new Nodo(0);
    Nodo nodo8=new Nodo(7);
    Nodo nodo9=new Nodo(8);
    Nodo nodo10=new Nodo(9);
    Nodo nodo11=new Nodo(10);
    Nodo nodo12=new Nodo(10);
    Nodo nodo13=new Nodo(4);
    Nodo nodo14=new Nodo(6);
    Nodo nodo15=new Nodo(11);
    Nodo nodo16=new Nodo(12);
    
    
    public Codificador(){
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
        
        nodo5.setNodoIzquierdo(nodo12);
        nodo5.setNodoDerecho(nodo7);
        
        nodo12.setNodoIzquierdo(nodo13);
        nodo12.setNodoDerecho(nodo14);
        
        nodo6.setNodoIzquierdo(nodo15);
        nodo6.setNodoDerecho(nodo16);
        
    }
    
    
    
    public void decodificar(String valor){
        Nodo copia=padre;
        Nodo auxiliar;
        int size=valor.length();
        char [] arrayNumero; 
        int numerito=0;
        arrayNumero=valor.toCharArray();
        
        boolean bandera;
        int i=0;
        bandera=true;
        System.out.print(arrayNumero[i]+"aaaa la ptm jalaaa");
        while(bandera && copia!=null){
            //para el lado izquierdo
            char palabra=arrayNumero[i];
            if (palabra=='1'){
                numerito=copia.getDato();
                copia=copia.getNodoIzquierdo();
            }//para el lado derecho
            else if(palabra=='0'){
                numerito=copia.getDato();
                copia=copia.getNodoDerecho();
            }else{
                //numero incorrecto agragar JOption
            }
            if (numerito!=0){
                bandera=false;
            }
            System.out.print(numerito);
            i++;
        }
    }
}
