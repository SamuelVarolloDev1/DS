package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Alfabeto_ASCII {
    public static void main(String[] args) {
        String strMensagem = "";
        char cLetra;
        
        // Processamento
        for (int nAscii = 65; nAscii <= 90; nAscii++) { 
            cLetra = (char) nAscii;
            strMensagem += cLetra + ", ";
        }
        
        // Saída
        JOptionPane.showMessageDialog(null, "Letras do alfabeto: " + strMensagem);
    }
}

