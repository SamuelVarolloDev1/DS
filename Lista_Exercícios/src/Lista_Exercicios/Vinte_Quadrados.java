package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Vinte_Quadrados 
{
    public static void main(String[] args){
        int nValor, nTotal = 0;
        
        // entrada
        nValor = Integer.parseInt(JOptionPane.showInputDialog("informe o valor"));
        
        // processamento
        while (nValor < 1 || nValor > 9){
            nValor = Integer.parseInt(JOptionPane.showInputDialog("informe um valor entre 1 e 9"));
        }
        
        if (nValor%2 == 0){
            nValor++;
        }
        
        for (int i = 0; i < 20; i++){
            nTotal += nValor * nValor;
            nValor += 2;
        }
        
        // saida
        JOptionPane.showMessageDialog(null, nTotal);
    }
}
    