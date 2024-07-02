public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero=1; numero<=5; numero++){
            if(numero==3)      
                continue;
                //break para totalmente o for
                //continue so interrompe a volta que esta no momento
            System.out.println(numero);
        }
    }
}
