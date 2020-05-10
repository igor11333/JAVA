import java.util.Scanner;
public class EX04QUADRADO {
    public static void main(String[] args) {
        System.out.println("Digite a largura do quadrado: ");
        Scanner x = new Scanner(System.in);
        double largura = x.nextDouble();
        double area = Math.pow(largura,2);
        System.out.println("A área do quadrado é de "+area+"²");
    }
}