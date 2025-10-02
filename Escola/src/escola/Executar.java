package escola;
public class Executar 
{
    public static void main(String[] args) 
    {
      // construtor
        Aluno aluno1 = new Aluno("09285", "1MDS", "ETIM", "Jeferson", 2008, "96237-9872");
        Professor professor1 = new Professor("", 0, 0, "Cléber", 1980, "90328-0876");
        
        aluno1.CalcularIdade(2025);
        aluno1.RecebeAlimentacao();
        professor1.TipoRegistro();
        professor1.CalculaSalario();
        aluno1.ImprimeDados();
        professor1.ImprimeDados();
    }
    
}
