
package EscolaSenai;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Menu {
	
	//•> Menu de acesso as informações de Alunos:
	//	public static void menuAluno(){
		public static void menuInicial() throws InputMismatchException{
			int opcao=8888;
		do{	
			System.out.println("\n- MENU INICIAL -");
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Menu Aluno");
			System.out.println("2 - Menu Professor");
			System.out.println("0 - Sair");
			Scanner sc = new Scanner(System.in);

			try{
				opcao = sc.nextInt();
				System.out.println("\n");			
				switch (opcao) {
					case 1:
					Menu.menuAluno();
					break;
					case 2:
					Menu.menuProf();
					break;
					case 0:
					System.out.println("Saindo...");
					System.exit(0);
					break;					
					default:
					System.out.println("Digite uma das duas opções");
					break;
				}
			} catch(InputMismatchException e){
				System.out.println("Erro: "+e);
				//e.getCause();
				//e.getMessage();
				//e.printStackTrace(); //imprime a mensagem toda de erro sem quebrar o código
				System.out.println("\n••> DIGITE UM NÚMERO INTEIRO:");				
			}
			
		} while(opcao!=0);
	}

		//MENU PROFESSOR
		public static void menuProf() throws InputMismatchException{
			int opcao=8888;
			do {
				
				System.out.println("\n- MENU -");
				System.out.println("O que deseja fazer?");
				System.out.println("1 - Cadastrar novo Professores(as): ");
				System.out.println("2 - Atualizar Professores(as): ");
				System.out.println("3 - Deletar Professores(as): ");
				System.out.println("4 - Listar Professores(as): ");
				System.out.println("5 - Voltar Menu ");
				System.out.println("0 - Sair\n");
				System.out.print("Digite uma opção: ");
				Scanner sc = new Scanner(System.in);
	
				try{
					opcao = sc.nextInt();
					System.out.println("\n");
		
					switch(opcao){
						case 1:
							Professor.cadastrarProfessor();
							break;
						case 2:
							// Atualizar Aluno
							System.out.println("Atualizando aluno...");
							Professor.atualizarProfessor();
							break;
						case 3:
							// Deletar Aluno
							System.out.println("Deletando aluno...");
							Professor.deletarProfessor();
							break;
						case 4:
							Professor.imprimeListaDeFuncionarios();
							break;
						case 5:
							Menu.menuInicial();
							break;
						case 0:
							System.out.println("Saindo...");
							System.exit(0);
							break;
						default:
							System.out.println("Opção inválida");
							break;
						} 
					} catch(InputMismatchException e){
						System.out.println("Erro: "+e);
						//e.getCause();
						//e.getMessage();
						//e.printStackTrace(); //imprime a mensagem toda de erro sem quebrar o código
						System.out.println("\n••> DIGITE UM NÚMERO INTEIRO:");
						Menu.menuProf();
					}
				}while(opcao!=0);
			
			
		}
		//MENU ALUNO
		public static void menuAluno() throws InputMismatchException{
			int opcao=8888;
		do {			
			System.out.println("\n- MENU -");
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Cadastrar novo aluno");
			System.out.println("2 - Atualizar aluno");
			System.out.println("3 - Deletar aluno");
			System.out.println("4 - Listar alunos");
			System.out.println("5 - Voltar Menu ");
			System.out.println("0 - Sair\n");
			System.out.print("Digite uma opção: ");
			Scanner sc = new Scanner(System.in);

			try{
				opcao = sc.nextInt();
				System.out.println("\n");	
				switch(opcao){
					case 1:
						Aluno.cadastrarAluno();
						break;
					case 2:
						// Atualizar Aluno
						System.out.println("Atualizando aluno...");
						Aluno.atualizarAluno();
						break;
					case 3:
						// Deletar Aluno
						System.out.println("Deletando aluno...");
						Aluno.deletarAluno();
						break;
					case 4:
						Aluno.imprimeListaDeAluno();
						break;
					case 5:
						Menu.menuInicial();
						break;
					case 0:
						System.out.println("Saindo...");
						System.exit(0);
						break;
					default:
						System.out.println("Opção inválida");
						break;
					} 
				} catch(InputMismatchException e){
					System.out.println("Erro: "+e);
					//e.getCause();
					//e.getMessage();
					//e.printStackTrace(); //imprime a mensagem toda de erro sem quebrar o código
					System.out.println("\n••> DIGITE UM NÚMERO INTEIRO:");
					Menu.menuAluno();
				}
			}while(opcao!=0);
		}
}
