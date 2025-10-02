package Lista_Exercicios;
import javax.swing.JOptionPane;
import java.math.BigInteger;

public class Trigo 
{
   public static void main(String[] args)
   { 
       BigInteger nValor = BigInteger.ONE;
       
       // processamento
       for (int i = 0; i < 64; i++)
       {
           nValor = nValor.add(nValor);
       }
       
       // saída
       JOptionPane.showMessageDialog(null, "O monge receberá " + nValor + " grãos de trigo");
   }
}