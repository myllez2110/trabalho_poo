package trabalho_poo.app;

import java.util.List;

public class Professor extends Pessoa {
    private String especializacao;
    private List<Disciplina> disciplinas;

    public Professor(String nome, String cpf, String especializacao) {
        super(nome, cpf);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialização: " + especializacao;
    }
}
