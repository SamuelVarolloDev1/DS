package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Intervalo {
    public static void main(String[] args){
        int nValor;
        String mensagem;
        
        //entrada
        nValor = (int) Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        
        //processamento
        if(nValor >= 0 && nValor <= 9){
            mensagem = "Valor Válido";
        }else{
            mensagem = "Valor Inválido";
        }
        
        //saída
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
