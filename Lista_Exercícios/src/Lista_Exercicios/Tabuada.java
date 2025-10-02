package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Tabuada {
    public static void main(String[] args){
        int multiplicador, multiplicando;
        
        // Entrada de dados
        multiplicador = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o multiplicador:"));
        multiplicando = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o multiplicando:"));
        
        // Processamento
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i <= multiplicando; i++) {
            resultado.append(multiplicador).append(" x ").append(i).append(" = ").append(multiplicador * i).append("\n");
        }
        
        // Saída
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}