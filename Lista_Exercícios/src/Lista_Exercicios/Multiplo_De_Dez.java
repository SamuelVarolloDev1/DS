package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Multiplo_De_Dez
{
    public static void main(String[] args)
    {
        String strMensagem = "";
        
        // processamento
        for (int i = 1; i < 101; i++)
        {
            if (i%10 == 0)
            {
                strMensagem += Integer.toString(i) + " - (Múltiplo de 10) \n";
            }
            else
            {
                strMensagem += Integer.toString(i) + ", ";
            }
        }
        
        // saída
        JOptionPane.showMessageDialog(null, strMensagem);
    }
}