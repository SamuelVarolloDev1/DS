package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Combinacao {
    public static void main(String[] args)
    {
        int nValor1, nValor2, nValor3, nValor4, nTotal;
        
        // entrada
        nValor1 = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        nValor2 = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        nValor3 = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor"));
        nValor4 = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor"));
        
        // processamento
        nTotal = nValor1 * nValor2 + nValor1 * nValor3 + nValor1 * nValor4;
        nTotal += nValor2 * nValor1 + nValor2 * nValor3 + nValor2 * nValor4;
        nTotal += nValor3 * nValor1 + nValor3 * nValor2 + nValor3 * nValor4;
        nTotal += nValor4 * nValor1 + nValor4 * nValor2 + nValor4 * nValor3;
        
        //saída
        JOptionPane.showMessageDialog(null, "O resultado é: " + nTotal);
    }
}