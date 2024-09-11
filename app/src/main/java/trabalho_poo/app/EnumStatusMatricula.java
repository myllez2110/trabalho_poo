package EscolaSenai;

public enum EnumStatusMatricula {
    ATIVO("Ativo no Sistema"),
    INATIVO("Inativo no Sistema"),
    SUPENSO("Suspenso no Sistema"),
    TRANCADO("Trancado no Sistema"),
    AFASTADO("Afastado no Sistema"),
    CONCLUIDO("Concluído no Sistema");

    //ATRIBUTO
    private final String EnumStatMat;
    
    //CONSTRUTOR
    EnumStatusMatricula(String EnumStatusMatPorExtenso){
        this.EnumStatMat = EnumStatusMatPorExtenso;
    }
    
    //GETTER
    public String getEnumStatMat() {
        return EnumStatMat;
    }
}
