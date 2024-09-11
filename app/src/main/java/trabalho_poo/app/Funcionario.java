package EscolaSenai;

public abstract class Funcionario extends Pessoa {
    //o que é do funcionario? precisaria saber quem são os funcionários da escola
    // •--==> ATRITUBTOS
    private String funcDataContratacao;
    private String funcStatus;//Ativo, Afastado/Inativo, Férias
    
    // •--==> CONSTRUTOR

    
    
    // •--==> METODOS
    public abstract void imprimePessoa();
    
    // •--==> GETTERs SETTERs
    public String getFuncDataContratacao() {
        return funcDataContratacao;
    }

    public void setFuncDataContratacao(String funcDataContratacao) {
        this.funcDataContratacao = funcDataContratacao;
    }

    public String getFuncStatus() {
        return funcStatus;
    }
    
    public void setFuncStatus(String funcStatus) {
        this.funcStatus = funcStatus;
    }

}
