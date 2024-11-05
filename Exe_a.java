import java.util.Scanner;
public class Exe_a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do carro: ");
		double valor_carro = sc.nextDouble();
		
		double total = (valor_carro * 0.28) + valor_carro;
		double total2 = (valor_carro * 0.45) + total;
		 
		System.out.println("O valor total do carro é: " + total2);

	}

}
