package siteMc;

import java.util.Scanner;

public class Promocoes 
{
	private int menupromo;
	Scanner sc = new Scanner(System.in);
	public void verPromocoes()
	{
		menupromo = sc.nextInt();
		switch (menupromo) {
		case 1:
			System.out.println("Ifood");
			System.out.println();
			System.out.println("1 - Classicos do Méqui no Ifood");
			System.out.println("2 - Ate 43% OFF com ifood");
			System.out.println("3 - Fome geladinha de Méqui no sofa?");
			System.out.println("Escolha uma opção: ");
			menupromo = sc.nextInt();
			switch (menupromo) {
			case 1:
				System.out.println("Ifood fora do ar");
				break;
			case 2:
				System.out.println("Ifood fora do ar");
				break;
			case 3:
				System.out.println("Ifood fora do ar");
				break;
			default:
				break;
			}
			break;
		case 2:
			System.out.println("Partiu App?");
			System.out.println();
			System.out.println("1 - Pequenos preços");
			System.out.println("Méqui no precinho sempre cai bem, né? Aproveite cupons de até R$9,90.");
			System.out.println("2 - Os mais pedidos");
			System.out.println("Aquelas ofertas que não tem erro.");
			System.out.println("3 - Pra galera");
			System.out.println("Junta a turma e vem matar essa #FomeDeMéqui.");
			System.out.println("Escolha uma opção: ");
			switch (menupromo) {
			case 1:
				System.out.println("McDonald's App");
				System.out.println();
				System.out.println("Baixe o aplicativo e seja o primeiro a saber de tudo. Fique por dentro de todas as");
				System.out.println("nossas novidades!");
				System.out.println("1 - Android | 2 - IOS");
				menupromo = sc.nextInt();
				switch (menupromo) {
				case 1:
					System.out.println("Cole o link abaixo no seu navegador");
					System.out.println("https://play.google.com/store/apps/details?id=com.mcdo.mcdonalds&hl=pt_BR");
					break;
				case 2:
					System.out.println("Cole o link abaixo no seu navegador");
					System.out.println("https://apps.apple.com/br/app/mcdonalds-app/id1114009187");
					break;
				default:
					break;
				}	
				break;
			case 2:
				System.out.println("McDonald's App");
				System.out.println();
				System.out.println("Baixe o aplicativo e seja o primeiro a saber de tudo. Fique por dentro de todas as");
				System.out.println("nossas novidades!");
				System.out.println("1 - Android | 2 - IOS");
				menupromo = sc.nextInt();
				switch (menupromo) {
				case 1:
					System.out.println("Cole o link abaixo no seu navegador");
					System.out.println("https://play.google.com/store/apps/details?id=com.mcdo.mcdonalds&hl=pt_BR");
					break;
				case 2:
					System.out.println("Cole o link abaixo no seu navegador");
					System.out.println("https://apps.apple.com/br/app/mcdonalds-app/id1114009187");
					break;
				default:
					break;
				}
			case 3:
				System.out.println("McDonald's App");
				System.out.println();
				System.out.println("Baixe o aplicativo e seja o primeiro a saber de tudo. Fique por dentro de todas as");
				System.out.println("nossas novidades!");
				System.out.println("1 - Android | 2 - IOS");
				menupromo = sc.nextInt();
				switch (menupromo) {
				case 1:
					System.out.println("Cole o link abaixo no seu navegador");
					System.out.println("https://play.google.com/store/apps/details?id=com.mcdo.mcdonalds&hl=pt_BR");
					break;
				case 2:
					System.out.println("Cole o link abaixo no seu navegador");
					System.out.println("https://apps.apple.com/br/app/mcdonalds-app/id1114009187");
					break;
				default:
					break;
				}	
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}
	}
}
