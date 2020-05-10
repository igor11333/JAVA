import java.util.Scanner;
public class EX04IMC {
    public static void main(String[] args) {
        System.out.println("Digite seu peso(kg): ");
        Scanner x = new Scanner(System.in);
        double peso = x.nextDouble();
        System.out.println("Digite sua altura(m) ");
        Scanner y = new Scanner(System.in);
        double altura = y.nextDouble();
        double imc = ((peso)/Math.pow(altura,2));
        System.out.println("Seu IMC é "+ Math.round(imc));
    }
}
