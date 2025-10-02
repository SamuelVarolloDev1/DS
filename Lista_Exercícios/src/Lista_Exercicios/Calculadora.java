package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Calculadora
{
    public static void main(String[] args)
    {
        double dblValor[] = new double[2];
        int nOperacao;

        // entrada
        dblValor[0] = (int) Double.parseDouble(JOptionPane.showInputDialog("informe o primeiro valor"));
        dblValor[1] = (int) Double.parseDouble(JOptionPane.showInputDialog("informe o segundo valor"));
        
        nOperacao = (int) Double.parseDouble(JOptionPane.showInputDialog("Qual operação você quer? \n "
                + "1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão"));
        
        // processamento e saída
        switch (nOperacao)
        {
            case 1 -> JOptionPane.showMessageDialog(null, dblValor[0] + dblValor[1]);
            case 2 -> JOptionPane.showMessageDialog(null, dblValor[0] - dblValor[1]);
            case 3 -> JOptionPane.showMessageDialog(null, dblValor[0] * dblValor[1]);
            case 4 -> JOptionPane.showMessageDialog(null, dblValor[0] / dblValor[1]);
        }
    }
}
