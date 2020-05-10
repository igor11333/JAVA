import java.util.Scanner;
public class EX04MILHAS {
    public static void main(String[] args){
        System.out.println("Digite a distância(km)");
        Scanner x = new Scanner(System.in);
        double km = x.nextDouble();
        double milha = km / 1.60934;
        System.out.println(km+"km equivalem a "+String.format("%.2f",milha)+" milhas.");
    }
}