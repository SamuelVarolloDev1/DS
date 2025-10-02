package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Numeros_Pares {
  public static void main(String[] args) {
        int i;
        
        // Loop para exibir números ímpares entre 100 e 200
        for (i = 100; i < 200; i += 2) {
            JOptionPane.showMessageDialog(null, i);
        }
    }  
}
