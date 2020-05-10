import java.util.Scanner;
public class EX04TRIANGULO{
    public static void main(String[] args) {
        System.out.println("Digite a altura do triângulo: ");
        Scanner y = new Scanner(System.in);
        double altura = y.nextDouble();
        System.out.println("Digite o base do triângulo: ");
        Scanner x = new Scanner(System.in);
        double base = x.nextDouble();
        double area = (altura * base) / 2;
        System.out.println("A área do triângulo é "+area);
    }
    
}