import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

        entrandoEmContado(selecaoCandidatos());
    }

    static void entrandoEmContado(String[] candidatosSelecionado){
        for(String candidato: candidatosSelecionado){
            if(candidato == null)
                break;
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;

            do{
                atendeu = atender();
                continuarTentando = !atendeu;

                if(continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("CONTATO REALIZADO COM SUCESSO");

            }while(continuarTentando && tentativasRealizadas < 3);

            if(atendeu)
                System.out.println("CONSEGUIMOS CONTATOS COM "+ candidato+ " NA " + tentativasRealizadas +" TENTATIVA");
            else
                System.out.println("NÃO CONSEGUIMOS CONTATO COM "+ candidato+ ", NUMERO MAXIMO TENTATIVAS " + tentativasRealizadas +" REALIZADA");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) ==1;
    }

    static void imprimirSelecionados(String[] selecao){
        
        System.out.println("Imprimindo a lista de candidados ");

        for(int indice = 0; indice < selecao.length; indice++){
            System.out.println("O candidato num: "+indice+" é o "+selecao[indice]);
        }

        System.out.println("Forma abreviada de iteração for each");
        for(String candidato: selecao){
            System.out.println("O candidato selecionado foi" + candidato);
        }
    }

    static String[] selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JOEL"};
        String [] selecao = new String[5];

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " +candidato+" solicitou o valor de salario: "+salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+candidato+" foi selecionado");
                selecao[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

        return selecao;
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidado(double salarioPretendido){
        double salarioBase = 2000.00;

        if(salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if(salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS RESULTADOS");
    }


}
