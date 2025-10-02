package escola;
// classe pai e abstrata
import javax.swing.JOptionPane;
public abstract class Pessoa 
{
    // atributos
    private String StrNome;
    private int AnoNascimento;
    private String StrTelefone;
    
    // métodos
    public void ImprimeDados()
    {
        JOptionPane.showMessageDialog(null,
                "nome: " + this.getStrNome() + 
                "\n Ano de nascimento: " + this.getAnoNascimento() + 
                "\n Telefone: " + this.getStrTelefone());
    }
    
    public void CalcularIdade(int AnoAtual)
    {
        JOptionPane.showMessageDialog(null, AnoAtual - this.getAnoNascimento() + " anos.");
    }
    
    // construtor
    public Pessoa(String StrNome, int AnoNascimento, String StrTelefone)
    {
        this.StrNome = StrNome;
        this.AnoNascimento = AnoNascimento;
        this.StrTelefone = StrTelefone;
    }
    
    // encapsulamento
    public String getStrNome() {
        return StrNome;
    }

    public void setStrNome(String StrNome) {
        this.StrNome = StrNome;
    }

    public int getAnoNascimento() {
        return AnoNascimento;
    }

    public void setAnoNascimento(int AnoNascimento) {
        this.AnoNascimento = AnoNascimento;
    }

    public String getStrTelefone() {
        return StrTelefone;
    }

    public void setStrTelefone(String StrTelefone) {
        this.StrTelefone = StrTelefone;
    }
}
