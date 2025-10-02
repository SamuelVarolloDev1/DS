package Lista_Exercicios;
import javax.swing.JOptionPane;

public class Triangulo {
   public static void main(String[] args){
       int A, B, C;
       String mensagem = "";
       
       // Entrada
       A = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro lado do triângulo"));
       B = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo lado do triângulo"));
       C = (int) Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro lado do triângulo"));
       
       // Processamento
       if (A < B + C && B < A + C && C < A + B) {
           if (A == B && B == C) {
               mensagem = "Triângulo Equilátero";
           } else if (A == B || A == C || B == C) {
               mensagem = "Triângulo Isósceles";
           } else {
               mensagem = "Triângulo Escaleno";
           }
       } else {
           mensagem = "Os valores informados não formam um triângulo";
       }
       
       // Saída
       JOptionPane.showMessageDialog(null, mensagem);
   } 
}
