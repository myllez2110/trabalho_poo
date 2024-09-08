package trabalho_poo.app;

import java.util.List;

public class Disciplina {
    private String nome;
    private Professor professor;
    private List<Aluno> alunos;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nome + ", Professor: " + professor.getNome();
    }
}
