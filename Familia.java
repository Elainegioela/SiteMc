package siteMc;

import java.util.Scanner;

public class Familia 
{
	Scanner sc = new Scanner(System.in);
	private int menufa;
	public void verFamilia()
	{
		menufa = sc.nextInt();
		switch (menufa) {
		case 1:
			System.out.println("Aventureiro Relâmpago McQueen");
			System.out.println();
			System.out.println("Coloque o Aventureiro Relâmpago McQueen sobre uma superfície plana. Deslize-o");
			System.out.println("para trás e depois solte-o, para ver como sai lançado para a frente, fazendo ");
			System.out.println("uma curva à direita.Vem com uma folha de adesivos.");
			break;
		case 2:
			System.out.println("Cruz Ramirez");
			System.out.println();
			System.out.println("Coloque o Cruz Ramirez sobre uma superfície plana. Deslize-o");
			System.out.println("para trás e depois solte-o, para ver como sai lançado para a frente, fazendo ");
			System.out.println("uma curva à direita.Vem com uma folha de adesivos.");
			break;
		case 3:
			System.out.println("Mate");
			System.out.println();
			System.out.println("Coloque o Mate sobre uma superfície plana. Deslize-o");
			System.out.println("para trás e depois solte-o, para ver como sai lançado para a frente, fazendo ");
			System.out.println("uma curva à direita.Vem com uma folha de adesivos.");
			break;
		case 4:
			System.out.println("Relâmpago McQueen");
			System.out.println();
			System.out.println("Coloque o Relâmpago McQueen sobre uma superfície plana. Deslize-o");
			System.out.println("para trás e depois solte-o, para ver como sai lançado para a frente, fazendo ");
			System.out.println("uma curva à direita.Vem com uma folha de adesivos.");
			break;
		case 5:
			System.out.println("Aventureiro Mate");
			System.out.println();
			System.out.println("Coloque o Aventureiro Mate sobre uma superfície plana. Deslize-o");
			System.out.println("para trás e depois solte-o, para ver como sai lançado para a frente, fazendo ");
			System.out.println("uma curva à direita.Vem com uma folha de adesivos.");
			break;
		case 6:
			System.out.println("Ivy");
			System.out.println();
			System.out.println("Coloque o Ivy sobre uma superfície plana. Deslize-o");
			System.out.println("para trás e depois solte-o, para ver como sai lançado para a frente, fazendo ");
			System.out.println("uma curva à direita.Vem com uma folha de adesivos.");
			break;
		case 7:
			System.out.println("Homem das cavernas Relâmpago McQueen");
			System.out.println();
			System.out.println("Coloque o Homem das cavernas Relâmpago McQueen sobre uma superfície plana. Deslize-o");
			System.out.println("para trás e depois solte-o, para ver como sai lançado para a frente, fazendo ");
			System.out.println("uma curva à direita.Vem com uma folha de adesivos.");
			break;
		case 8:
			System.out.println("Homem das cavernas Mate");
			System.out.println();
			System.out.println("Coloque o Homem das cavernas Mate sobre uma superfície plana. Deslize-o");
			System.out.println("para trás e depois solte-o, para ver como sai lançado para a frente, fazendo ");
			System.out.println("uma curva à direita.Vem com uma folha de adesivos.");
			break;
		case 0:
			AppPrincipal.main(null);
			break;
		default:
			break;
		}
	}
}
