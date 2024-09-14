package EscolaSenai;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Disciplina {// Classe base das Disciplinas Lecionadas pelos Disciplinaes para os alunos
    // •--==> ATRITUBTOS
    public static List<Disciplina> listaDeDisciplinasDaEscola = new ArrayList<Disciplina>();

    private static int idDisciplinaContador = 1000;
    private String disciplinaId;
    private String disciplinaCurso;
    private String disciplinaNome;
    private EnumTurno disciplinaTurno;
    private LocalDate disciplinaInicio;
    private LocalDate disciplinaFinal;

    // •--==> CONSTRUTOR
    public Disciplina(String disciplinaCurso, String dNome) {
        this.disciplinaId = (disciplinaCurso + "." + getIdDisciplinaContador() + "-" + dNome);
        idDisciplinaContador++;
        this.disciplinaCurso = disciplinaCurso;
        this.disciplinaNome = dNome;
        this.setDisciplinaTurno(EnumTurno.INTEGRAL);
        this.setDisciplinaInicio(LocalDate.of(2024, 01, 01));
        this.setDisciplinaFinal(LocalDate.of(2024, 12, 31));

    }

    // •--==> METODOS
    // Metodo para ser chamado no MENU para cadastrar Disciplina
    public static void cadastrarDisciplina() {
        System.out.println("- CADASTRANDO NOVA DISCIPLINA -");
        Scanner sn = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome da Disciplina: ");
        String nome = sn.nextLine();

        System.out.print("Curso da Disciplina: ");
        String curso = sc.nextLine();

        Disciplina disciplina = new Disciplina(curso, nome);
        Disciplina.listaDeDisciplinasDaEscola.add(disciplina);
        System.out.println("\n");
    }

    // •--==> METODOS
    // Método imprimir especificidades da disciplna pelo MENU
    public static void imprimeDisciplinaDetalhes() {
        if (!Disciplina.listaDeDisciplinasDaEscola.isEmpty()) {
            System.out.println("Lista detalhada de Disciplina:");
            for (int i = 0; i < Disciplina.listaDeDisciplinasDaEscola.size(); i++) {
                System.out.println(
                        (i + 1) + " - Nome: - " + Disciplina.listaDeDisciplinasDaEscola.get(i).getDisciplinaNome() +
                                " - Curso: - " + Disciplina.listaDeDisciplinasDaEscola.get(i).getDisciplinaCurso()
                                + " - Turno: " + Disciplina.listaDeDisciplinasDaEscola.get(i).getDisciplinaTurno());
            }
        } else {
            System.out.println("Não há disciplinas cadastradas.\n\n");
        }
    }

    // Metodo para deletar Disciplina
    public static void deletarDisciplina() {
        Scanner sc = new Scanner(System.in);
        String removido;
        System.out.println("----- Remover Item da Lista -----");
        if (listaDeDisciplinasDaEscola.isEmpty()) {
            System.out.println("A lista está vazia. Não há itens para remover.");
        } else {
            System.out.println("Escolha o número do item que deseja remover:");
            for (int i = 0; i < listaDeDisciplinasDaEscola.size(); i++) {
                System.out.println(
                        (i + 1) + " - Nome: " + Disciplina.listaDeDisciplinasDaEscola.get(i).getDisciplinaNome() +
                                " - Curso: - " + Disciplina.listaDeDisciplinasDaEscola.get(i).getDisciplinaCurso()
                                + " - Turno: " + listaDeDisciplinasDaEscola.get(i).getDisciplinaTurno());
                removido = Disciplina.listaDeDisciplinasDaEscola.get(i).getDisciplinaNome();
            }

            int itemRemover = sc.nextInt();

            if (itemRemover > 0 && itemRemover <= listaDeDisciplinasDaEscola.size()) {

                removido = listaDeDisciplinasDaEscola.get(itemRemover - 1).getDisciplinaCurso();
                // ao inves de remover, trocar status listaDeDisciplinasDaEscola set status
                // (ativo inativo suspensa trancado);
                listaDeDisciplinasDaEscola.remove(itemRemover - 1);
                System.out.println("Disciplina '" + removido + "' removida da lista.");
            } else {
                System.out.println("Número inválido.");
            }
        }
    }

    // Metodo para atualizar Disciplina
    public static void atualizarDisciplina() {
        Scanner sc = new Scanner(System.in);
        Scanner at = new Scanner(System.in);

        int atualizado;
        String nomeAtt;
        String cursoAtt;
        int turnoAtt;
        System.out.println("----- Atualizar Item da Lista -----");
        if (listaDeDisciplinasDaEscola.isEmpty()) {
            System.out.println("A lista está vazia. Não há itens para atualizar.");
        } else {
            System.out.println("Escolha o número do item que deseja atualizar:");
            for (int i = 0; i < listaDeDisciplinasDaEscola.size(); i++) {
                System.out.println((i + 1) + " - Nome: " + listaDeDisciplinasDaEscola.get(i).getDisciplinaNome()
                        + " - Curso: " + listaDeDisciplinasDaEscola.get(i).getDisciplinaCurso() + " - Turno: "
                        + listaDeDisciplinasDaEscola.get(i).getDisciplinaTurno());
            }

            int itemAtualizar = sc.nextInt() - 1;
            for (int i = 0; i < listaDeDisciplinasDaEscola.size(); i++) {
                if (itemAtualizar == i) {
                    System.out.println("Digite qual opção você deseja modificar:");
                    System.out.println("1 - Disciplina\n2 - Curso\n3 - Turno");
                    atualizado = sc.nextInt();
                    if (atualizado == 1) {
                        System.out.print("Novo nome: ");
                        nomeAtt = at.nextLine();
                        listaDeDisciplinasDaEscola.get(i).setDisciplinaNome(nomeAtt);
                    }
                    if (atualizado == 2) {
                        System.out.print("Novo curso: ");
                        cursoAtt = at.nextLine();
                        listaDeDisciplinasDaEscola.get(i).setDisciplinaCurso(cursoAtt);
                    }
                    if (atualizado == 3) {
                        System.out.print("Novo turno: ");
                        System.out.print("\n1-Manhã\n2-Tarde\n3-Noite\n4-Integral\n");
                        turnoAtt = at.nextInt();
                        switch (turnoAtt) {
                            case 1:
                                listaDeDisciplinasDaEscola.get(i).setDisciplinaTurno(EnumTurno.MANHA);
                                break;
                            case 2:
                                listaDeDisciplinasDaEscola.get(i).setDisciplinaTurno(EnumTurno.TARDE);
                                break;
                            case 3:
                                listaDeDisciplinasDaEscola.get(i).setDisciplinaTurno(EnumTurno.NOITE);
                                break;
                            case 4:
                                listaDeDisciplinasDaEscola.get(i).setDisciplinaTurno(EnumTurno.INTEGRAL);
                                break;
                            case 0:
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
    }

    public void imprimeDisciplina() {
        System.out.println("•====================•");
        System.out.println("|     DISCIPLINA     |");
        System.out.println("•====================•");
        System.out.println("Id da Disciplina:" + getDisciplinaId());
        System.out.println("Curso: " + getDisciplinaCurso());
        System.out.println("Nome: " + getDisciplinaNome());
        System.out.println("Turno: " + getDisciplinaTurno());
        System.out.println("Inicio das aulas: " + getDisciplinaInicio());
        System.out.println("Término das aulas: " + getDisciplinaFinal());
        System.out.println("•====================•");
    }

    // •--==> GETTERs SETTERs
    public static int getIdDisciplinaContador() {
        return idDisciplinaContador;
    }

    public static void setIdDisciplinaContador(int idDisciplinaContador) {
        Disciplina.idDisciplinaContador = idDisciplinaContador;
    }

    public String getDisciplinaId() {
        return disciplinaId;
    }

    public String getDisciplinaCurso() {
        return disciplinaCurso;
    }

    public void setDisciplinaCurso(String disciplinaCurso) {
        this.disciplinaCurso = disciplinaCurso;
    }

    public String getDisciplinaNome() {
        return disciplinaNome;
    }

    public void setDisciplinaNome(String disciplinaNome) {
        this.disciplinaNome = disciplinaNome;
    }

    public EnumTurno getDisciplinaTurno() {
        return disciplinaTurno;
    }

    public void setDisciplinaTurno(EnumTurno disciplinaTurno) {
        this.disciplinaTurno = disciplinaTurno;
    }

    public LocalDate getDisciplinaInicio() {
        return disciplinaInicio;
    }

    public void setDisciplinaInicio(LocalDate disciplinaInicio) {
        this.disciplinaInicio = disciplinaInicio;
    }

    public LocalDate getDisciplinaFinal() {
        return disciplinaFinal;
    }

    public void setDisciplinaFinal(LocalDate disciplinaFinal) {
        this.disciplinaFinal = disciplinaFinal;
        ;
    }

    // Exemplo de disciplinas:
    public static void disciplinasExemplo() throws InputMismatchException {
        // DISCIPLINA
        Disciplina disciplina1 = new Disciplina("TIC", "Lógica de Programação");
        Disciplina disciplina2 = new Disciplina("TIC", "Banco de Dados");
        Disciplina disciplina3 = new Disciplina("TIC", "POO");
        Disciplina disciplina4 = new Disciplina("ING", "Inglês Avançado");

        // a disciplina tem muitos alunos
        // a disciplina tem um Disciplina
    }

}
