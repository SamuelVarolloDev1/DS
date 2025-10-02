package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Celsius {
    public static void main(String[] args){
    
    double DblFahrenheit, Conversao;
        
        //entrada
        DblFahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Informe os graus a serem convertidos"));
        
        //processamento
        Conversao = (DblFahrenheit - 32)* 5/9;
        
        //saída
        JOptionPane.showMessageDialog(null, DblFahrenheit + " Fahrenheit em Celsius é: " + Conversao);
    }
}