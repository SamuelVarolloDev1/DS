package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Fahrenheit 
{
    public static void main(String[] args)
    {
        double DblCelsius, Conversao;
        
        //entrada
        DblCelsius = Double.parseDouble(JOptionPane.showInputDialog("Informe os graus a serem convertidos"));
        
        //processamento 
        Conversao = (9 * DblCelsius + 160)/5;
        
        //saída
        JOptionPane.showMessageDialog(null, DblCelsius + " Graus Celsius em Fahrenheit é: " + Conversao);
    }
}
