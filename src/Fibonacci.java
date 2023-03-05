import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int anterior=0,atual=1,aux;
        //ENTRADA DO NUMERO AQUI
        int input=13;

        if (input==0){
            System.out.println("Pertence");
        }else if (input==1){
            System.out.println("Pertence");
        }else if (input>1) {
            for (int i = 0; atual<input; i++) {
                aux=atual;
                atual += anterior;
                anterior = aux;
            }
            if (atual==input){
                System.out.println("Pertence");
            }else{
                System.out.println("Não pertence");
            }
        }
    }
}
