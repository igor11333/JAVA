import java.util.Scanner;
public class EX03 {
    public static void main(String[] args){
        System.out.println("Digite um número: ");
        Scanner y = new Scanner(System.in);
        int tabuada = y.nextInt();
        for(int i=1; i<11; i++){
            int resultado = i * tabuada;
            System.out.println(tabuada+"x"+i+"="+resultado);
        }
    }
}
