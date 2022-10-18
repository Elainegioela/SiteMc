package siteMc;

import java.util.Scanner;

public class Cardapio {
	private int menuCardapio;
	Scanner sc = new Scanner(System.in);
	Lanches lanche = new Lanches();
	Sobremesas sobrem = new Sobremesas();
	Acompanhamentos acomp = new Acompanhamentos();
	LanchesDeFrango lanchefrango = new LanchesDeFrango();
	BebidasFrias bebidaFria = new BebidasFrias();
	BebidasQuentes  bebidaquente = new BebidasQuentes();
	CafeDaManha cafe = new CafeDaManha();
	public void verCardapio() 
	{
		menuCardapio = sc.nextInt();
		switch (menuCardapio) {
		case 1:	
			do {
			System.out.println();
			System.out.println("Lançamentos");
			System.out.println();
			System.out.println("Escolha uma opção");
			System.out.println("1 - McBrasil | 2 - McFlurry Brasil | 3 - McEspanha | 4 - McArgentina | 5 - McAlemanha");
			System.out.println("6 - McMéxico | 7 - McFrança | 8 - McEUA | 9 - McCatar | 10 - McFlurry Espetaculo Kopenhagen Morango");
			System.out.println("11 - McFlurry Espetáculo Kopenhagen Chocolate | 12 - McFlurry Espetáculo Kopenhagen Caramelo");
			System.out.println("13 - Blister CBO | 14 - Blister Tasty");
			System.out.println("0 = Retorna ao menu principal");
			menuCardapio = sc.nextInt();
			switch (menuCardapio) {
			case 1:
				lanche.McBrasil();
				break;
			case 2:
				lanche.McFlurryBrasil();
				break;
			case 3:
				lanche.McEspanha();
				break;
			case 4:
				lanche.McArgentina();
				break;
			case 5:
				lanche.McAlemanha();
				break;
			case 6:
				lanche.McMexico();
				break;
			case 7:
				lanche.McFrança();
				break;
			case 8:	
				lanche.McEUA();
				break;
			case 9:
				lanche.McCatar();
				break;
			case 10:
				sobrem.McFlurryEKMorando();
				break;
			case 11:
				sobrem.McFlurryEKChocolate();
				break;
			case 12:
				sobrem.McFlurryEKCaramelo();
				break;
			case 13:
				acomp.BlisterCBO();
				break;
			case 14:
				acomp.BlisterTasty();
				break;
			case 0:
				AppPrincipal.main(null);
				break;
			default:
				break;
			}
			}while(menuCardapio != 0);
			break;
		case 2:
			do {
			System.out.println();
			System.out.println("Sanduiches Premium");
			System.out.println();
			System.out.println("Escolha uma opção:");
			System.out.println("1 - McClub | 0 = Retorna ao menu principal");
			menuCardapio = sc.nextInt();
			switch (menuCardapio) {
			case 1:
				lanche.McClub();
				break;
			case 0:
				AppPrincipal.main(null);
				break;	
			default:
				break;
			}
			}while(menuCardapio != 0);
			break;
		case 3:
			do {
				System.out.println();	
			System.out.println("Sanduiches de Carne Bovina");
			System.out.println();
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Big Mac | 2 - Duplo Quarterão | 3 - Quarterão com queijo | 4 - McNífico Bacon | 5 - Duplo Cheddar McMelt");
			System.out.println("6 - Cheddar McMelt | 7 - Duplo Burger Bacon | 8 - Duplo Burge com queijo | 9 - Triplo Chesseburger | 10 - McFiesta");
			System.out.println("11 - Chesseburger | 12 - Hamburger | 0 = retornar para o menu principal");
			menuCardapio = sc.nextInt();
			switch (menuCardapio) 
			{
			case 1:
				lanche.BigMac();
				break;
			case 2:
				lanche.DuploQuarterao();
				break;
			case 3:
				lanche.QuarteraoComQueijo();
				break;
			case 4:
				lanche.McNificoBacon();
				break;
			case 5:
				lanche.DuploCheddarMcMelt();
				break;
			case 6:
				lanche.CheddarMcMelt();
				break;
			case 7:
				lanche.DuploBurgerBacon();
				break;
			case 8:
				lanche.DuploBurguerComQueijo();
				break;
			case 9:
				lanche.TriploCheeseburger();
				break;
			case 10:
				lanche.McFiesta();
				break;
			case 11:
				lanche.Cheeseburger();
				break;
			case 12:
				lanche.Hamburger();
				break;
			case 0:
				AppPrincipal.main(null);
				break;
			default:
				break;
			}
			}while(menuCardapio != 0);
			break;
		case 4:
			do{
				System.out.println();	
				System.out.println("Família Tasty");
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println("1 - Big Tasty | 2 - Big Tast Turbo Bacon | 0 = Retorna ao menu principal");
				menuCardapio = sc.nextInt();
				switch (menuCardapio) {
				case 1:
					lanche.BigTasty();
					break;
				case 2:
					lanche.BigTastyTurboBacon();
					break;
				case 0:
					AppPrincipal.main(null);
					break;	
				default:
					break;
				}
			}while(menuCardapio != 0);
			break;
		case 5:
			do {
				System.out.println();
				System.out.println("Sanduíches de Frango");
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println("1 - McCrispy Chicken Deluxe | 2 - McCrispy Chicken Classic | 3 - McCrispy Chicken Spicy | 4 - McChicken Bacon | 5 - McChicken");
				System.out.println("6 - Chicken Jr");
				menuCardapio = sc.nextInt();
				switch (menuCardapio) {
				case 1:
					lanchefrango.McCrispyChickenDeluxe();
					break;
				case 2:
					lanchefrango.McCrispyChickenClassic();
					break;
				case 3:
					lanchefrango.McCrispyChickenSpicy();
					break;
				case 4:
					lanchefrango.McChickenBacon();
					break;
				case 5:
					lanchefrango.McChicken();
					break;
				case 6:
					lanchefrango.ChickenJr();
					break;	
				case 0:
					AppPrincipal.main(null);
				default:
					break;
				}
			}while(menuCardapio != 0);
			break;
		case 6:
			do {
				System.out.println();
				System.out.println("Seleções do Méqui");
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println("1 - McBrasil | 2 - Mc Flurry Brasil | 3 - Mc Espanha | 4 - Mc Argentina | 5 - McAlemanha");
				System.out.println("6 - McMexico | 7 - McFrança | 8 - McEUA | 9 - McCatar | 0 - Menu Principal");
				menuCardapio = sc.nextInt();
				switch (menuCardapio) {
				case 1:
					lanche.McBrasil();
					break;
				case 2:
					sobrem.McFlurryBrasil();
					break;
				case 3:
					lanche.McEspanha();
					break;
				case 4:
				lanche.McArgentina();
					break;
				case 5:
					lanche.McAlemanha();
					break;
				case 6:
					lanche.McMexico();
					break;
				case 7:
					lanche.McFrança();
					break;
				case 8:
					lanche.McEUA();
					break;
				case 9:
					lanche.McCatar();
					break;		
				case 0:
					AppPrincipal.main(null);	
				default:
				break;
				}
			}while(menuCardapio != 0);
			break;
		case 7:
			do {
				System.out.println();
				System.out.println("McLanche Feliz");
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println("1 - Produtos | 2 - Acompanhamentos");
				System.out.println("3 - Bebidas | 4 - Sobremesas");
				System.out.println("0 - Menu Principal");
				menuCardapio = sc.nextInt();
				switch (menuCardapio) {
				case 1:
					System.out.println("");
					acomp.ChickenMcNuggets4U();
					System.out.println("");
					lanche.McFiesta();
					System.out.println("");
					lanche.Hamburger();
					System.out.println("");
					break;
				case 2:
					System.out.println("");
					acomp.McFritasKids();
					System.out.println("");
					acomp.Tomatinho();
					System.out.println("");
					break;
				case 3:
					System.out.println("");
					bebidaFria.AguaMineral();
					System.out.println("");
					bebidaFria.DelValleMcFeliz();			
					System.out.println("");
					break;
				case 4:
					System.out.println("");
					sobrem.PetitSuisseSaborMorango();
					System.out.println("");
					break;
				case 0:
					AppPrincipal.main(null);
					break;
				default:
					break;
				}	
			}while(menuCardapio != 0);
			break;
		case 8:
			do {
				System.out.println();
				System.out.println("Méqui 1000");
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println("1 - SuperMc | 2 - McRings Cheddar Bacon | 3 - Caldo&Freddo Chocolate | 4 - Caldo&Freddo Morango | 5 - Caldo&Freddo Caramelo");
				System.out.println("6 - McRings Bacon | 0 - Menu Principal");
				menuCardapio = sc.nextInt();
				switch (menuCardapio) {
				case 1:
					lanche.SuperMc();
					break;
				case 2:
					acomp.McRingsCheddarBacon();
					break;
				case 3:
					sobrem.CaldoFreddoChocolate();
					break;
				case 4:
					sobrem.CaldoFreddoMorango();
					break;
				case 5:
				sobrem.CaldoFreddoCaramelo();
					break;
				case 6:
					lanche.McRingsBacon();
					break;
				case 0:
					AppPrincipal.main(null);	
					break;
				default:
					break;
				}
			}while(menuCardapio != 0);
			break;
		case 9:
			do {
				System.out.println();
				System.out.println("Acompanhamentos");
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println("1 - McFritas Cheddar Bacon | 2 - McFritas Grande | 3 - McFritas Média | 4 - McFritas Pequena | 5 - McFritas Kids");
				System.out.println("6 - Chicken McNuggets 6 unidades | 7 - Chicken McNuggets 4 unidades | 8 - Chicken McNuggets 10 unidades | 9 - Molho Agridoce | 10 - Molho Barbecue");
				System.out.println("11 - Molho Ranch | 12 - Molho Caipira | 13 - Mega McNuggets | 14 - Ketchup | 15 - Mostarda");
				System.out.println("16 - Tomatinho | 17 - Mega McFritas | 18 - Blister CBO | 19 - Blister Tasty");
				menuCardapio = sc.nextInt();
				switch (menuCardapio) {
				case 1:
					acomp.McFritasCheddarBacon();
					break;
				case 2:
					acomp.McFritasGrande();
					break;
				case 3:
					acomp.McFritasMedia();
					break;	
				case 4:
					acomp.McFritasPequena();
					break;
				case 5:
					acomp.McFritasKids();
					break;
				case 6:
					acomp.ChickenMcNuggets6U();
					break;
				case 7:
					acomp.ChickenMcNuggets4U();
					break;
				case 8:
					acomp.ChickenMcNuggets10U();
					break;
				case 9:
					acomp.MolhoAgridoce();
					break;
				case 10:
					acomp.MolhoBarbecue();
					break;
				case 11:
					acomp.MolhoRanch();
					break;
				case 12:
					acomp.MolhoCaipira();
					break;
				case 13:
					acomp.MegaMcNuggets();
					break;
				case 14:
					acomp.Ketchup();
					break;	
				case 15:
					acomp.Mostarda();
					break;		
				case 16:
					acomp.Tomatinho();
					break;	
				case 17:
					acomp.MegaMcFritas();
					break;
				case 18:
					acomp.BlisterCBO();
					break;	
				case 19:
					acomp.BlisterTasty();
					break;	
				case 0:
					AppPrincipal.main(null);
					break;		
				default:
					break;
				}
				
			}while(menuCardapio != 0);
			break;
		case 10:
			do {
				System.out.println();
				System.out.println("Sobremesas");
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println("1 - Casquinha Baunilha | 2 - Casquinha Chocolate | 3 - Casquinha Mista | 4 - Sundae Morango | 5 - Sundae Chocolate");
				System.out.println("6 - Sundae Caramelo | 7 - Top Sundae Morango | 8 - Top Sundae Chocolate | 9 - Top Sundae Caramelo | 10 - McColosso Chocolate");
				System.out.println("11 - McColosso Caramelo | 12 - Petit Suisse Sabor Morango | 13 - Torta de Maçã | 14 - Torta de Banana | 15 - McShake Morango");
				System.out.println("16 - McShake Ovomaltine | 17 - McShake Kopenhagen | 18 - McFlurry M&Ms | 19 - McFlurry Espetáculo Kopenhagen Chocolate | 20 - McFlurry Espetáculo Kopenhagen Morango");
				System.out.println("21 - McFlurry Espetáculo Kopenhagen Caramelo | 22 - McFlurry Ovomaltine® | 23 - McFlurry Prestígio Chocolate | 24 - McFlurry Prestígio Morango | 25 - McFlurry Prestígio Caramelo");
				menuCardapio = sc.nextInt();
				switch (menuCardapio) {
				case 1:
					sobrem.CasquinhaBaunilha();
					break;
				case 2:
					sobrem.CasquinhaChocolate();
					break;
				case 3:
					sobrem.CasquinhaMista();
					break;
				case 4:
					sobrem.SundaeMorango();
					break;
				case 5:
					sobrem.SundaeChocolate();
					break;
				case 6:
					sobrem.SundaeCaramelo();
					break;
				case 7:
					sobrem.TopSundaeMorango();
					break;
				case 8:
					sobrem.TopSundaeChocolate();
					break;
				case 9:
					sobrem.TopSundaeCaramelo();
					break;
				case 10:
					sobrem.McColossoChocolate();
					break;
				case 11:
					sobrem.McColossoCaramelo();
					break;
				case 12:
					sobrem.PetitSuisseSaborMorango();
					break;
				case 13:
					sobrem.TortaDeMaca();
					break;
				case 14:
					sobrem.TortaDeBanana();
					break;
				case 15:
					sobrem.McShakeMorango();
					break;
				case 16:
					sobrem.McShakeOvomaltine();
					break;
				case 17:
					sobrem.McShakeKopenhagen();
					break;
				case 18:
					sobrem.McFlurryMMs();
					break;
				case 19:
					sobrem.McFlurryEKChocolate();
					break;
				case 20:
					sobrem.McFlurryEKMorando();
					break;
				case 21:
					sobrem.McFlurryEKCaramelo();
					break;
				case 22:
					sobrem.McFlurryOvomaltine();
					break;
				case 23:
					sobrem.McFlurryPrestígioChocolate();
					break;
				case 24:
					sobrem.McFlurryPrestígioMorango();
					break;
				case 25:
					sobrem.McFlurryPrestígioCaramelo();
					break;
				case 0:
					AppPrincipal.main(null);
					break;
				default:
					break;
				}
				
			}while(menuCardapio != 0);
			break;
		case 11:
			do {
				System.out.println();
				System.out.println("Sobremesas");
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println("1 - Coca-Cola 300mL | 2 - Fanta Laranja 500ml | 3 - Fanta Laranja 700ml | 4 - Coca-Cola 500ml | 5 - Coca-Cola 700ml");
				System.out.println("6 - Coca-Cola Zero 300ml | 7 - Coca-Cola Zero 500ml | 8 - Coca-Cola Zero 700ml | 9 - Fanta Laranja 300ml | 10 - Fanta Guaraná 300ml");
				System.out.println("11 - Fanta Guaraná 500ml | 12 - Fanta Guaraná 700ml | 13 - Del Valle Laranja 300ml | 14 - Del Valle Laranja 500ml | 15 - Del Valle Laranja 700ml");
				System.out.println("16 - Del Valle Uva 300ml | 17 - Del Valle Uva 500ml | 18 -Del Valle Uva 700ml | 19 - Água Mineral | 20 - Del Valle 100% Uva (McLanche Feliz)");
				System.out.println("0 - Menu Principal");
				menuCardapio = sc.nextInt();
				switch (menuCardapio) {
				case 1:
					bebidaFria.CocaCola300mL();
					break;
				case 2:
					bebidaFria.FantaLaranja700ml();
					break;
				case 3:
					bebidaFria.FantaLaranja500ml();
					break;
				case 4:
					bebidaFria.CocaCola500mL();
					break;
				case 5:
					bebidaFria.CocaCola700mL();
					break;
				case 6:
					bebidaFria.CocaColaZero300mL();
					break;
				case 7:
					bebidaFria.CocaColaZero500mL();
					break;
				case 8:
					bebidaFria.CocaColaZero700mL();
					break;
				case 9:
					bebidaFria.FantaLaranja300ml();
					break;
				case 10:
					bebidaFria.FantaGuarana300ml();
					break;
				case 11:
					bebidaFria.FantaGuarana500ml();
					break;
				case 12:
					bebidaFria.FantaGuarana700ml();
					break;
				case 13:
					bebidaFria.DelValleLaranja300ml();
					break;
				case 14:
					bebidaFria.DelValleLaranja500ml();
					break;
				case 15:
					bebidaFria.DelValleLaranja700ml();
					break;
				case 16:
					bebidaFria.DelValleUva300ml();
					break;
				case 17:
					bebidaFria.DelValleUva500ml();
					break;
				case 18:
					bebidaFria.DelValleUva700ml();
					break;
				case 19:
					bebidaFria.AguaMineral();
					break;
				case 20:
					bebidaFria.DelValleMcFeliz();
					break;
				case 0:
					AppPrincipal.main(null);
					break;
				default:
					break;
				}
								
			}while(menuCardapio != 0);
			break;
		case 12:
			do {
				System.out.println();
				System.out.println("Café da Manhã");
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println("1 - Queijo Quente | 2 - Croissant de Presunto e Queijo | 3 - Pão de Queijo | 4 - Capuccino 300ml | 5 - Capuccino 200ml");
				System.out.println("6 - Café com Leite 200ml | 7 - Café com Leite 300ml | 8 - Café Premium 300ml | 9 - Café Premium 100ml | 10 - Café Premium 200ml");
				System.out.println("11 - Chocolate Quente 300ml | 12 - Chocolate Quente 200ml | 0 - Menu Principal");
				menuCardapio = sc.nextInt();
				switch (menuCardapio) {
				case 1:
					cafe.QueijoQuente();
					break;
				case 2:
					cafe.CroissantDePresuntoEQueijo();
					break;
				case 3:
					cafe.PaodeQueijo();
					break;
				case 4:
					bebidaquente.Capuccino300ml();
					break;
				case 5:
					bebidaquente.CafeComLeite200ml();
					break;
				case 6:
					bebidaquente.CafeComLeite200ml();
					break;
				case 7:
					bebidaquente.CafeComLeite300ml();
					break;
				case 8:
					bebidaquente.CafePremium300ml();
					break;
				case 9:
					bebidaquente.CafePremium100ml();
					break;
				case 10:
					bebidaquente.CafePremium200ml();
					break;
				case 11:
					bebidaquente.ChocolateQuente300ml();
					break;
				case 12:
					bebidaquente.ChocolateQuente200ml();
					break;
				case 0:
					AppPrincipal.main(null);
					break;				
				default:
					break;
				}
				
			}while(menuCardapio != 0);	
			break;
		case 13:
			do {
				System.out.println();
				System.out.println("Café da Manhã");
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println("1 - Café Premium 100ml | 2 - Café Premium 200ml | 3 - Café Premium 300ml | 4 - Café com Leite 200ml | 5 - Café com Leite 300ml");
				System.out.println("6 - Capuccino 200ml | 7 - Capuccino 300ml | 8 - Chocolate Quente 200ml | 9 - Chocolate Quente 300ml| 0 - Menu Principal\"");
				menuCardapio = sc.nextInt();
				switch (menuCardapio) {
				case 1:
				bebidaquente.CafePremium100ml();	
					break;
				case 2:
				bebidaquente.CafePremium200ml();	
					break;
				case 3:
				bebidaquente.CafePremium300ml();	
					break;		
				case 4:
				bebidaquente.CafeComLeite200ml();	
					break;
				case 5:
				bebidaquente.CafeComLeite300ml();	
					break;	
				case 6:
				bebidaquente.Capuccino200ml();
					break;
				case 7:
				bebidaquente.Capuccino300ml();
					break;
				case 8:
				bebidaquente.ChocolateQuente200ml();
					break;	
				case 9:
				bebidaquente.Capuccino300ml();
					break;
				case 0:
					AppPrincipal.main(null);
					break;
				default:
					break;
				}	
			}while(menuCardapio != 0);	
			break;	
		case 14:
			do {
				System.out.println();
				System.out.println("McOferta");
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println("1 - BigMac | 2 - Quarterão com Queijo | 3 - Cheddar McMelt | 4 - McChicken | 5 - Big Tasty");
				System.out.println("6 - McNífico Bacon | 7 - Chicken McNuggets 10 Unidades | 0 - Menu Principal\"");
				menuCardapio = sc.nextInt();
				switch (menuCardapio) {
				case 1:
				lanche.BigMac();	
					break;
				case 2:
				lanche.QuarteraoComQueijo();	
					break;	
				case 3:
				lanche.CheddarMcMelt();	
					break;
				case 4:
				lanchefrango.McChicken();	
					break;	
				case 5:
				lanche.BigTasty();	
					break;
				case 6:
				lanche.McNificoBacon();	
					break;
				case 7:
				acomp.ChickenMcNuggets10U();	
					break;
				case 0:
				AppPrincipal.main(null);	
					break;	
				default:
					break;
				}
				
			}while(menuCardapio != 0);		
			break;
		case 15:
			do {
				System.out.println();
				System.out.println("Méqui Box");
				System.out.println();
				System.out.println("Escolha uma opção: ");
				System.out.println("1 - Family Box para 2 | 2 - Family Box para 3 | 3 - Méqui Box Clássico para 4 | 4 - Méqui Box Clássico para 3");
				System.out.println("0 - Menu Principal\"");
				menuCardapio = sc.nextInt();
				switch (menuCardapio) {
				case 1:
					System.out.println("Family Box para 2");
					System.out.println();
					System.out.println("Composto por 01 McLanche Feliz e 01 McOferta média Big Mac, Quarterão, Cheddar McMelt ou");
					System.out.println("McChicken.");
					break;
				case 2:
					System.out.println("Family Box para 3");
					System.out.println();
					System.out.println("Composto por 01 McLanche Feliz e 02 McOfertas médias Big Mac, Quarterão, Cheddar McMelt ou");
					System.out.println("McChicken.");
					break;
				case 3:
					System.out.println("Méqui Box Clássico para 4");
					System.out.println();
					System.out.println("Méqui Box Clássico para 4 Composto por 04 McOfertas médias: Big Mac, Quarterão, Cheddar McMelt ou");
					System.out.println("McChicken.");
					break;
				case 4:
					System.out.println("Méqui Box Clássico para 3");
					System.out.println();
					System.out.println("Méqui Box Clássico para 3 Composto por 03 McOfertas médias: Big Mac, Quarterão, Cheddar McMelt ou");
					System.out.println("McChicken.");
					break;
				case 0:
					AppPrincipal.main(null);
					break;
				default:
					break;
				}
				
			}while(menuCardapio != 0);			
			break;	
		default:
			break;

		}
	}	

}
