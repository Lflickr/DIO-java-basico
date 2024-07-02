//outra forma de pensar no switch case
public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";
        //planos são complementares um com o outro
        switch (plano) {
            case "T":{
                System.out.println("5GB Youtube");
            }
            case "M":{
                System.out.println("Whats e Instagram gratis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }   
    }
}
