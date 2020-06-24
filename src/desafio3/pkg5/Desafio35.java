package desafio3.pkg5;
import java.util.Scanner;
/**
 *
 * @author troll
 */
public class Desafio35 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        
        System.out.println("digite um número.");
        numero = ler.nextInt();
        
        if (numero%2 == 0) {
            if (numero >= 0) {
                System.out.println("O número "+numero+" é par e positivo");
            }else{
                System.out.println("O número "+numero+" é par e negativo");
            }
        }else {
            if (numero >= 0) {
                System.out.println("O número "+numero+" é impar e positivo");
            }else{
                System.out.println("O número "+numero+" é impar e negativo");
            } 
        }
    }
}
