class Nodo {
    private int dato;
    private Nodo izq;
    private Nodo der;
    
    
    //metodo constructor
    public Nodo(int dato){
        this.dato = dato;
    }
    //gets para regresar el valor de los nodos derecho e izquierdo
    public Nodo getNodoIzquierdo(){
        return izq;
    }
    
    public Nodo getNodoDerecho(){
        return der;
    }
    
    //sets para darles el valor al nodo izquierdo o derecho
    public void setNodoIzquierdo(Nodo izquierdo){
        this.izq = izquierdo;
    }
    
    public void setNodoDerecho(Nodo derecho){
        this.der = derecho;
    }
    
    public int getDato(){
        return dato;
    }
}
