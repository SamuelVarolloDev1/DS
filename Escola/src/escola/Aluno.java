package escola;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa
{
    // atributos
    private String StrRm;
    private String StrSerie;
    private String StrPeriodo;
    
    // métodos
    public void RecebeAlimentacao()
    {
        if (this.getStrPeriodo() == "ETIM")
        {
            JOptionPane.showMessageDialog(null, "O aluno TEM direito à alimentação.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O aluno NÃO TEM direito à alimentação.");
        }
    }
    
    // método polimórfico
    @Override
    public void ImprimeDados()
    {
        super.ImprimeDados();
        JOptionPane.showMessageDialog(null,
                "\n RM: " + this.getStrRm() +
                "\n Série: " + this.getStrSerie() +
                "\n Período: " + this.getStrPeriodo()
        );
    }
    
    // construtor
    public Aluno(String StrRm, String StrSerie, String StrPeriodo, String StrNome, int AnoNascimento, String StrTelefone)
    {
        super(StrNome, AnoNascimento, StrTelefone);
        this.StrRm = StrRm;
        this.StrSerie = StrSerie;
        this.StrPeriodo = StrPeriodo;
    }
    
    // encapsulamento
    public String getStrRm() 
    {
        return StrRm;
    }

    public void setStrRm(String StrRm) 
    {
        this.StrRm = StrRm;
    }

    public String getStrSerie() 
    {
        return StrSerie;
    }

    public void setStrSerie(String StrSerie) 
    {
        this.StrSerie = StrSerie;
    }

    public String getStrPeriodo() 
    {
        return StrPeriodo;
    }

    public void setStrPeriodo(String StrPeriodo) 
    {
        this.StrPeriodo = StrPeriodo;
    }
}
