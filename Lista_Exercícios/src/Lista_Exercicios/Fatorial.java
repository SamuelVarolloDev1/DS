package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Fatorial {
  public static void main(String[] args) {
    int numero;
    int fatorial = 1;
    
    // Entrada
    numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
    
    // Processamento
    for (int i = 1; i <= numero; i++) {
      fatorial *= i;
    }
    
    // Saída
    JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);
  }
}
