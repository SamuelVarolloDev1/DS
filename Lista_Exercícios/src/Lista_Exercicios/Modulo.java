package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Modulo {
    public static void main(String[] args){
        int nValor;
        
        //entrada
        nValor = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        
        //processamento
        if (nValor < 0)
        {
            nValor = nValor * (-1);
        }
        
        //saída
        JOptionPane.showMessageDialog(null, "O valor fica: " + nValor);
    }   
}