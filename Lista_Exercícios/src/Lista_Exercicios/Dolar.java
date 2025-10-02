package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Dolar {
    public static void main(String[] args)
    {
        double DblCotacao, DblValor, Conversao;
        
        // entrada
        DblCotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da cotação do dólar"));
        DblValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que quer converter para reais"));
        
        // processamento
        Conversao = DblValor * DblCotacao;
        
        //saída
        JOptionPane.showMessageDialog(null, "Valor em dólar: " + DblValor + " \nValor em dólar: " + Conversao);
    }
}