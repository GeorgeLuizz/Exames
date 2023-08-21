package exames;

import javax.swing.JOptionPane;


public class Exame {
    
    private String nome;
    private String tipoSanguineo;
    private int anoNascimento;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    
    public void cadastrarExame(){
        this.nome = JOptionPane.showInputDialog("Digite o nome do paciente: ");
        this.tipoSanguineo = JOptionPane.showInputDialog("Digite o tipo sanguineo do paciente: ");
        this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do paciente: "));
        this.idade = 2023 - anoNascimento;
    }
    
    public void mostrarExame(){
        String msg = "Nome: " + this.nome + "\n";
        msg += "Tipo Sanguineo: " + this.tipoSanguineo + "\n";
        msg += "Ano Nascimento: " + this.anoNascimento + "\n";
        msg += "Idade: " + this.idade + "\n";
        JOptionPane.showMessageDialog(null, msg);
    }
}
