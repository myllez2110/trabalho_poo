package trabalho_poo.app;

public class Nota {
    private double valor;
    private Aluno aluno;
    private Disciplina disciplina;

    public Nota(double valor, Aluno aluno, Disciplina disciplina) {
        if (valor < 0 || valor > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
        }
        this.valor = valor;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public double getValor() {
        return valor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return "Aluno: " + aluno.getNome() + ", Disciplina: " + disciplina.getNome() + ", Nota: " + valor;
    }
}
