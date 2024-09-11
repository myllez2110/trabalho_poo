package EscolaSenai;

public enum EnumEstadoCivil {
    CASADO("Casado(a)"), 
    SOLTEIRO("Solteiro(a)"), 
    DIVORCIADO("Divorciado(a)"), 
    SEPARADO("Separado(a)"),
    VIUVO("Viuvo(a)");

    //ATRIBUTO
    private final String estadoCivil;
    
    
    //CONSTRUTOR
    EnumEstadoCivil(String escolhaEstCivil){
        this.estadoCivil = escolhaEstCivil;
    }
    
    
    //GETTER
    public String getEnumEstadoCivil() {
        return estadoCivil;
    }
}
