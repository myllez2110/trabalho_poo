package EscolaSenai;

public class _Rascunho {
    
    //@NoArgsConstructor //GERA UM CONSTRUTOR VAZIO
    //@AllArgsConstructor//GERA UM CONSTRUTOR COM TODOS ATRIBUTOS

	
/*        for (Funcionario professor : Funcionario.listaDeFuncionariosDaEscola) {
            // tenho que pegar o login e senha do p e comparar com os dados digitados
            if (Professor.getsenha().equals(senhaDigitada) && Professor.getemail().equals(loginDigitado)) {
                System.out.println(("Login realizado com sucesso"));
                System.out.println(("joga para o menu profs"));
                usuarioLogado = professor;
                return true;
            }
            for (Aluno aluno : Aluno.listaDeAlunos) {
                // tenho que pegar o login e senha do a e comparar com os dados digitados
                if (Aluno.get.getSenha().equals(senhaDigitada) && Aluno.getemail().equals(loginDigitado)) {
                    System.out.println(("Login realizado com sucesso"));
                    System.out.println(("joga para o menu profs"));
                    usuarioLogado = aluno;
                    return true;
                } */


    //(×)ALUNO 
    //(×)DISCIPLINA
    //(×)FUNCIONARIO
    //()NOTAS
    //(×)PESSOA
    //(×)PROFESSOR
    
//Classe do tipo (){}

// •--==> ATRITUBTOS

// •--==> CONSTRUTOR

// •--==> METODOS

// •--==> GETTERs SETTERs

// Interface não tem construtor Pense nas interfaces como se elas fossem um formulário de contrato em branco ou um modelo.
// Inteface -> Polimorfismo

/*              <!--Lombok-->
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>1.18.34</version>
			<scope>provided</scope>
		</dependency> */



        /*MENU RASCUNHO CTRL A
         * 
package EscolaSenai;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
	//•> Menu de acesso as informações de Alunos:
    public static void menuAluno(){

		//USUÁRIOS PARA TESTE
		Aluno alun1 = new Aluno("/ALUNDebug1");
		Aluno alun2 = new Aluno("/ALUNDebug2");
		alun1.setEmail("e"); alun1.setSenha("s");
		alun2.setEmail("e"); alun2.setSenha("s");
		
		Professor prof1 = new Professor("/PROFDebug1");
		Professor prof2 = new Professor("/PROFDebug2");
		prof1.setEmail("e"); prof1.setSenha("s");
		prof2.setEmail("e"); prof2.setSenha("s");

		Scanner sc = new Scanner(System.in);
        int opcao;
		int opcaoDev, opcaoMenuAdm, opcaoMenuAlunos, opcaoAmbiente, opcaoMenu;
		//UM do ENGLOBANDO ESTE do E OUTROS
		//ESSE do VAI SER UM AMBIENTE VIRTUAL

		//MENU GERAL - DEV - ACESSA AREA ADMINISTRATIVA OU O  AMBIENTE VIRTUAL DE ALUNOS
		do{
			System.out.println("MENU DE PROGRAMAÇÃO: \nQUAL ÁREA DESEJA ACESSAR?");
			System.out.println("1 - ADMINISTRATIVO \n2 - AMBIENTEALUNOS \n0 - SAIR");
			opcaoDev = sc.nextInt();
			
			if(opcaoDev==1){
				do{//ADMINISTRATIVO - DIREÇÃO OU FUNCIONARIOS					
					System.out.println("\n\n•---===ESCOLA SENAI===---•");
					System.out.println("•-=SETOR ADMINISTRATIVO=-•");
					System.out.println("QUAL AREA DESEJA ACESSAR?");
					System.out.println("1-DIREÇÃO \n2-FUNCIONÁRIOS \n0-SAIR"); //um 3-PROFESSORES?
					opcaoMenuAdm = sc.nextInt();
					

					if(opcaoMenuAdm==1){
						do{//DIREÇÃO(ADM e COORDENAÇÃO)
							System.out.println("\n• DIREÇÃO");
							System.out.println("QUAL AREA DESEJA ACESSAR?");
							System.out.println("1-ADMINISTRÇÃO DOCENTE \n2-COORDENAÇÃO DISCENTE\n0-SAIR");
							opcaoAmbiente = sc.nextInt();
							
							
							if(opcaoAmbiente==1){System.out.println("• - ADMINISTRÇÃO DOCENTE");
								do{
								}while(opcaoAmbiente != 0);//FECHA ADM DOCENTE
							}
							else if (opcaoAmbiente==2) {
								do {//AMBIENTE DE ADMINISTRAÇÃO DE ALUNOS
									System.out.println("\n- COORDENAÇÃO DISCENTE -");
									System.out.println("O que deseja fazer?");
									System.out.println("1- Cadastrar novo aluno");
									System.out.println("2- Atualizar aluno");
									System.out.println("3- Deletar aluno");
									System.out.println("4- Listar alunos");
									System.out.println("0- Sair\n");
									System.out.print("Digite uma opção: ");
									//Scanner sc = new Scanner(System.in);
									opcaoAmbiente = sc.nextInt();
									System.out.println("\n");
									
									switch(opcaoAmbiente){
										case 1:
											Aluno.cadastrarAluno();
											break;
											case 2:
											// Atualizar Aluno.
											System.out.println("Atualizando aluno...");
											break;
											case 3:
											// Deletar Aluno Aluno.deletarAluno();
											System.out.println("Deletando aluno...");
											break;
										case 4:
											Aluno.imprimeListaDeAluno();
											break;
										case 0:
										System.out.println("Saindo...");
										break;
										default:
											System.out.println("Opção inválida");
											break;
										}
									} while(opcaoAmbiente != 0);										
								} else if (opcaoMenuAdm==2){

							} while(opcaoMenuAdm != 0);//FECHA ADM DISCENTE
						
						}while(opcaoAmbiente!=0);//FECHA ADM COORDENAÇÃO
					}
					if(opcaoMenuAdm==2){//MENU DE FUNCIONARIOS
					}
				}while(opcaoMenuAdm != 0);//FECHA O MENU ADM

			}//MENU DEV
			if(opcaoDev==2){//AMBIENTE VIRTUAL DO ALUNO = ONDE O ALUNO VE NOTAS/FREQUENCIA/DATAS IMPORTANTES
				do{
				System.out.println("•---===ESCOLA SENAI===---•");
				System.out.println("• AREA DE ESTUDANTES •");
				System.out.println("QUAL AREA DESEJA ACESSAR?");
				System.out.println("1-NOTAS \n2-PRESENÇA \n3-ENTREGA \n4-FICHA DE ESTUDANTE \n5-AGENDAR ATENDIMENTO \n0-SAIR"); //um 3-PROFESSORES?
				opcaoMenuAlunos = sc.nextInt();
				

				}while(opcaoMenuAlunos!=0);
			}//MENU DEV
		} while(opcaoDev != 0);//FECHA MENU DEV
    }
}
	

         */
}
