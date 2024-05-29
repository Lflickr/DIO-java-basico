public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
    

        //tipos de dados primitivos
            //byte, short, int, long
            //float, double

        double salario = 2500.32;
        String nomeCompleto = "Italo Bello Silva";
         
        //para nomes de variaveis longos utilizar camelCase
        short numeroCurto = 1; 
        int numeroLongo = numeroCurto;
        short numeroCurto2 = (short) numeroLongo; //exemplo de cast

        //final marca uma constante
        //para constantes, utilizar UPPER_SNAKE_CASE 
        final double VALOR_PI = 3.14; 
        //System.out.println(VALOR_PI);
        
    }
}
