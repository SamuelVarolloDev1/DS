package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Funcoes 
{
    public static void main(String[] args)
    {
        // - vetores dos valores e operacao
        int nValor[] = new int[2], nOperacao;
        
        // entrada
        nValor[0] = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
        nValor[1] = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));
        
        nOperacao = (int) Double.parseDouble(JOptionPane.showInputDialog("Qual função você quer? \n "
                + "1 – Verificar se um dos números lidos é ou não múltiplo do outro \n "
                + "2 – Verificar se os dois números lidos são pares \n "
                + "3 – Verificar se a média dos dois números é maior ou igual a 7 \n 4 – Sair"));

        // processamento e saída
        switch (nOperacao)
        {
            case 1 -> 
            { 
                if (nValor[0]%nValor[1] == 0 || nValor[1]%nValor[0] == 0)
                {
                    // saida 1
                    JOptionPane.showMessageDialog(null, "São múltiplos");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Não são múltiplos");
                }
            }
              
            case 2 ->
            {
                if (nValor[0]%2 == 0 && nValor[1]%2 == 0)
                {
                    JOptionPane.showMessageDialog(null, "Os dois são pares");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Um ou os dois não são pares");
                }
            }
            
            case 3 ->
            {
                if ((nValor[0]+nValor[1]) / 2 >= 7)
                {
                    JOptionPane.showMessageDialog(null, "A média deles é maior ou igual a sete");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "A média deles é menor que 7");
                }
            }
            
            case 4 ->
            {
                JOptionPane.showMessageDialog(null, "Cancelado");
            }
        }
    }
}
