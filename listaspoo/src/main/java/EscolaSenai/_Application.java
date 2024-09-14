package EscolaSenai;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class _Application {
    public static int contadorTentativas = 3;
    public static Pessoa usuarioLogado;

    public static void main(String[] args) {
        SpringApplication.run(_Application.class, args);

        //Menu.menuInicial();
        Professor p = new Professor("pDev");
        p.setEmail("pdev@");
        p.setSenhaNova("dev");
        System.out.println(p.getEmail());
        System.out.println(p.getSenha());
        Pessoa.listaDeUsuarios.add(p);
        Funcionario.listaDeFuncionariosDaEscola.add(p);
        

        Aluno a = new Aluno("aDev");
        a.setEmail("adev@");
        a.setSenhaNova("dev");
        Pessoa.listaDeUsuarios.add(a);
        Aluno.listaDeAlunos.add(a);
        
        
    
    while(contadorTentativas>0) {
        // Login
        // Pergunta login e senha
        Scanner sc = new Scanner(System.in);
        System.out.println(" = Login = ");
        System.out.print("Login:");
        String loginDigitado = sc.nextLine();
        System.out.print("Senha:");
        String senhaDigitada = sc.nextLine();

        if ( autorizaCredenciais(loginDigitado, senhaDigitada) ){ //ele vai no metodo
            contadorTentativas=3;//contador reseta
            usuarioLogado.login();//, se retornar true 
        } else if (contadorTentativas > 1) {//, se retornar false
            System.out.println(("Login ou Senha incorretos"));
            contadorTentativas--;
            System.out.println((contadorTentativas+ " tentativas restantes."));
        } else {
            System.out.println("Cadastro Bloqueado! Entre em contato com a Coordenação.");
            contadorTentativas--;
        }
    }
}        
        public static boolean autorizaCredenciais(String loginDigitado, String senhaDigitada) {
            // Verificação das credenciais digitadas
            // Percorre a lista de professores
            for (Pessoa pessoa : Pessoa.listaDeUsuarios) {// polimorfismo, busca aluno e professor
                // tenho que pegar o login e senha do a e comparar com os dados digitados
                if (pessoa.getSenha().equals(senhaDigitada) && pessoa.getEmail().equals(loginDigitado)) {
                    System.out.println(("Login realizado com sucesso"));
                    System.out.println(("joga para o menu profs"));
                    usuarioLogado = pessoa;
                    return true;
                }
            }
            return false;
        }                
    }

/*
 * * •---===ESCOLA SENAI===---•
 * Nós vamos começar a estruturar um projeto que é o EscolaSenai.
 * Nós precisamos montar um SISTEMA para GERENCIAR as ATIVIDADES
 * pedagógicas para alunos e professores
 */
/*
 * * CONCLUIDA ¤ ¤ PRIMEIRA ENTREGA ¤ ¤
 * Critérios:
 * (×)•-> Estruturar o projeto com suas CLASSES, RELACIONAMENTOS, HERANÇAS
 * e tudo que o sistema necessite baseado no que vocês aprenderam
 * 
 * (×)•-> Classes (Alunos, Professores, Disciplinas e Notas). Se precisar de
 * outras para estruturar melhor, fiquem a vontade.
 * 
 * (×)•-> Utilizar Herança (Ex: Pessoa)
 * 
 * (×)•-> Montar CONSTRUTORES contendo as regras do negócio
 * 
 * (×)•-> Montar todos os relacionamentos entre classes
 */
/*
 * * CONCLUÍDA ¤ ¤ SEGUNDA ENTREGA ¤ ¤
 * 
 * (x)•-> Adicionar ENUMs
 * 
 * (x)•-> Implementar dinamismo das bibliotecas novas no projeto
 * 
 * (x)•-> Colocar as novas bibliotecas em prática
 * 
 * (x)•-> Inserir aluno menu
 * 
 * (x)•-> Listar alunos menu
 * 
 * (x)•-> Menu num loop
 * 
 * (x)•-> Chama menu na main, mas o menu ta em uma classe
 * 
 * (x)•-> Classe Menu
 * 
 * (x)•-> Tratar possíveis Exceptions
 * 
 * (x)•-> Adicionar MENU
 * 
 * ( )•-> Implementar sistema de notas
 * 
 * ( )•-> Implementar Login(saber se foi professor ou aluno)
 * 
 * a main fica só com o comando chamando por exemplo Exercicio.resolucao();
 */

/*
 * 
 * 
 * //DISCIPLINA
 * Disciplina disciplina1 = new Disciplina("TIC", "Lógica de Programação",
 * "Integral", "Jul-2024", "Dez-2024");
 * Disciplina disciplina2 = new Disciplina("TIC", "Banco de Dados", "Integral",
 * "Jul-2024", "Dez-2024");
 * Disciplina disciplina3 = new Disciplina("TIC", "POO", "Integral", "Jul-2024",
 * "Dez-2024");
 * Disciplina disciplina4 = new Disciplina("ING", "Inglês Avançado", "Noite",
 * "Jan-2025", "Jun-2025");
 * 
 * disciplina1.imprimeDisciplina();
 * disciplina2.imprimeDisciplina();
 * disciplina3.imprimeDisciplina();
 * disciplina4.imprimeDisciplina();
 * 
 * //PROFESSOR
 * Professor professor1 = new Professor("PROF01");
 * Professor professor2 = new Professor("PROF02");
 * Professor professor3 = new Professor("PROF03");
 * 
 * professor1.imprimePessoa();
 * professor2.imprimePessoa();
 * professor3.imprimePessoa();
 * 
 * //ALUNO
 * Aluno aluno1 = new Aluno("ALUNO1");
 * Aluno aluno2 = new Aluno("ALUNO2");
 * Aluno aluno3 = new Aluno("ALUNO3");
 * Aluno aluno4 = new Aluno("ALUNO4");
 * Aluno aluno5 = new Aluno("ALUNO5");
 * 
 * aluno1.imprimePessoa();
 * aluno2.imprimePessoa();
 * aluno3.imprimePessoa();
 * aluno4.imprimePessoa();
 * aluno5.imprimePessoa();
 * 
 * //NOTAS
 * Notas nota1 = new Notas(aluno1, disciplina2, professor2);
 * Notas nota2 = new Notas(aluno2, disciplina2, professor2);
 * Notas nota3 = new Notas(aluno3, disciplina1, professor1);
 * Notas nota4 = new Notas(aluno4, disciplina2, professor2);
 * Notas nota5 = new Notas(aluno5, disciplina4, professor3);
 * 
 * //NOTAS - METODO AVALIAÇÕES
 * nota1.aplicarAvaliacao(aluno1, disciplina2, professor2, 1, "AGO24", 8);
 * nota1.aplicarAvaliacao(aluno1, disciplina2, professor2, 2, "SET24", 9);
 * nota1.aplicarAvaliacao(aluno1, disciplina2, professor2, 3, "SET24", 9);
 * nota1.aplicarAvaliacao(aluno1, disciplina2, professor2, 4, "NOV24", 7);
 * nota1.aplicarAvaliacao(aluno1, disciplina2, professor2, 5, "NOV24", 7);
 * nota1.aplicarAvaliacao(aluno1, disciplina2, professor2, 6, "DEZ24", 8);
 * 
 * nota2.aplicarAvaliacao(aluno2, disciplina2, professor2, 1, "AGO24", 6);
 * nota2.aplicarAvaliacao(aluno2, disciplina2, professor2, 2, "SET24", 9);
 * nota2.aplicarAvaliacao(aluno2, disciplina2, professor2, 3, "SET24", 7);
 * nota2.aplicarAvaliacao(aluno2, disciplina2, professor2, 4, "NOV24", 7);
 * nota2.aplicarAvaliacao(aluno2, disciplina2, professor2, 5, "NOV24", 7);
 * nota2.aplicarAvaliacao(aluno2, disciplina2, professor2, 6, "DEZ24", 10);
 * 
 * nota3.aplicarAvaliacao(aluno3, disciplina1, professor1, 1, "AGO24", 10);
 * nota3.aplicarAvaliacao(aluno3, disciplina1, professor1, 2, "SET24", 9);
 * nota3.aplicarAvaliacao(aluno3, disciplina1, professor1, 5, "NOV24", 8);
 * 
 * nota4.aplicarAvaliacao(aluno4, disciplina3, professor1, 1, "AGO24", 6);
 * nota4.aplicarAvaliacao(aluno4, disciplina3, professor1, 2, "SET24", 9);
 * nota4.aplicarAvaliacao(aluno4, disciplina3, professor1, 3, "SET24", 9);
 * nota4.aplicarAvaliacao(aluno4, disciplina3, professor1, 5, "NOV24", 7);
 * 
 * nota5.aplicarAvaliacao(aluno5, disciplina4, professor3, 1, "AGO24", 6);
 * nota5.aplicarAvaliacao(aluno5, disciplina4, professor3, 2, "SET24", 8);
 * nota5.aplicarAvaliacao(aluno5, disciplina4, professor3, 5, "NOV24", 7);
 * 
 * //NOTAS BOLETIM
 * nota1.imprimeBoletim();
 * nota2.imprimeBoletim();
 * nota3.imprimeBoletim();
 * nota4.imprimeBoletim();
 * nota5.imprimeBoletim();
 */

