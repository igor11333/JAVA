import java.util.Scanner;
public class EX02 {
    public static void main(String[] args){
        Scanner nome = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome1 = nome.nextLine();
        double [] notas = new double[4];
        double total = 0;
        for (int i=0 , x=1; i < 4;i++, x++){
            Scanner nota = new Scanner(System.in);
            System.out.println("Digite a "+x+"°"+" nota.");
            notas[i] = nota.nextDouble();
            total = total + notas[i];
        }
        double media = total / 4;
        System.out.println("A média de "+nome1+" é "+media);
        }
}