package EscolaSenai;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno extends Pessoa{ // Classe base dos alunos da instituição
    // Criando lista para guardar cada aluno
    public static List<Aluno> listaDeAlunos = new ArrayList<Aluno>();

    // •--==> ATRITUBTOS
    private int alunoId = 0;
    private String alunoMatricula; // Primary Key
    private LocalDate alunoDataAdmissao;// localDate
    private EnumStatusMatricula alunoStatus; // Enum (ativo, trancado, suspenso, concluído)
    private Endereco endereco; // Enum(endereco)

    // •--==> CONSTRUTOR base
    public Aluno(String nomeAl) {
        this.setId(alunoId);
        this.alunoMatricula = ("A-" + this.getId());
        this.setAlunoDataAdmissao(LocalDate.of(2024, 07, 01));// DATA PRE DEFINIDA PARA TESTES
        this.alunoStatus = EnumStatusMatricula.ATIVO;
        this.setNome(nomeAl);
        this.setDataNascimento(LocalDate.of(2000, 01, 01));// DATA PRE DEFINIDA PARA TESTES
        this.setEmail("SenaiEscola." + nomeAl + "." + this.getAlunoMatricula() + ".alunos@senai.com");
        this.setSenha(this.alunoMatricula);
        this.setOcupacaoPessoa(EnumOcupacao.ALUN);
    }

    // Construtor add endereco
    public void alunoEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // •--==> METODOS
    @Override
    public void imprimePessoa() { // Metodo da Superclasse Pessoa ele liga o extends Pessoa no aluno
        // Dados da Pessoa
        System.out.println("•====================•");
        System.out.println("| DADOS   DE   ALUNO |");
        System.out.println("•====================•");
        System.out.println("Id:" + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Data Nascimento: " + getDataNascimento());
        System.out.println("Email: " + getEmail());
        System.out.println("Senha: " + getSenha());// temporario para debug

        // Dados de Aluno
        System.out.println("Matricula: " + getAlunoMatricula());
        // System.out.println("Data da Admissao: "+getAlunoDataAdmissao());
        System.out.println("Situação: " + getAlunoStatus());
        System.out.println("•====================•");
    }
    //metodo login aluno
    public void login(){
        Menu.menuAluno();
    }

    // Metodo para ser chamado no MENU para cadastrar aluno
    public static void cadastrarAluno() {

        System.out.println("- CADASTRANDO NOVO ALUNO -");
        System.out.print("Nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        Aluno aluno = new Aluno(nome);
        aluno.setAlunoId(Aluno.getContadorId());
        aluno.setCpf(cpf);
        Aluno.listaDeAlunos.add(aluno);
        System.out.println("\n");
    }

    // Metodo para deletar aluno
    public static void deletarAluno() {
        Scanner sc = new Scanner(System.in);
        String removido;
        System.out.println("----- Deletar aluno da Lista -----");
        if (listaDeAlunos.isEmpty()) {
            System.out.println("A lista está vazia. Não há itens para remover.");
        } else {
            System.out.println("Escolha o número do item que deseja remover:");
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                System.out.println((i + 1) + " - Nome: " + listaDeAlunos.get(i).getNome() + " - Matrícula: "
                        + listaDeAlunos.get(i).getAlunoMatricula() +
                        " - CPF: " + listaDeAlunos.get(i).getCpf() + " - E-mail: " + listaDeAlunos.get(i).getEmail());
                removido = listaDeAlunos.get(i).getNome();
            }
            int itemRemover = sc.nextInt();
            if (itemRemover > 0 && itemRemover <= listaDeAlunos.size()) {
                removido = listaDeAlunos.get(itemRemover - 1).getNome();
                // ao inves de remover, trocar status listaDeAlunos set status (ativo inativo
                // suspensa trancado);
                listaDeAlunos.remove(itemRemover - 1);
                System.out.println("Aluno '" + removido + "' removido da lista.");
            } else {
                System.out.println("Número inválido.");
            }
        }
    }

    /*
     * if(Aluno.listaDeAlunos.isEmpty()){
     * System.out.println("Não há aluno cadastrados.\n\n");
     * }
     * } else {
     * System.out.println("- DELETANDO ALUNO EXISTENTE -");
     * Scanner sc = new Scanner(System.in);
     * 
     * 
     * System.out.println("Lista de alunos:");
     * for(int i=0; i<Aluno.listaDeAlunos.size(); i++) {
     * 
     * int arrayNumeroEscolhido;
     * System.out.println( (i+1) + "- " + Aluno.listaDeAlunos.get(i).getNome());
     * arrayNumeroEscolhido=sc.nextInt();
     * Aluno.listaDeAlunos.remove(arrayNumeroEscolhido);
     * }
     * }
     */

    // Metodo para atualizar aluno
    public static void atualizarAluno() {
        Scanner sc = new Scanner(System.in);
        Scanner at = new Scanner(System.in);

        int atualizado;
        String nomeAtt;
        String cpfAtt;
        String emailAtt;
        String senhaAtt;
        System.out.println("----- Atualizar Item da Lista -----");
        if (listaDeAlunos.isEmpty()) {
            System.out.println("A lista está vazia. Não há itens para atualizar.");
        } else {
            System.out.println("Escolha o número do item que deseja atualizar:");
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                System.out.println((i + 1) + " - Nome: " + listaDeAlunos.get(i).getNome() + " - Matrícula: "
                        + listaDeAlunos.get(i).getAlunoMatricula() + " - CPF: " + listaDeAlunos.get(i).getCpf()
                        + " - E-mail: " + listaDeAlunos.get(i).getEmail() + " - Senha: "
                        + listaDeAlunos.get(i).getSenha());
            }
            int itemAtualizar = sc.nextInt() - 1;
            for (int i = 0; i < listaDeAlunos.size(); i++) {
                if (itemAtualizar == i) {
                    System.out.println("Digite qual opção você deseja modificar:");
                    System.out.println("1 - Nome\n2 - CPF\n3 - Email\n4 - Senha\n");
                    atualizado = sc.nextInt();
                    if (atualizado == 1) {
                        System.out.print("Novo nome: ");
                        nomeAtt = at.nextLine();
                        listaDeAlunos.get(i).setNome(nomeAtt);
                    }
                    if (atualizado == 2) {
                        System.out.print("Novo CPF: ");
                        cpfAtt = at.nextLine();
                        listaDeAlunos.get(i).setCpf(cpfAtt);
                    }
                    if (atualizado == 3) {
                        System.out.print("Novo email: ");
                        emailAtt = at.nextLine();
                        listaDeAlunos.get(i).setEmail(emailAtt);
                    }
                    if (atualizado == 4) {
                        System.out.print("Nova senha: ");
                        senhaAtt = at.nextLine();
                        listaDeAlunos.get(i).setSenhaNova(senhaAtt);
                    }
                }

            }
        }
    }

    // Novo metodo imprimir aluno pelo MENU
    public static void imprimeListaDeAluno() {
        // Se a lista está vazia
        if (!Aluno.listaDeAlunos.isEmpty()) {
            System.out.println("Lista de alunos:");
            for (int i = 0; i < Aluno.listaDeAlunos.size(); i++) {
                System.out.println((i + 1) + " - NOME: " + Aluno.listaDeAlunos.get(i).getNome() + "|CPF: "
                        + Aluno.listaDeAlunos.get(i).getCpf() + "|Email: "
                        + Aluno.listaDeAlunos.get(i).getEmail() + "|Senha: " + Aluno.listaDeAlunos.get(i).getSenha());
            }
        } else {
            System.out.println("Não há aluno cadastrados.\n\n");
        }
    }

    // •--==> GETTERs SETTERs
    public static List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public static void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        Aluno.listaDeAlunos = listaDeAlunos;
    }

    public String getAlunoMatricula() {
        return alunoMatricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalDate getAlunoDataAdmissao() {
        return alunoDataAdmissao;
    }

    public void setAlunoDataAdmissao(LocalDate alunoDataAdmissao) {
        this.alunoDataAdmissao = alunoDataAdmissao;
    }

    public EnumStatusMatricula getAlunoStatus() {
        return alunoStatus;
    }

    public void setAlunoStatus(EnumStatusMatricula alunoStatus) {
        this.alunoStatus = alunoStatus;
    }

}
