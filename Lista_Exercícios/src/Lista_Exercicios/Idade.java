package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Idade 
{
    public static void main(String [] args)
    {
        int nAnos, nMeses, nDias, nTotal;
    
        // entrada
        nAnos = (int) Double.parseDouble(JOptionPane.showInputDialog("Quantos anos você tem?"));
        nMeses = (int) Double.parseDouble(JOptionPane.showInputDialog("Quantos meses você tem?"));
        nDias = (int) Double.parseDouble(JOptionPane.showInputDialog("Quantos dias você tem?"));
        
        // processamento
        nTotal = nAnos * 365;
        nTotal += nMeses * 30;
        nTotal += nDias;
        
        // saída
        JOptionPane.showMessageDialog(null, "Sua idade em dias é: " + nTotal + " dias");
        
    }
}
