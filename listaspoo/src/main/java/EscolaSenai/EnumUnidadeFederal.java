package EscolaSenai;

public enum EnumUnidadeFederal {

    // Sudeste
    RJ("Rio de Janeiro"), SP("São Paulo"),
    MG("Minas Gerais"), ES("Espirito Santo"),

    // Nordeste
    BA("Bahia"), SE("Sergipe"), AL("Alagoas"),
    PE("Pernambuco"), PB("Paraíba"), RN("Rio Grande do Norte"),
    CE("Ceará"), PI("Piauí"), MA("Maranhão"), TO("Tocantins"),

    // Norte
    PA("Pará"), AP("Amapá"), RR("Roraima"),
    AM("Amazonas"), AC("Acre"), RO("Rondônia"),

    // Centro-Oeste
    MT("Mato Grosso"), MS("Mato Grosso do Sul"),
    GO("Goiás"), DF("Distrito Federal"),

    // Sul
    RS("Rio Grande do Sul"), SC("Santa Catarina"),
    PR("Paraná");

    // atributo
    private final String nomePorExtenso;

    // construtor
    EnumUnidadeFederal(String nomePorExtensoDigitado) {
        this.nomePorExtenso = nomePorExtensoDigitado;
    }

    // getter
    public String getNomePorExtenso() {
        return nomePorExtenso;
    }

}
