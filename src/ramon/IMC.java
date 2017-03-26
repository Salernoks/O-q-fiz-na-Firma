package ramon;
  import java.util.Scanner;
     public class IMC {
        public static void main(String[] args) {
           Scanner leitor = new Scanner(System.in);
           double a, p, imc;
           System.out.print("Digite seu peso: ");
           a = leitor.nextDouble();
           System.out.print("Digite sua altura: ");
           p = leitor.nextDouble();
           imc = a/(p*p);
           if (imc<18.5){
               System.out.println("Você está abaixo do peso.");     
           }else if (18.5<=imc && imc<25){
               System.out.println("Seu peso está normal");
           }
            else if (25<=imc && imc<30){
               System.out.println("Você está acima do peso.");
           }if (imc>=30){
               System.out.println("você está com OBESIDADE");
               
        }
    }
}
