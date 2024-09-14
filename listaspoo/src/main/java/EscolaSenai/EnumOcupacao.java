package EscolaSenai;

import lombok.Getter;

@Getter
public enum EnumOcupacao {
    PROF("Professor(a)"),
    ALUN("Aluno(a)"),
    CORD("Coordenador(a)"),
    INSP("Inspetor(a)"),
    DIRET("Diretor(a)");

    // ATRIBUTO
    private final String EnumOcupacao;

    // CONSTRUTOR
    EnumOcupacao(String ocupacao) {
        this.EnumOcupacao = ocupacao;
    }

    // GETTER
    public String getEnumOcupacao() {
        return this.EnumOcupacao;
    }
}
