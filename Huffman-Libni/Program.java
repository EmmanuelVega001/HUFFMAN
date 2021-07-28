import javax.swing.JOptionPane;

class Program{
    public static void main(String[] args) {
        String mensaje = JOptionPane.showInputDialog(null, "Caracteres admitidos \nA\nE\nI\nO\nC\nR\nB\nP\nU");
        mensaje = mensaje.toUpperCase();
        Codificador demo = new Codificador();
        char [] mensajeChar = mensaje.toCharArray();
        System.out.println("Palabra ingresada: " + mensaje);
        System.out.print("Codificacion de la palabra " + mensaje + " es: ");
        for (int i = 0; i < mensajeChar.length; i++){
            demo.buscarCamino(mensajeChar[i]);
        }
        
        System.out.println("");
        String buscar="11111010110001110110010001000";//probando que todos los nodos esten bien por eso el numerote
        demo.decodificar(buscar);
    }
}