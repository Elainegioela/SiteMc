package siteMc;

import java.util.Scanner;

public class lancamentos 
{
	private int menulan;
	private String email="sei";
	Cardapio car = new Cardapio();
	Scanner sc = new Scanner(System.in);
	Pedidos pedi = new Pedidos();
	Sobremesas sobre = new Sobremesas();
	public void verlancamentos()
	{
		menulan = sc.nextInt();
		switch (menulan) {
		case 1:
			System.out.println("Bora provas as\nSeleções do Méqui?");
			System.out.println();
			System.out.println("1 - Pede seu McDeliverye experimente!\nSão 8 países diferentes e você pode provar aí de sua casa.\nÉ só pedir um McDelivery. Bora curtir as Seleções do Méquino sofá?");
			System.out.println("2 - De bike, carro, moto ou o que você quiser.\nPasse no Drive-Tudo e peça já o seu sanduíche favorito das Seleções do Méqui. Vem com tudo.");
			System.out.println("3 - Prove as Seleções do Méquino Peça e Retire.\nVá no App do Méquie garanta seu sanduíche favorito das Seleções do Méquino Peça e Retire. Experimente");
			System.out.println("4 - (Baixe o APP) Fique sempre por dentro das novidades\nó quem tem o app fica por dentro das novidades antes de todo mundo, hein!!");
			System.out.println("5 - Restaurantes Participantes\nDescubra o Méquimais próximo de você");
			System.out.println("6 - Informações Nutricionais\n");
			System.out.println("0 - Menu Principal");
			System.out.println("Escolha uma opção: ");
			menulan = sc.nextInt();
			switch (menulan) {
			case 1:
				pedi.pedidos();
				break;

			case 2:
				System.out.println("Méqui VIPDrive\nTUDO");
				System.out.println();
				System.out.println("Descontos exclusivos pra você passar\nno Drive e matar sua #FomeDeMéqui");
				System.out.println();
				System.out.println("↧ ↧ Conheça as Vantagens ↧ ↧");
				System.out.println("O que o MéquiVIPDrive tem?");
				System.out.println("Descontos Excluvivos\nConteúdos Inéditos\nCupons em primeira mão");
				System.out.println("↧ ↧ Vem Participar ↧ ↧");
				System.out.println("É Bem fácil aproveitar");
				System.out.println("Você cadastra aqui pra fazer parte");
				System.out.println("Você vira VIP. e recebe os descontos exclusivos do Drive-Tudo");
				System.out.println("Pegue o Cupon. acesse o APP do Méqui e gere o QR Code");
				System.out.println("Boa. Agora é so passar no Drive-Tudo e matar #SuaFomeDeMéqui");
				System.out.println("Mande seu Email favorito para cadastrar. Bora: ");
				System.out.println("Digite seu email: ");
				email = sc.next();
				break;
			case 3:
				pedi.pedidos();
				break;
			case 4:
				System.out.println("McDonald's App");
				System.out.println();
				System.out.println("Baixe o aplicativo e seja o primeiro a saber de tudo. Fique por dentro de todas as");
				System.out.println("nossas novidades!");
				System.out.println("1 - Android | 2 - IOS");
				menulan = sc.nextInt();
				switch (menulan) {
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
			case 5:
				System.out.println("Restaurantes participantes");
				System.out.println("");
				System.out.println("Digite o seu endereço ou sua cidade: ");
				menulan = sc.nextInt();
				System.out.println("Loja mais proxima a 3km");
				break;			
			case 6:
				car.verCardapio();
				break;
			default:
				break;
			}
			break;
		case 2:
			System.out.println("A novidade que faltava!");
			System.out.println("Chegou a hora de você fazer aquela Méquizicecom o Molho do CBO e Molho Tasty. Partiu?");
			System.out.println();
			System.out.println("1 - Fome de Novidade? Vai de Molho do CBO.");
			System.out.println("O Molho do CBO (blister 23g) é composto por especiarias e possui sabor e cremosidade icônicos.");
			System.out.println("Vem experimentar o novo Molho do CBO em versão blister e fazer aquela Méquizice!Válido a");
			System.out.println("partir do dia 26/09/2022 enquanto durarem os estoques (limitado a 400 mil unidades).\n");
			System.out.println("2 - Muito Tasty. Muito Méqui.");
			System.out.println("Único por seu sabor defumado, cremosidade e textura. O Molho Tastyé exclusivo McDonald ́s.");
			System.out.println("Bora experimentar o novo Molho Tasty(blister 23g) fazer aquela Méquiziceque só você sabe?");
			System.out.println("Válido a partir do dia 26/09/2022 enquanto durarem os estoques (limitado a 400 mil unidades).\n");
			System.out.println("3 - Novidade no Méqui!");
			System.out.println("Bora pedir os novos Molho do CBO e Molho Tastysem sair do sofá?");
			System.out.println("4 - Partiu Drive?");
			System.out.println("Separa a bike, o skate, o patins, e vem provar os novos molhos do Méqui!");
			System.out.println("5 - Restaurantes Participantes");
			System.out.println("Descubra o Méquimais próximo de você");
			System.out.println("6 - Informações Nutricionais");
			System.out.println("Tudo o que precisa saber sobre as informações nutricionais dos seus produtos favoritos.");
			System.out.println("Escolha uma opção: ");
			menulan = sc.nextInt();
			switch (menulan) {
			case 1:
				pedi.pedidos();
				break;
			case 2:
				pedi.pedidos();
				break;
			case 3:
				pedi.pedidos();
				break;
			case 4:	
				System.out.println("Méqui VIPDrive\nTUDO");
				System.out.println();
				System.out.println("Descontos exclusivos pra você passar\nno Drive e matar sua #FomeDeMéqui");
				System.out.println();
				System.out.println("↧ ↧ Conheça as Vantagens ↧ ↧");
				System.out.println("O que o MéquiVIPDrive tem?");
				System.out.println("Descontos Excluvivos\nConteúdos Inéditos\nCupons em primeira mão");
				System.out.println("↧ ↧ Vem Participar ↧ ↧");
				System.out.println("É Bem fácil aproveitar");
				System.out.println("Você cadastra aqui pra fazer parte");
				System.out.println("Você vira VIP. e recebe os descontos exclusivos do Drive-Tudo");
				System.out.println("Pegue o Cupon. acesse o APP do Méqui e gere o QR Code");
				System.out.println("Boa. Agora é so passar no Drive-Tudo e matar #SuaFomeDeMéqui");
				System.out.println("Mande seu Email favorito para cadastrar. Bora: ");
				System.out.println("Digite seu email: ");
				email = sc.next();
				break;
			case 5:
				System.out.println("Restaurantes participantes");
				System.out.println("");
				System.out.println("Digite o seu endereço ou sua cidade: ");
				menulan = sc.nextInt();
				System.out.println("Loja mais proxima a 3km");
				break;
			case 6:
				car.verCardapio();
				break;
			default:
				break;
			}
			break;
		case 3:
			System.out.println("Cola no Méqui!");
			System.out.println();
			System.out.println("Sabia que tá rolando um combo especial aqui no Méqui? McOferta(com bebidas Coca-Cola) +");
			System.out.println("Sobremesa e1 Pacote de Figurinhas. Cola no Méqui e aproveita. Peça pelo Combo Figurinha,");
			System.out.println("válido a partir de 20/09/2022, enquanto durarem os estoques.");
			System.out.println("1 - Confira o regulamento");
			System.out.println("2 - Combo Figurinha com Fome de Méqui?");
			System.out.println("Confira abaixo os sanduíches participantes:");
			System.out.println("3 - Quer ganhar figurinhas da Panini?");
			System.out.println("Peça o Combo Figurinha pelo McDeliverye participe da promoção!");
			System.out.println("4 - O Drive-Thrutambém é Drive-Tudo!");
			System.out.println("Acelera pro Drive-Tudo que esse combo tá imperdível!");
			System.out.println("5 - Figurinha da Panini?");
			System.out.println("Peça o Combo Figurinha pelo Peça e Retire e aproveite o dobro de figurinhas!");
			System.out.println("6 - Tá fazendo o álbum da Copa?");
			System.out.println("Com o Peça e Retire do Méqui, você pode completar mais rápido recebendo 2 pacotes de");
			System.out.println("figurinhas no teu \"Combo Figurinhas\"! É só entrar no menu Peça e Retire no nosso app, fazer seu");
			System.out.println("pedido e pagar pelo aplicativo! Aí é só retirar seu pedido no balcão e aproveitar para já colar suas");
			System.out.println("novas figurinhas!");
			System.out.println("7 - Fique sempre por dentro das novidades");
			System.out.println("Só quem tem o app por dentro das novidades antes de todo mundo, hein!!");
			System.out.println("8 - Restaurantes Participantes");
			System.out.println("Descubra o Méqui mais próximo de você");
			switch (menulan) {
			case 1:
				System.out.println("REGULAMENTO");
				System.out.println();
				System.out.println("CAMPANHA \"COLÁ NO MÉQUI” VÁLIDA A PARTIR DE 20/09/2022, ENQUANTO DURAR OS ESTOQUES DE PACOTES DE FIGURINHAS DO ALBUM OFICIAL DA COPA DO MUNDO DA FIFA 2022 (4 milhões de pacotes");
				System.out.println("de figurinhas do Álbum Oficial da Copa do Mundo da FIFA 2022). Saiba mais sobre a campanha e sanduíches participantes em http://mcdonalds.com.br/colanomequi. ");
				System.out.println();
				System.out.println("TODOS OS PRODUTOS DO “COMBO FIGURINHA”, INCLUINDO PACOTE DE FIGURINHAS DO ALBUM OFICIAL DA COPA DO MUNDO DA FIFA 2022 PODEM SER ADQUIRIDOS SEPARADAMENTE. O “Combo Figurinhas”");
				System.out.println("é composto por: 1 sanduíche (CONSULTE SANDUÍCHES PARTICIPANTES NOS RESTAURANTES E NO SITE) + 1 McFritas (Média ou Grande) ou McNuggets (4 unidades) + 1 Bebida Coca-Cola (não válido para");
				System.out.println("McShake e Del Valle 100% Uva) +1 Pacote de Figurinhas + 1 Sobremesa. Comprando o Combo Figurinhas via “Peça e Retire” no App do McDonald’s (disponível na Google Store e App Store), o combo vem com 2");
				System.out.println("pacotes de figurinhas. O Combo Figurinha não poderá ter como o acompanhamento a Side Salad. O McShake não é considerado uma sobremesa. Coca-Cola e Panini: uso autorizado pelos titulares das marcas.");
				System.out.println("Consulte valores do “Combo Figurinhas” nos restaurantes. Campanha não é cumulativa Mais informações como composição e informações nutricionais dos produtos em www.mcdonalds.com.br/cardapio.");
				System.out.println("Imagens meramente ilustrativas.");
				break;
			case 2:
				System.out.println("Combo Figurinha com Fome de Méqui?");
				System.out.println();
				System.out.println("Confira abaixo os sanduíches participantes:");
				System.out.println("BigMac | McChicken | McChicken Bacon | Cheddar McMelt | Duplo Cheddar McMelt");
				System.out.println("Quarterão | Duplo Quarterão | Mega Nuggeds | Duplo Bacon | Triplo Chesseburger");
				System.out.println("McCrispy Chicken Classic | McCrispy Chicken Spicy | McCrispy Chicken Deluxe | McNífico | BigTasty");
				System.out.println("BigTasty Turbo Bacon | McClub | Duplo Burger com Queijo | McNuggets com 10");
				break;
			case 3:
				pedi.pedidos();				
				break;
			case 4:
				pedi.pedidos();
				break;
			case 5:	
				pedi.pedidos();	
				break;
			case 6:
				pedi.pedidos();
			case 7:
				System.out.println("McDonald's App");
				System.out.println();
				System.out.println("Baixe o aplicativo e seja o primeiro a saber de tudo. Fique por dentro de todas as");
				System.out.println("nossas novidades!");
				System.out.println("1 - Android | 2 - IOS");
				menulan = sc.nextInt();
				switch (menulan) {
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
			case 8:
				System.out.println("Restaurantes participantes");
				System.out.println("");
				System.out.println("Digite o seu endereço ou sua cidade: ");
				menulan = sc.nextInt();
				System.out.println("Loja mais proxima a 3km");
				break;
			default:
				break;
			}
			break;
		case 4:
			System.out.println("Novo McFlurry Espetáculo Kopenhagen");
			System.out.println();
			System.out.println("1 - Muita cremosidade e muito chocolate pra você!");
			System.out.println("Massa geladinha de baunilha, cobertura de morango, chocolate ou caramelo e o delicioso tablete");
			System.out.println("de chocolate ao leite Kopenhagen compõe essa sobremesa trazem o sabor único, com toda a");
			System.out.println("qualidade e sabor a cada mordida.");
			System.out.println("2 - Já conhece o Peça e Retire?");
			System.out.println("Entre no menu Peça e Retire no nosso app, faça seu pedido e pague pelo aplicativo. Aí é só retirar seu pedido no balcão e aproveitar!");
			System.out.println("3 - McFlurry no Sofá!");
			System.out.println("Bora pedir o novo McFlurry pelo McDelivery?");
			System.out.println("4 - Partiu Drive-Tudo?");
			System.out.println("Vai passando de moto, bike, skate, acabe com sua vontade de Sobremesa geladinha e ainda garante descontos exclusivos.");
			System.out.println("5 - Restaurantes Participantes");
			System.out.println("Descubra o Méqui mais próximo de você​");
			System.out.println("6 - Informações Nutricionais");
			System.out.println("Tudo o que precisa saber sobre as informações nutricionais dos seus produtos favoritos");
			System.out.println("Escolha um opção: ");
			menulan = sc.nextInt();
			switch (menulan) {
			case 1:
				sobre.McFlurryEKChocolate();
				sobre.McColossoCaramelo();
				sobre.McFlurryEKMorando();
				break;
			case 2:
				pedi.pedidos();
				break;
			case 3:
				pedi.pedidos();
				break;
			case 4:
				System.out.println("Partiu Drive-Tudo?");
				System.out.println("Vai passando de moto, bike, skate, acabe com sua vontade de Sobremesa geladinha e ainda garante descontos exclusivos.");
				break;
			case 5:
				System.out.println("Restaurantes participantes");
				System.out.println("");
				System.out.println("Digite o seu endereço ou sua cidade: ");
				menulan = sc.nextInt();
				System.out.println("Loja mais proxima a 3km");
				break;
			default:
				break;
			}
			break;
		case 5:
			System.out.println("Café coado\nMcCafé");
			System.out.println();
			System.out.println("Simples assim!");
			System.out.println("afé coado com grãos 100% arábicos. Agora na versão de 100ml para você dar um up no seu dia!\n");
			System.out.println("Cafezinho feito com cafezão");
			System.out.println("Pra quem já tá pensando em repetir, temos também as versões de 200 e 300ml. Bateu a vontade");
			System.out.println("de provar? Peça um Méqui Sem Fila e retire no seu Méqui favorito. Simples assim.");
			break;
		case 6:
			System.out.println("McLanche Feliz");
			System.out.println("O #McLanche Feliz tem na sua composição produtos feitos com corantes e aromatizantes");
			System.out.println("naturais. Que tal desfrutar em família?");
			System.out.println("Compromisso com as famílias");
			System.out.println("O McLanche Feliz tem compromisso com a transparência");
			break;
		case 0:
			AppPrincipal.main(null);
			break;
		default:
			break;
		}
	}
}

