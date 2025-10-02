package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Media {
    public static void main(String[] args){
        double Nota1, Nota2, Nota3, Nota4, Nota5, Media, Media2 = 0;
        String Mensagem;

        // entrada
        Nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota"));
        Nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua segunda nota"));
        Nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua terceira nota"));
        Nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua quarta nota"));

        // processamento
        Media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;

        if (Media >= 7) {
            Mensagem = "Aprovado";
        } else {
            Nota5 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua nota de recuperação"));
            Media2 = (Nota1 + Nota2 + Nota3 + Nota4 + Nota5) / 5;

            if (Media2 >= 7) {
                Mensagem = "Aprovado na recuperação";
            } else {
                Mensagem = "Aluno reprovou";
            }
        }

        // saída
        JOptionPane.showMessageDialog(null, "Média = " + Media + 
                                    "\nMédia da recuperação = " + Media2 +
                                    "\nSituação: " + Mensagem);
    }
}
