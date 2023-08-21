package exames;

import javax.swing.JOptionPane;

public class Glicemia extends Exame{
    
    private int qtdGlicose;
    private String resultadoGlicose;
    


    public int getQtdGlicose() {
        return qtdGlicose;
    }

    public void setQtdGlicose(int qtdGlicose) {
        this.qtdGlicose = qtdGlicose;
    }
    
    public String getResultadoGlicose() {
        return resultadoGlicose;
    }

    public void setResultadoGlicose(String resultadoGlicose) {
        this.resultadoGlicose = resultadoGlicose;
    }
    


    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        this.qtdGlicose = Integer.parseInt(JOptionPane.showInputDialog("Qual o nivel de Glicose do paciente"));
        
        if (qtdGlicose < 100) {
            resultadoGlicose = "Normoglicemia";
        } else if (qtdGlicose >= 100 && qtdGlicose < 126) {
            resultadoGlicose = "Pré-diabetes";
        } else {
            resultadoGlicose = "Diabetes estabelecido";
        }
    }
    
    @Override
    public void mostrarExame() {
        String msg = "Nome: " + this.getNome() + "\n";
        msg += "Resultado: " + this.getQtdGlicose() + "\n";
        msg += "Classificação: " + this.resultadoGlicose + "\n";
        JOptionPane.showMessageDialog(null, msg);
    }
    
    
}
