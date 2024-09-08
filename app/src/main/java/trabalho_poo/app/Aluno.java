package trabalho_poo.app;

import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private List<Disciplina> disciplinas;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + matricula;
    }
}
