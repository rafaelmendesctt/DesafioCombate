package application;

import java.util.Scanner;

import entities.Champion;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = scanner.nextLine();
		System.out.print("Vida inicial: ");
		int life = scanner.nextInt();
		System.out.print("Ataque: ");
		int damage = scanner.nextInt();
		System.out.print("Armadura: ");
		int armor = scanner.nextInt();
		Champion championA = new Champion(name, life, damage, armor);

		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		scanner.nextLine();
		name = scanner.nextLine();
		System.out.print("Vida inicial: ");
		life = scanner.nextInt();
		System.out.print("Ataque: ");
		damage = scanner.nextInt();
		System.out.print("Armadura: ");
		armor = scanner.nextInt();
		Champion championB = new Champion(name, life, damage, armor);

		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int response = scanner.nextInt();

		int cont = 0;
		while (cont < response) {
			cont++;
			if (championA.getLife() == 0 || championB.getLife() == 0) {
				break;
			}
			System.out.println();
			System.out.printf("Resultado do turno %d: \n", cont);
			championA.takeDamage(championB);
			championB.takeDamage(championA);
			System.out.println(championA.status());
			System.out.println(championB.status());
		}

		System.out.println("\nFIM DO COMBATE");

		scanner.close();
	}
}