package siteMc;

import java.util.Scanner;

public class AppPrincipal
{
	public static void main(String[] args) 
	{
		Cardapio ca = new Cardapio();
		lancamentos la = new lancamentos();
		QuemSomos qm = new QuemSomos();
		Promocoes promo = new Promocoes();
		MequiPraVoce mequi = new MequiPraVoce();
		McDiaFeliz mcdia = new McDiaFeliz();
		int menu1 = 1;
		do 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("BATEU AQUELA #FOMEDEMÉQUI?");
			System.out.println("1 - Cardápio | 2 - Lançamentos | 3 - Quem Somos | 4 - Familia | 5 - Promoçoes | 6 - Méqui pra você | 7 - McDia Feliz\n");
			System.out.println("Escolha uma opção: ");
			menu1 = sc.nextInt();
			switch (menu1) {
			case 1:
				//Cardapio
				System.out.println("Cardapio");
				System.out.println();
				System.out.println("Escolha uma opção:");
				System.out.println("1 - Lançamentos | 2 - Sanduiches Premium | 3 - Sanduiches de Carne Bovina");
				System.out.println("4 - Familia Tasty | 5 - Sanduiches de Frango | 6 - Seleções Méqui");
				System.out.println("7 - McLanche Feliz | 8 - Méqui 100 | 9 - Acompanhamentos");
				System.out.println("10 - Sobremesas | 11 - Bebidas Frias | 12 - Café da Manha");
				System.out.println("13 - Bebidas Quentes | 14 - McOferta | 15 - Méqui Box ");
				System.out.println("Digite 0 para retorna ao menu anterior");
				ca.verCardapio();
				break;
			case 2:
				//lançamentos
				System.out.println("Lançamentos");
				System.out.println();
				System.out.println("Escolha uma opção:");
				System.out.println("Seleções do Méqui.\nCada dia uma seleção diferente para você\n");
				System.out.println("1 - As Seleções do Méqui chegaram.\n8 países. 8 sanduíches. Experimente.\n");
				System.out.println("2 - A novidade que faltava!\nChegou a hora de você fazer aquela Méquizicecom o Molho do CBO e Molho Tasty. Partiu?\n");
				System.out.println("3 - Cola no Méqui.\nPeça pelo combo figurinha!\n");
				System.out.println("4 - Novo McFlurry Espetáculo Kopenhagen.\nPra felicidade da sua #FomeGeladinhaDeMéqui\n");
				System.out.println("5 - Menos BláBláBlá Mais Café\nSeu cafezinho feito com um cafezão.\n");
				System.out.println("6 - McLanche Feliz\nQue tal conhecer a transformação do #McLancheFeliz?\n");
				System.out.println("Digite 0 para retorna ao menu anterior");
				la.verlancamentos();
				break;
			case 3:
				//QuemSomos
				System.out.println("Quem Somos");
				System.out.println();
				System.out.println("1 - Institucional | 2 - Franquias | 3 - Trabalhe concosco ");
				System.out.println("4 - Privacidade | 5 - Desenvolvimento sustentavel e compromisso social | 6 - Publicidade Responsavel");
				System.out.println("Digite 0 para retorna ao menu anterior");
				qm.verQuemSomos();
				break;
			case 4:
				//Familia
				System.out.println("Nova rota: Méqui. ");
				System.out.println("Que tal juntar a família pra ter um momento de muita diversão no Méqui com os Carros na Estrada? ");
				System.out.println();
				System.out.println("1 - Aventureiro Relâmpago McQueen  | 2 - Cruz Ramirez | 3 - Mate ");
				System.out.println("4 - Relâmpago McQueen | 5 - Aventureiro Mate  | 6 -  Ivy");
				System.out.println("7 - Homem das cavernas Relâmpago McQueen | 8 -  Homem das cavernas Mate");
				System.out.println("Digite 0 para retorna ao menu anterior");
				qm.verQuemSomos();
				break;
			case 5:
				//Promoções
				System.out.println("Promoções");
				System.out.println();
				System.out.println("1 - Promoção Ifood | 2 - Promoções APP ");
				System.out.println("Digite 0 para retorna ao menu anterior");
				promo.verPromocoes();
				break;		
			case 6:
				//Mequi Pra você
				System.out.println("Méqui pra você");
				System.out.println();
				System.out.println("1 - APP do Méqui | 2 - McDelivery | 3 - Méqui no Ifood ");
				System.out.println("4 - Peça e retire | 5 - Vale Méqui | 6 - Méqui Zap ");
				System.out.println("7 - Drive-Tudo | 8 - Portas Abertas | 9 - Projeto Grafite ");
				System.out.println("Digite 0 para retorna ao menu anterior");
				mequi.verMequiPraVoce();
				break;
			case 7:
				//MequiDiaFeliz
				System.out.println("Méqui pra você");
				System.out.println();
				System.out.println("1 - Sobre a causa | 2 - Participe | 3 - Contato ");
				System.out.println("4 - Regulamento e Restaurantes Parcipantes | 5 - Receita do Futuro");
				System.out.println("Digite 0 para retorna ao menu anterior");
				mcdia.verMcDiaFeliz();
				break;
			default:
				break;
			}	
		} 
		while (menu1==0);
	}
}
