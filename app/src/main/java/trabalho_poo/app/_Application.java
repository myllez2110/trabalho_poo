package trabalho_poo.app;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class _Application {

    public static void main(String[] args) {
    SpringApplication.run(_Application.class, args);
    /*                 •---===ESCOLA SENAI===---•
    * Nós vamos começar a estruturar um projeto que é o EscolaSenai.
    * Nós precisamos montar um SISTEMA para GERENCIAR as ATIVIDADES
    * pedagógicas para alunos e professores
    * 
    *                  ¤ ¤ PRIMEIRA ENTREGA ¤ ¤
    * Critérios:
    (×)•-> Estruturar o projeto com suas CLASSES, RELACIONAMENTOS, HERANÇAS
    * e tudo que o sistema necessite baseado no que vocês aprenderam
    * 
    (×)•-> Classes (Alunos, Professores, Disciplinas e Notas). Se precisar de
    * outras para estruturar melhor, fiquem a vontade.
    * 
    (×)•-> Utilizar Herança (Ex: Pessoa)
    * 
    (×)•-> Montar CONSTRUTORES contendo as regras do negócio
    * 
    (×)•-> Montar todos os relacionamentos entre classes
    * 
    (x)•-> Adicionar ENUMs
    * 
    (x)•-> Adicionar MENU 

    (x)•-> Implementar dinamismo das bibliotecas novas no projeto
    
    ( )•-> Colocar as novas bibliotecas em prática
    */


        int opcaoMenuApp;
        Scanner leiaApp = new Scanner(System.in);
        System.out.println("•---===ESCOLA SENAI===---•");
        System.out.println("MENU DEBUG, ESCOLHA UMA OPÇÃO");
        System.out.println("1-LoginAluno\n2-LoginProf\n3-LoginAdm\n88-Lista de Alunos\n99-Boot-Mock\n0-Sair");
        opcaoMenuApp = leiaApp.nextInt();
        while(opcaoMenuApp!=0){
            switch (opcaoMenuApp) {
                case 1:
                System.out.println("LoginAluno");
                Aluno.checagemLogin();
                break;
                case 2:
                System.out.println("LoginProfessor");                
                break;
                case 3:
                System.out.println("LoginAdministrativo");                
                break;                
                case 88:
                System.out.println("Lista de Alunos");
                trabalho_poo.app.Aluno.imprimeListaDeAlunos();
                break;
                case 99:System.out.println("Boot do Sistema - Mock");/*
                    //ENDERECOS
                    Endereco endereco1 = new Endereco("Rua", "70", "A", "Mosela", "Petrópolis", EnumUnidadeFederal.RJ, "123");
                    Endereco endereco2 = new Endereco("Avenida", "30", "B", "Bingen", "Petrópolis", EnumUnidadeFederal.SP, "123");
                    System.out.println(endereco1.getEstado().getNomePorExtenso());
                    System.out.println(endereco2.getEstado().getNomePorExtenso());

                    //DISCIPLINA
                    Disciplina disciplina1 = new Disciplina("TIC", "Lógica de Programação", EnumTurno.INTEGRAL, "Jul-2024", "Dez-2024");
                    Disciplina disciplina2 = new Disciplina("TIC", "POO", EnumTurno.NOITE, "Jul-2024", "Dez-2024");
                    Disciplina disciplina3 = new Disciplina("TIC", "Banco de Dados", EnumTurno.MANHA, "Jul-2024", "Dez-2024");
                    Disciplina disciplina4 = new Disciplina("ING", "Inglês Avançado", EnumTurno.TARDE, "Jan-2025", "Jun-2025");
                    
                    disciplina1.imprimeDisciplina();
                    /*disciplina2.imprimeDisciplina();
                    disciplina3.imprimeDisciplina();
                    disciplina4.imprimeDisciplina();

                    //PROFESSOR
                    Professor professor1 = new Professor("Roni", "2019");
                    Professor professor2 = new Professor("Arthur", "2016");
                    Professor professor3 = new Professor("Maria", "2018");

                    professor1.setEndereco(endereco1);
                    professor2.setEndereco(endereco2);
                    professor2.setEndereco(endereco1);

                    System.out.println(professor1.getEndereco().getEstado());
                    System.out.println(professor2.getEndereco().getEstado().getNomePorExtenso());

                    //TURMAS
                    Turma turma1 = new Turma(1,  "1001");
                    Turma turma2 = new Turma(2,  "2001");
                    Turma turma3 = new Turma(3,  "3001");
                    //Sistema de Turmas?
                    turma1.adicionarProf(professor1);
                    turma2.adicionarProf(professor2);
                    turma3.adicionarProf(professor3);

                    professor1.imprimePessoa();
                    professor2.imprimePessoa();
                    professor3.imprimePessoa();

                    //ALUNO                    
                    Aluno aluno1 = new Aluno("Laiz");    //cria o aluno
                    aluno1.listaGeralDeAlunos(aluno1);          //atribui a lista
                    Aluno aluno2 = new Aluno("Carla");
                    aluno2.listaGeralDeAlunos(aluno2);
                    Aluno aluno3 = new Aluno("Suru");
                    aluno3.listaGeralDeAlunos(aluno3);
                    Aluno aluno4 = new Aluno("Daniel");
                    aluno4.listaGeralDeAlunos(aluno4);
                    Aluno aluno5 = new Aluno("Mariana");
                    aluno5.listaGeralDeAlunos(aluno5);
                    //EscolaSenai.Aluno.listaGeralDeAlunos(aluno5);

                    turma1.adicionarAluno(aluno1);
                    turma2.adicionarAluno(aluno2);
                    turma1.adicionarAluno(aluno3);
                    turma2.adicionarAluno(aluno4);
                    turma3.adicionarAluno(aluno5);

                    turma1.imprimeTurma();
                    turma2.imprimeTurma();

                    aluno1.imprimePessoa();
                    aluno2.imprimePessoa();
                    aluno3.imprimePessoa();
                    aluno4.imprimePessoa();
                    aluno5.imprimePessoa();

                    //NOTAS
                    Notas nota1 = new Notas(aluno1, disciplina1, professor1);//Cria o Boletim daquele aluno naquela disciplina com aquele professor
                    Notas nota2 = new Notas(aluno2, disciplina2, professor2);
                    Notas nota3 = new Notas(aluno3, disciplina3, professor1);
                    Notas nota4 = new Notas(aluno4, disciplina2, professor2);
                    Notas nota5 = new Notas(aluno5, disciplina4, professor3);

                    //NOTAS - METODO AVALIAÇÕES
                    nota1.aplicarAvaliacao(aluno1, disciplina2, professor2, 1, "AGO24", 8);//aplica as avaliações para aquele boletim
                    nota1.aplicarAvaliacao(aluno1, disciplina2, professor2, 2, "SET24", 9);
                    nota1.aplicarAvaliacao(aluno1, disciplina2, professor2, 3, "SET24", 9);
                    nota1.aplicarAvaliacao(aluno1, disciplina2, professor2, 4, "NOV24", 7);
                    nota1.aplicarAvaliacao(aluno1, disciplina2, professor2, 5, "NOV24", 7);
                    nota1.aplicarAvaliacao(aluno1, disciplina2, professor2, 6, "DEZ24", 8);
                    
                    nota2.aplicarAvaliacao(aluno2, disciplina2, professor2, 1, "AGO24", 6);
                    nota2.aplicarAvaliacao(aluno2, disciplina2, professor2, 2, "SET24", 9);
                    nota2.aplicarAvaliacao(aluno2, disciplina2, professor2, 3, "SET24", 7);
                    nota2.aplicarAvaliacao(aluno2, disciplina2, professor2, 4, "NOV24", 7);
                    nota2.aplicarAvaliacao(aluno2, disciplina2, professor2, 5, "NOV24", 7);
                    nota2.aplicarAvaliacao(aluno2, disciplina2, professor2, 6, "DEZ24", 10);
                    
                    nota3.aplicarAvaliacao(aluno3, disciplina1, professor1, 1, "AGO24", 10);
                    nota3.aplicarAvaliacao(aluno3, disciplina1, professor1, 2, "SET24", 9);
                    nota3.aplicarAvaliacao(aluno3, disciplina1, professor1, 5, "NOV24", 8);

                    nota4.aplicarAvaliacao(aluno4, disciplina3, professor1, 1, "AGO24", 6);
                    nota4.aplicarAvaliacao(aluno4, disciplina3, professor1, 2, "SET24", 9);
                    nota4.aplicarAvaliacao(aluno4, disciplina3, professor1, 3, "SET24", 9);
                    nota4.aplicarAvaliacao(aluno4, disciplina3, professor1, 5, "NOV24", 7);

                    nota5.aplicarAvaliacao(aluno5, disciplina4, professor3, 1, "AGO24", 6);
                    nota5.aplicarAvaliacao(aluno5, disciplina4, professor3, 2, "SET24", 8);
                    nota5.aplicarAvaliacao(aluno5, disciplina4, professor3, 5, "NOV24", 7);
                    
                    //NOTAS BOLETIM
                    nota1.imprimeBoletim();
                    nota2.imprimeBoletim();
                    /*nota3.imprimeBoletim();
                    nota4.imprimeBoletim();
                    nota5.imprimeBoletim();*/

                    /*professor1.setEstadoCivil(EnumEstadoCivil.CASADO);
                    professor2.setEstadoCivil(EnumEstadoCivil.CASADO);
                    System.out.println(professor1.getEstadoCivil().getEnumEstadoCivil());
                    System.out.println(professor2.getEstadoCivil().getEnumEstadoCivil()); //teria como deixar direto prof.getEnumEstadoCivil()?
                    */
                break;
                case 0:
                System.out.println("Encerrar Sistema");
                break;
                default:
                System.out.println("Digite uma opção válida entre 1 e 3 ou 0 para sair:");
                break;
            }
            System.out.println("•---===ESCOLA SENAI===---•");
            System.out.println("MENU DEBUG, ESCOLHA UMA OPÇÃO");
            System.out.println("1-LoginAluno\n2-LoginProf\n3-LoginAdm\n88-Lista de Alunos\n99-Boot-Mock\n0-Sair");
            opcaoMenuApp = leiaApp.nextInt();
        } 
	}
}
