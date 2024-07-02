public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(int i = 0; i <alunos.length; i++){
            System.out.println("O aluno de indice i:" + i + " é "+ alunos[i]);
        }

        //estrutura for/each para cada elemento dentro do array
        for(String aluno : alunos){
            System.out.println("O nome do aluno é "+ aluno);
        }
    }
}
