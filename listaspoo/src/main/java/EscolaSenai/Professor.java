package EscolaSenai;

import java.time.*;
import java.util.Scanner;

import org.springframework.cglib.core.Local;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professor extends Funcionario {
    // •--==> ATRITUBTOS
    private int professorId = 0;
    private String professorMatricula; // Primary Key

    // •--==> CONSTRUTOR GENERICO DE PROFESSORES
    public Professor(String nomeProf) {
        this.setId(professorId);
        this.professorMatricula = ("P-" + this.getId());
        this.setFuncDataContratacao(LocalDate.of(2020, 06, 01));// DATA PRE DEFINIDA PARA TESTES
        this.setFuncStatus(EnumStatusMatricula.ATIVO);
        this.setNome(nomeProf);
        this.setDataNascimento(LocalDate.of(1990, 01, 01));// DATA PRE DEFINIDA PARA TESTES
        this.setEmail("SenaiEscola." + nomeProf + "." + this.getProfessorMatricula() + ".professores@senai.com");
        this.setSenha(this.professorMatricula);
        this.setOcupacaoPessoa(EnumOcupacao.PROF);
    }

    public static void imprimeListaDeFuncionarios() {
        if (!Funcionario.listaDeFuncionariosDaEscola.isEmpty()) {
            System.out.println("Lista de funcionários:");
            for (int i = 0; i < Funcionario.listaDeFuncionariosDaEscola.size(); i++) {
                System.out.println(
                        (i + 1) + " - " + Funcionario.listaDeFuncionariosDaEscola.get(i).getNome() + " | Status: "
                                + Funcionario.listaDeFuncionariosDaEscola.get(i).getFuncStatus().getEnumStatMat()+" | Email: "+
                                Funcionario.listaDeFuncionariosDaEscola.get(i).getEmail()+" | Senha: "+Funcionario.listaDeFuncionariosDaEscola.get(i).getSenha());
            }
        } else {
            System.out.println("Não há funcionários cadastrados.\n\n");
        }
    }

    //metodo login professor
    public void login(){
        Menu.menuInicial();
    }

    // Metodo para ser chamado no MENU para cadastrar professor
    public static void cadastrarProfessor() {
        System.out.println("- CADASTRANDO NOVO PROFESSOR -");
        System.out.print("Nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        Professor professor = new Professor(nome);
        Professor.listaDeFuncionariosDaEscola.add(professor);
        System.out.println("\n");
    }

    // •--==> METODOS
    // Método imprimir especificidades de Profs pelo MENU
    public static void imprimeProfessorDetalhes() {
        if (!Funcionario.listaDeFuncionariosDaEscola.isEmpty()) {
            System.out.println("Lista detalhada de Professores(as):");
            for (int i = 0; i < Funcionario.listaDeFuncionariosDaEscola.size(); i++) {
                System.out.println((i + 1) + " - " + Funcionario.listaDeFuncionariosDaEscola.get(i).getNome());
                // System.out.println("Turmas: "+turmas atribuidas+" | Disciplina: "+Disciplina
                // disciplinaLecionada+" | \n");
            }
        } else {
            System.out.println("Não há funcionários cadastrados.\n\n");
        }
    }

    // Metodo para deletar Professor
    public static void deletarProfessor() {
        Scanner sc = new Scanner(System.in);
        String removido;
        System.out.println("----- Remover Item da Lista -----");
        if (listaDeFuncionariosDaEscola.isEmpty()) {
            System.out.println("A lista está vazia. Não há itens para remover.");
        } else {
            System.out.println("Escolha o número do item que deseja remover:");
            for (int i = 0; i < listaDeFuncionariosDaEscola.size(); i++) {
                System.out.println((i + 1) + " • Nome: " + listaDeFuncionariosDaEscola.get(i).getNome()
                        + " - Matrícula: " + listaDeFuncionariosDaEscola.get(i));
                removido = listaDeFuncionariosDaEscola.get(i).getNome();
            }

            int itemRemover = sc.nextInt();

            if (itemRemover > 0 && itemRemover <= listaDeFuncionariosDaEscola.size()) {

                removido = listaDeFuncionariosDaEscola.get(itemRemover - 1).getNome();
                // ao inves de remover, trocar status listaDeFuncionariosDaEscola set status
                // (ativo inativo suspensa trancado);
                listaDeFuncionariosDaEscola.remove(itemRemover - 1);
                System.out.println("Professor '" + removido + "' removido da lista.");
            } else {
                System.out.println("Número inválido.");
            }
        }
    }

    // Metodo para atualizar Professor
    public static void atualizarProfessor() {
        Scanner sc = new Scanner(System.in);
        Scanner at = new Scanner(System.in);

        int atualizado;
        String nomeAtt;
        String cpfAtt;
        String emailAtt;
        String senhaAtt;
        System.out.println("----- Atualizar Item da Lista -----");
        if (listaDeFuncionariosDaEscola.isEmpty()) {
            System.out.println("A lista está vazia. Não há itens para atualizar.");
        } else {
            System.out.println("Escolha o número do item que deseja atualizar:");
            for (int i = 0; i < listaDeFuncionariosDaEscola.size(); i++) {
                System.out.println((i + 1) + " - Nome: " + listaDeFuncionariosDaEscola.get(i).getNome()
                        + " - CPF: " + listaDeFuncionariosDaEscola.get(i).getCpf() + " - E-mail: "
                        + listaDeFuncionariosDaEscola.get(i).getEmail()
                        + " - Senha: " + listaDeFuncionariosDaEscola.get(i).getSenha());
            }
            int itemAtualizar = sc.nextInt() - 1;
            for (int i = 0; i < listaDeFuncionariosDaEscola.size(); i++) {
                if (itemAtualizar == i) {
                    System.out.println("Digite qual opção você deseja modificar:");
                    System.out.println("1 - Nome\n2 - CPF\n3 - Email\n4 - Senha\n");
                    atualizado = sc.nextInt();
                    if (atualizado == 1) {
                        System.out.print("Novo nome: ");
                        nomeAtt = at.nextLine();
                        listaDeFuncionariosDaEscola.get(i).setNome(nomeAtt);
                    }
                    if (atualizado == 2) {
                        System.out.print("Novo CPF: ");
                        cpfAtt = at.nextLine();
                        listaDeFuncionariosDaEscola.get(i).setCpf(cpfAtt);
                    }
                    if (atualizado == 3) {
                        System.out.print("Novo email: ");
                        emailAtt = at.nextLine();
                        listaDeFuncionariosDaEscola.get(i).setEmail(emailAtt);
                    }
                    if (atualizado == 4) {
                        System.out.print("Nova senha: ");
                        senhaAtt = at.nextLine();
                        listaDeFuncionariosDaEscola.get(i).setSenhaNova(senhaAtt);
                    }
                }
            }
        }
    }

    public void imprimePessoa() { // Metodo da Superclasse Pessoa ele liga o extends Pessoa no aluno
        // Dados da Pessoa
        System.out.println("•====================•");
        System.out.println("| DADOS DE PROFESSOR |");
        System.out.println("•====================•");
        System.out.println("Id:" + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Data Nascimento: " + getDataNascimento());
        System.out.println("Email: " + getEmail());
        System.out.println("Senha: " + getSenha());// temporario para debug

        // Dados de Professor
        System.out.println("Matricula: " + getProfessorMatricula());
        System.out.println("Data da Admissao: " + getFuncDataContratacao());
        System.out.println("Situação: " + getFuncStatus());
        System.out.println("•====================•");

    }

    // •--==> GETTERs SETTERs
    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getProfessorMatricula() {
        return professorMatricula;
    }

    public void setProfessorMatricula(String professorMatricula) {
        this.professorMatricula = professorMatricula;
    }

    // o professor avalia varios alunos em cada disciplina
}
