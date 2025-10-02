package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Positivo_e_Negativo 
{
    public static void main(String[] args)
    {
       int nValor;
       String strMensagem, strConfirma;
        
        // entrada
        nValor = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
        
        // processamento
        strConfirma = JOptionPane.showInputDialog("Deseja continuar? (S/N)");
        
        if ("S".equals(strConfirma)) 
        {
            if (nValor >= 0)
            {
                strMensagem = "Positivo";
            }
            else
            {
                strMensagem = "Negativo";
            }
            
        // saída
        JOptionPane.showMessageDialog(null, "Seu número é " + strMensagem);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Cancelado");
        }
    }
}
