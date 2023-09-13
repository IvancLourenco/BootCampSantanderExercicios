package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        String [] candidatos = {"KAMILA", "GENI","FABIANA", "IVAN","MARCOS"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativaRealizada = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativaRealizada++;
            }else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        }while (continuarTentando && tentativaRealizada <3);
        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " +candidato+ ", NUMERO MAXIMO TENTATIVAS " +tentativaRealizada);
        }else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " +candidato+ ", NUMERO MAXIMO TENTATIVAS " +tentativaRealizada);
        }

    }

    static  boolean atender(){
        return  new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA","PAULO", "AUGUSTO","MONICA"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for( int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O Candidato de nº " +(indice+1)+ " é " +candidatos[indice]);
        }

        System.out.println("forma abreviada de interação for each");

        for (String candidato: candidatos) {
            System.out.println("O candidato  selecionado foi " +candidato);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA","PAULO", "AUGUSTO","MONICA","FABRICIO","WALTER","FERNANDO","LUCAS","HEITOR"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " +candidato+ " Solicitou este valor de salario " + salarioPretendido );
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " +candidato+ " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if ( salarioBase > salarioPretendido ){
            System.out.println( "Ligar para o Candidato");
        }else if (salarioBase == salarioPretendido){
            System.out.println( "Ligar para o  candidato com uma contra proposta");
        }else {
            System.out.println( "Aguardando o resultado dos demais candidatos");
        }
        
    }
}
