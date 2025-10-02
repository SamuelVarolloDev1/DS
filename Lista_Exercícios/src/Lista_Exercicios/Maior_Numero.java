package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Maior_Numero {
    public static void main(String[] args){
        int nValor1, nValor2;
        String mensagem = "";
        
        //entrada
        nValor1 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
        nValor2 = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe outro valor"));
        
        //processamento
        if(nValor1 > nValor2){
            mensagem = nValor1 + "(1ºValor) é o maior valor, " + nValor2 + "(2ºValor) é o menor valor";
        }else{
            if(nValor2 > nValor1){
                mensagem = nValor2 + "(2ºValor) é o maior valor, " + nValor1 + "(1ºValor) é o menor valor";                
            }else{
                if(nValor1 == nValor2){
                    mensagem = "Os dois são iguais";
                }
            }
        }
        
        //saída
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
