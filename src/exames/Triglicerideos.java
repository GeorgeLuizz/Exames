package exames;

import javax.swing.JOptionPane;

public class Triglicerideos extends Exame {
    
    private int qtdTri;
    private String resultadoTri;

    public int getValorTri() {
        return qtdTri;
    }

    public void setValorTri(int qtdTri) {
        this.qtdTri = qtdTri;
    }
    
    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        this.qtdTri = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do Triglicerideos"));
        
        if ((super.getIdade() <= 9 && qtdTri < 75) || (super.getIdade() >= 10 && super.getIdade() <= 19 && qtdTri < 90) || (super.getIdade() >= 20 && qtdTri < 150)) {
            resultadoTri = "Triglicerideos Bom";
        } else {
            resultadoTri = "Triglicerideos Ruim";
        }
        
    }
    
    @Override
    public void mostrarExame() {
        String msg = "Nome: " + this.getNome() + "\n";
        msg += "Tipo Sanguineo: " + this.getTipoSanguineo() + "\n";
        msg += "Ano Nascimento: " + this.getAnoNascimento() + "\n";
        msg += "Valor Triglicerideos: " + this.qtdTri + "\n";
        msg += "Resultado Triglicerideos: " + this.resultadoTri + "\n";
        JOptionPane.showMessageDialog(null, msg);
    }
}
