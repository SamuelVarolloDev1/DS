package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Relacionamento 
{
    public static void main(String [] args)
    {
        int nValor1, nValor2;
        String StrRel = "";
        
        //entrada
        nValor1 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
        nValor2 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));
        
        //processamento
        if (nValor1 >= nValor2)
        {
            StrRel += "Maior ou igual, ";
        }
        else
        {
            if (nValor1 <= nValor2)
            {
                StrRel += "Menor ou igual, ";
            }
        }
        
        if (nValor1 == nValor2)
        {
            StrRel += "Igual, ";
        }
        else
        {
            StrRel += "Não igual, ";
        }
        
        if (nValor1 > nValor2 && nValor1 != nValor2)
        {
            StrRel += "Maior";
        }
        else
        {
            if (nValor1 < nValor2 && nValor1 != nValor2)
            {
                StrRel += "Menor";
            }
        }
        
        //saída
        JOptionPane.showMessageDialog(null, StrRel);
    }
    
}
