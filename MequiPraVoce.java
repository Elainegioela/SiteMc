package siteMc;

import java.util.Scanner;

public class MequiPraVoce 
{
	private int menumequi;
	Scanner sc = new Scanner(System.in);
	Pedidos pedi = new Pedidos();
	public void verMequiPraVoce()
	{
		menumequi = sc.nextInt();
		switch (menumequi) {
		case 1:
			System.out.println("APP do Méqui");
			System.out.println("1 - App do Méqui\nSão várias promoções com até 50% de desconto pra você aproveitar muito pagando pouco.");
			System.out.println("2 - Já add o Méqui Zap?\nAquele contato do whatsapp que nunca te deixa no vácuo e sempre manda promoção boa é o nosso.");
			System.out.println("3 - Que tal um #MéquiNoSofá?\nFaça agora seu pedido e receba em casa pelo delivery.");
			System.out.println("4 - Vem de Méqui Sem Fila!\nÉ só pedir e pagar no App, retirar no Méqui sem fila e partir pro abraço.");
			System.out.println("5 - Vale Méqui\nPra presentear ou pra você que sempre está com #FomeDeMéqui. É só escolher!");
			System.out.println("Escolha opção: ");
			menumequi = sc.nextInt();
			if(menumequi >= 1 && menumequi <= 3)
			{
				System.out.println("McDonald's App");
				System.out.println();
				System.out.println("Baixe o aplicativo e seja o primeiro a saber de tudo. Fique por dentro de todas as");
				System.out.println("nossas novidades!");
				System.out.println("1 - Android | 2 - IOS");
				menumequi = sc.nextInt();
				switch (menumequi) {
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
			}
			else if(menumequi == 4)
				pedi.pedidos();
			else if(menumequi == 5)
			{
				System.out.println("Vale Méqui");
				System.out.println("");
				System.out.println("1 - R$ 15 | 2 - R$ 30 | 4 - R$ 50 | 5 - R$ 100");
				System.out.println("Escolha uma opção: ");
				menumequi = sc.nextInt();
				System.out.println("Vale enviado");
			}
			break;
		case 2:
			System.out.println("McDelivery");
			System.out.println();
			System.out.println("1 - #MéquiNoSofá\nPeça e receba em casa, no trabalho ou onde quiser");
			System.out.println("2 - Restaurantes Participantes\nDescubra o Méqui mais próximo de você");
			System.out.println("3 - Qual seu look pra pegar o McDelivery?\nSeu look de buscar o Méqui Delivery em casa, agora brilhando nas redes do Méqui. Participe do #MéquiLookDelivery"); 
			System.out.println("Escolha uma opção: ");
			menumequi = sc.nextInt();
			switch (menumequi) {
			case 1:
				System.out.println("McDonald's App");
				System.out.println();
				System.out.println("Baixe o aplicativo e seja o primeiro a saber de tudo. Fique por dentro de todas as");
				System.out.println("nossas novidades!");
				System.out.println("1 - Android | 2 - IOS");
				menumequi = sc.nextInt();
				switch (menumequi) {
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
				menumequi = sc.nextInt();
				switch (menumequi) {
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
			case 3: 
				System.out.println("Falha ao abrir o instagram");
				break;
			default:
				break;
			}
			break;
		case 3:
			System.out.println("Mc no ifood");
			System.out.println();
			System.out.println("1 - #MéquiNoSofá\nPeça e receba em casa, no trabalho ou onde quiser");
			System.out.println("2 - Restaurantes Participantes\nDescubra o Méqui mais próximo de você");
			System.out.println("3 - Qual seu look pra pegar o McDelivery?\nSeu look de buscar o Méqui Delivery em casa, agora brilhando nas redes do Méqui. Participe do #MéquiLookDelivery"); 
			System.out.println("Escolha uma opção: ");
			menumequi = sc.nextInt();
			switch (menumequi) {
			case 1:
				System.out.println("McDonald's App");
				System.out.println();
				System.out.println("Baixe o aplicativo e seja o primeiro a saber de tudo. Fique por dentro de todas as");
				System.out.println("nossas novidades!");
				System.out.println("1 - Android | 2 - IOS");
				menumequi = sc.nextInt();
				switch (menumequi) {
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
				menumequi = sc.nextInt();
				switch (menumequi) {
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
			case 3: 
				System.out.println("Falha ao abrir o instagram");
				break;
			default:
				break;
			}
			break;
		case 4:
			System.out.println("Peça e retire");
			System.out.println();
			System.out.println("Peça e pague pelo APP\nRetire no Méqui");
			System.out.println("Facinho de usar. Confere aqui no passo a passo abaixo:");
			System.out.println("Baixe o App do Méqui");
			System.out.println("Entre no Peça e Retire");
			System.out.println("Faça seu pedido e pague pelo App");
			System.out.println("Quando estiver chegando no restaurante, aperte o botão começar a preparar.");
			System.out.println("Escolha como quer retirar seu pedido e aproveite!");
			System.out.println("Ja usou o peça e retire? Use abaixo\nDigite 1 para usar");
			menumequi = sc.nextInt();
			switch (menumequi) {
			case 1:
				pedi.pedidos();
				break;
			default:
				break;
			}
		case 5:
			System.out.println("Vale Méqui");
			System.out.println();
			System.out.println("Escolha o valor do Vale Mequi");
			System.out.println("Receba o vale Méqui fisico ou digital");
			System.out.println("Presentei quem você quiser");
			System.out.println();
			break;
		case 6:
			System.out.println("Méqui Zap Seu novo contatinho");
			System.out.println();
			System.out.println("1 - Já add o Méqui ZAP?\nAquele contatinho que nunca te deixa no vácuo e sempre manda oferta boa é o nosso.");
			System.out.println("Escolha uma opção: ");
			menumequi = sc.nextInt();
			switch (menumequi) {
			case 1:
				System.out.println("Falha ao abrir o zapzap");
				break;

			default:
				break;
			}
			break;
		case 7:
			System.out.println("Drive Tudo do Méqui");
			System.out.println();
			System.out.println("1 - Méqui VIP Drive");
			System.out.println("Descontos exclusivos e todo o conforto pra você dar aquela passadinha no Méqui.");
			System.out.println("Escolha uma opção: ");
			switch (menumequi) {
			case 1:
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
				break;
			default:
				break;
			}
			break;
		case 8:
			System.out.println("PORTAS ABERTAS");
			System.out.println();
			System.out.println("O programa Portas Abertas foi criado para mostrar as boas práticas que fazem parte do dia a dia nos restaurantes da rede. Uma visita guiada permite");
			System.out.println("conhecer mais sobre os rígidos protocolos de higiene, segurança e controle de qualidade das nossas cozinhas. No Brasil, mais de 10 milhões de pessoas já");
			System.out.println("participaram da visita. Na América Latina o programa já recebeu mais de 15 milhões de visitantes, distribuídos em 20 países.");
			System.out.println();
			System.out.println("Por conta da Pandemia, o Portas Abertas mudou e os restaurantes ganharam o reforço do programa McProtegidos, que conta com uma série de medidas");
			System.out.println("adicionais de higiene e segurança para estimular ambientes mais seguros a todos. Para continuar apresentando de forma transparente as novidades e");
			System.out.println("como os restaurantes funcionam, o Phellyx te convida para conhecer a cozinha do McDonald's virtualmente! Clique aqui");
			System.out.println();
			System.out.println("Em uma experiência única, o vídeo 360º proporciona uma visita guiada com imersão completa nos ambientes do restaurante e autonomia para que você");
			System.out.println("escolha o que quer ver. Clique aqui");
			break;
		case 9:
			System.out.println("IMAGENS DE OBRA DE ARTES");
			break;
		default:
			break;
		}
	}
}
