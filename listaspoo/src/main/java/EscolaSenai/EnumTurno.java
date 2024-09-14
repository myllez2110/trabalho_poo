package EscolaSenai;

public enum EnumTurno {

    MANHA("Manhã"),
    TARDE("Tarde"),
    NOITE("Noite"),
    INTEGRAL("Integral");

    // Atributo
    private final String escolhaTurnoEnum;

    // Construtor
    EnumTurno(String enumTurnoPorExtenso) {
        this.escolhaTurnoEnum = enumTurnoPorExtenso;
    }

    // Getter
    public String getEscolhaTurnoEnum() {
        return escolhaTurnoEnum;
    }

}
