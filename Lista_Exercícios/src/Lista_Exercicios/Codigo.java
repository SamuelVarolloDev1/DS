package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Codigo {
    public static void main(String[] args){
        int Codigo;
        String mensagem;
        
        // Entrada
        Codigo = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
        
        // Processamento
        switch (Codigo) {
            case 1: mensagem = "Um"; break;
            case 2: mensagem = "Dois"; break;
            case 3: mensagem = "Três"; break;
            default: mensagem = "Código Inválido"; break;
        }
        
        // Saída
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

