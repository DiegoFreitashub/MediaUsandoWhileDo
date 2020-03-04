import java.util.Scanner;

				class Main {

				public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int total = 0;
				int contador = 1;
				int n;		
				
				System.out.println("Digite a quantidade de notas a serem lidas: ");
				n = sc.nextInt();
			 
			
			do{
			System.out.println("Digite a nota " + contador +":");
			int nota = sc.nextInt();
			contador = contador +1;
			total = total + nota;
			}while (contador <= n);
				
				sc.close();
				int media = (total/n);
				System.out.println("Media das notas: " + media);
				sc.close();
			}

		

	}

