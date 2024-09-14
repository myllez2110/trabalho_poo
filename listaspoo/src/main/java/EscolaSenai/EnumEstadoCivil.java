package EscolaSenai;

public enum EnumEstadoCivil {

    CASADO("Casado(a)"),
    SOLTEIRO("Solteiro(a)"),
    SEPARADO("Separado(a)"),
    DIVORCIADO("Diovorciado(a)"),
    VIUVO("Viuvo(a)");

    private final String estadoCivil;

    EnumEstadoCivil(String escolhaEstCivil) {
        this.estadoCivil = escolhaEstCivil;
    }

    // GETTER
    public String getEnumEstadoCivil() {
        return estadoCivil;
    }

}
