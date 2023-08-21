package exames;

public class Exames {

    public static void main(String[] args) {
         
        Glicemia exameGlicemia = new Glicemia();
        exameGlicemia.cadastrarExame();
        exameGlicemia.mostrarExame();

        Colesterol exameColesterol = new Colesterol();
        exameColesterol.cadastrarExame();
        exameColesterol.mostrarExame();
    
        Triglicerideos exameTriglicerideos = new Triglicerideos();
        exameTriglicerideos.cadastrarExame();
        exameTriglicerideos.mostrarExame();
    }
}
