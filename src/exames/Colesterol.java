package exames;

import javax.swing.JOptionPane;

public class Colesterol extends Exame{
    
    private int qtdLDL;
    private int qtdHDL;
    private String risco;
    private String resultadoLDL;
    private String resultadoHDL;

    public int getQtdLDL() {
        return qtdLDL;
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }

    public void setQtdLDL(int qtdLDL) {
        this.qtdLDL = qtdLDL;
    }

    public int getQtdHDL() {
        return qtdHDL;
    }

    public void setQtdHDL(int qtdHDL) {
        this.qtdHDL = qtdHDL;
    }

    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        this.qtdHDL = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do HDL"));
        this.qtdLDL = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do LDL"));
        this.risco = JOptionPane.showInputDialog("Qual o risco");
        
        if (super.getIdade() < 19 && qtdHDL < 45 || super.getIdade() >= 20 && qtdHDL < 40) {
            resultadoHDL = "HDL - BOM";
        } else {
            resultadoHDL = "HDL - RUIM";
        }

        if ((risco.equals("B") && qtdLDL < 100) || (risco.equals("M") && qtdLDL < 70) || (risco.equals("A") && qtdLDL < 50)) {
            resultadoLDL = "LDL - BOM";
        } else {
            resultadoLDL = "LDL - RUIM";
        }
        
    }
    
    @Override
    public void mostrarExame() {
        String msg = "Nome: " + this.getNome() + "\n";
        msg += "Tipo Sanguineo: " + this.getTipoSanguineo() + "\n";
        msg += "Ano Nascimento: " + this.getAnoNascimento() + "\n";
        msg += "Valor HDL: " + this.qtdHDL + "\n";
        msg += "Resultado HDL: " + this.resultadoHDL + "\n";
        msg += "Valor LDL: " + this.qtdLDL + "\n";
        msg += "Resultado LDL: " + this.resultadoLDL + "\n";
        JOptionPane.showMessageDialog(null, msg);
    }
    
    
}
