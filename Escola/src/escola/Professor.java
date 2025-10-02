package escola;

import javax.swing.JOptionPane;

public class Professor extends Pessoa
{
    
    // atributos
    private String StrCTPS;
    private int HoraAula;
    private double DblInss;
    private double DblSalario;
    
    // métodos
    public void TipoRegistro()
    {
        if (this.getHoraAula() == 0)
        {
            this.setDblInss(2600);
            JOptionPane.showMessageDialog(null, "Seu salário é: " + this.getDblInss() + "R$");
        }
        else
        {
            if (this.getHoraAula() <= 149)
            {
                this.setDblInss((this.getHoraAula() * 30) * 1.3);
                JOptionPane.showMessageDialog(null, "Seu salário é: " + this.getDblInss() + "R$");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Hora de aulas excede o limite.");
            }
        }
    }
    
    public void CalculaSalario()
    {
        if (this.getDblInss() <= 1751.80)
        {
            JOptionPane.showMessageDialog(null, "Não possui contribuição.");
        }
        else
        {
            if (this.getDblInss() <= 2919.72)
            {
                setDblSalario(this.getDblInss() - this.getDblInss() * 0.08);
                this.setDblInss(this.getDblInss() - getDblSalario());
                JOptionPane.showMessageDialog(null, "Salário: " + this.getDblSalario() + "\n Contribuição INSS: " + this.getDblInss());
            }
            else
            {
                if (this.getDblInss() <= 5839.45)
                {
                    setDblSalario(this.getDblInss() - this.getDblInss() * 0.09);
                    this.setDblInss(this.getDblInss() - getDblSalario());
                JOptionPane.showMessageDialog(null, "Salário: " + this.getDblSalario() + "\n Contribuição INSS: " + this.getDblInss());
                }
                else
                {
                    setDblSalario(this.getDblInss() - this.getDblInss() * 0.11);
                    this.setDblInss(this.getDblInss() - getDblSalario());
                JOptionPane.showMessageDialog(null, "Salário: " + this.getDblSalario() + "\n Contribuição INSS: " + this.getDblInss());
                }
            }
        }
    }
    
    @Override
    public void ImprimeDados()
    {
        super.ImprimeDados();
        JOptionPane.showMessageDialog(null,
                "\n CTPS: " + this.getStrCTPS() +
                "\n Horas de aula: " + this.getHoraAula() +
                "\n Salário: " + (this.getDblSalario() + this.getDblInss())
        );
    }
    
        // construtor
    public Professor(String StrCTPS, int HoraAula, double DblInss, String StrNome, int AnoNascimento, String StrTelefone)
    {
        super(StrNome, AnoNascimento, StrTelefone);
        this.StrCTPS = StrCTPS;
        this.HoraAula = HoraAula;
        this.DblInss = DblInss;
    }
    
    // encapsulamento
       public String getStrCTPS() 
    {
        return StrCTPS;
    }

    public void setStrCTPS(String StrCTPS) 
    {
        this.StrCTPS = StrCTPS;
    }

    public int getHoraAula() 
    {
        return HoraAula;
    }

    public void setnHoraAula(int HoraAula) 
    {
        this.HoraAula = HoraAula;
    }

    public double getDblInss() 
    {
        return DblInss;
    }

    public void setDblInss(double DblInss) 
    {
        this.DblInss = DblInss;
    }

    public double getDblSalario() 
    {
        return DblSalario;
    }

    public void setDblSalario(double DblSalario) 
    {
        this.DblSalario = DblSalario;
    }
}
