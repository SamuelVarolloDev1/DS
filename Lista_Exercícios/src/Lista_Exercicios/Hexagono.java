package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Hexagono 
{
    public static void main(String[] args)
    {
        double dblLado;
        
        // entrada
        dblLado = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado do hexágono regular"));
        
        // processamento e saída 
        JOptionPane.showMessageDialog(null, "Área: " + (3 * (dblLado * dblLado)) * 1.732 / 2 + 
				            "\n Perímetro: " + dblLado * 6 +
                                            "\n Apótema: " + (dblLado * 1.732) / 2 +
                                            "\n Raio da circunferência inscrita: " + (dblLado * 1.732) / 2 +
                                            "\n Raio da circunferência circunscrita: " + dblLado
        );
    }
}
