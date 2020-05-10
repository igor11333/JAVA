import java.util.Scanner;
public class EX01 {
    public static void main(String[] args){
        Scanner nome = new Scanner(System.in);
        System.out.println ("Digite o seu nome: ");
        String nome1 = nome.nextLine();
        System.out.println ("Olá, "+ nome1 + "!" + "Seja bem vindo!");
    }
}

