package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Armazenar 
{
    public static void main(String[] args)
    {
        double dblValor, dblPositivo, dblNegativo;
        
        // entrada
       dblValor = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
       
       // processamento
       if (dblValor >= 0)
       {
           dblPositivo = dblValor;
           // saida
           JOptionPane.showMessageDialog(null, "Salvo no A");
       }
       else
       {
           dblNegativo = dblValor;
           // saida
           JOptionPane.showMessageDialog(null, "Salvo no B");
       }
    }
}
