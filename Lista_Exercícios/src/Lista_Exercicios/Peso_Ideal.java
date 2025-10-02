package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Peso_Ideal 
{
    public static void main(String[] args)
    {
        double dblAltura;
        char cSexo;
        
        // entrada
        cSexo = JOptionPane.showInputDialog("Qual é o seu sexo? (M/F)").charAt(0);
        dblAltura = (int) Double.parseDouble(JOptionPane.showInputDialog("Qual é a sua altura?"));
        
        // processamento e saída
        switch (cSexo)
        {
            case 'M' ->
            {
                JOptionPane.showMessageDialog(null, (72.7 * dblAltura) - 58);
            }
            case 'F' ->
            {
                JOptionPane.showMessageDialog(null, (62.1 * dblAltura) - 44.7);
            }
        } 
    }
}
