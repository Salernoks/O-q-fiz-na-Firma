package ramon;
import java.util.Scanner;
  public class SalarioPorHora {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);
        String nome = "nome";
        float  n, ht, vh, s;
        System.out.print("digite o nome do funcionário: ");
        nome = leitor.nextLine();
        System.out.print("Digite o nível do funcionário: ");
        n = leitor.nextFloat();
        System.out.print("digite as horas trabalhadas do funcionário: ");
        ht = leitor.nextFloat();
        if (n == 1){
            vh = 15f;
            s = ht*vh;
            System.out.println("O funcionário: "
            +nome+" trabalhou "
            +ht+" horas por R$ 15,00 (nível 1) e deve receber R$ " +s);
        }else { 
                vh = 18;
                s = ht*vh;
                System.out.println("O funcionário: "
            +nome+" trabalhou "
            +ht+" horas por R$ 18,00 (nível 2) e deve receber R$ " +s);
        }
        if (n == 3){
            vh = 22;
            s = ht*vh;
            System.out.println("O funcionário: "
            +nome+" trabalhou "
            +ht+" horas por R$ 22,00 (nível 3) e deve receber R$ " +s);
        }else {
            vh = 22;
            s = ht*vh;
            System.out.println("O funcionário: "
            +nome+" trabalhou "
            +ht+" horas por R$ 22,00 (nível 3) e deve receber R$ " +s);
            }
   }
}
