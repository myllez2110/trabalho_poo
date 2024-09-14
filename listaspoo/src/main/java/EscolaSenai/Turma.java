package EscolaSenai;

import java.util.ArrayList;
import java.util.List;

public class Turma {//

    private int id;
    private String numero;
    private List<Aluno> listaDeAlunos; // listaDeAlunos.add ou remove
    private List<Professor> listaDeProf; // listaDeAlunos.add ou remove

    public Turma(int id, String numero) {
        this.id = id;
        this.numero = numero;
        this.listaDeAlunos = new ArrayList<>();
        this.listaDeProf = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.listaDeAlunos.add(aluno);
    }

    public void adicionarProf(Professor professor) {
        this.listaDeProf.add(professor);
    }

    public void imprimeTurma() {

        System.out.println("Id da Turma:" + this.getId());
        if (listaDeAlunos.isEmpty()) {
            System.out.println("Turma vazia");
        } else {
            for (Aluno aluno : listaDeAlunos) {
                System.out.println("Aluno: " + aluno.getNome() + "");
                System.out.println("Aluno: " + aluno.getAlunoStatus() + "");
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public List<Professor> getListaDeProf() {
        return listaDeProf;
    }

    public void setListaDeProf(List<Professor> listaDeProf) {
        this.listaDeProf = listaDeProf;
    }

}
