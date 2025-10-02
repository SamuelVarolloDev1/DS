package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Tabela_Fahrenheit 
{
    public static void main(String[] args)
    {
        int nSeparar = 0;
        String strMensagem = "";
        
        // processamento
        for (double Celsius = 1; Celsius < 101; Celsius++)
        {
            if (nSeparar < 2)
            {
                strMensagem += Double.toString(Celsius) + "°C em Fahrenheit é: " + Double.toString(Celsius * 1.8 + 32) + " /  ";
                nSeparar++;
            }
            else
            {
                strMensagem += Double.toString(Celsius) + "°C em Fahrenheit é: " + Double.toString(Celsius * 1.8 + 32) + "\n";
                nSeparar = 0; 
            }
        }
        
        // saída
        JOptionPane.showMessageDialog(null, strMensagem);
    }
}