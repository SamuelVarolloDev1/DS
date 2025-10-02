package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Diferenca {
    public static void main(String[] args){
        int nValor1, nValor2, nResult;
        
        //entrada
        nValor1 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
        nValor2 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe um segundo valor"));
        
        //processamento
         if(nValor1 > nValor2){
             nResult = nValor1 - nValor2;
         }else{
             nResult = nValor2 - nValor1;
         }
         
         //saída
         JOptionPane.showMessageDialog(null, "O primeiro valor digitado foi: " + nValor1 + 
                                             "\nO segundo valor foi: " + nValor2 + 
                                             "\nA diferença do maior para o menor é de: " + nResult);
    }
}
