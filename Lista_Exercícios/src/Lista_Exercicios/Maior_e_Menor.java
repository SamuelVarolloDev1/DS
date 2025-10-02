package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Maior_e_Menor 
{
    public static void main(String [] args)
	{
        int nValor[] = new int[3], nMaior, nMenor;
        
		//entrada
        nValor[0] = (int) Double.parseDouble(JOptionPane.showInputDialog("informe o primeiro valor"));
        if (nValor[0] < 1)
        {
            nValor[0] = (int) Double.parseDouble(JOptionPane.showInputDialog("Valor inválido. Informe outro maior que 0"));
        }      
        nValor[1] = (int) Double.parseDouble(JOptionPane.showInputDialog("informe o segundo valor"));
        if (nValor[1] < 1)
        {
            nValor[1] = (int) Double.parseDouble(JOptionPane.showInputDialog("Valor inválido. Informe outro maior que 0"));
        }
        nValor[2] = (int) Double.parseDouble(JOptionPane.showInputDialog("informe o terceiro valor"));
        if (nValor[2] < 1)
        {
            nValor[2] = (int) Double.parseDouble(JOptionPane.showInputDialog("Valor inválido. Informe outro maior que 0"));
        }
        
        // processamento
        if (nValor[0] > nValor[1] && nValor[0] > nValor[2])
        {
            nMaior = nValor[0];
        }
        else
        {
            if (nValor[1] > nValor[2])
            {
                nMaior = nValor[1];
            }
            else
            {
                nMaior = nValor[2];
            }
        }
        if (nValor[0] < nValor[1] && nValor[0] < nValor[2])
        {
            nMenor = nValor[0];
        }
        else
        {
            if (nValor[1] < nValor[2])
            {
                nMenor = nValor[1];
            }
            else
            {
                nMenor = nValor[2];
            }
        }
         
        // saída
        JOptionPane.showMessageDialog(null, nMenor * nMaior + "\n" + nMaior/nMenor);
    }
}