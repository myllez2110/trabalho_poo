package EscolaSenai;

public class Endereco {

    // ATRIBUTOS
    public static int contadorid = 8800;

    private int id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private EnumUnidadeFederal estado;
    private String cep;

    // CONSTRUTOR
    // public Endereco(){

    public Endereco(String log, String num, String comp, String bai, String cid, EnumUnidadeFederal est, String cep) {
        this.id = contadorid;
        contadorid++;
        this.logradouro = log;
        this.numero = num;
        this.complemento = comp;
        this.bairro = bai;
        this.cidade = cid;
        this.estado = est;
        this.cep = cep;
    }

    // METODO
    public void imprimeEndereco() {
        System.out.println("---------");
        System.out.println("ENDEREÇO:");
        System.out.println(this.id);
        System.out.println(this.logradouro);
        System.out.println(this.numero);
        System.out.println(this.complemento);
        System.out.println(this.bairro);
        System.out.println(this.cidade);
        System.out.println(this.estado);
        System.out.println(this.cep);
    }

    // Getters e Setters
    public static int getContadorid() {
        return contadorid;
    }

    public static void setContadorid(int contadorid) {
        Endereco.contadorid = contadorid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public EnumUnidadeFederal getEstado() {
        return estado;
    }

    public void setEstado(EnumUnidadeFederal estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
