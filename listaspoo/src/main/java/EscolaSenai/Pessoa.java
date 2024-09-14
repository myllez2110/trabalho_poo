package EscolaSenai;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pessoa implements Login{ // Classe base para criação de cada usuário Pessoa no sistema
    public static List<Pessoa> listaDeUsuarios = new ArrayList<>();
    // •--==> ATRITUBTOS
    private int id = 0;
    public static int contadorId = 1;

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String senha;
    private EnumOcupacao ocupacaoPessoa;

    public void login(){
        if(this instanceof Professor || this instanceof Funcionario){
            Menu.menuProf();
        } else if (this instanceof Aluno) {
            Menu.menuAluno();            
        }
    }

    /*
     * |ANALISE SOBRE OS ATRIBUTOS|
     * 1) Id gerado como serial •-> idcontador++
     * 2) Nome todos tem
     * 3) Todos tem CPF até menores de idade
     * 4) DataNascimento pode ser usado para saber idade de alunos menores e
     * profissionais idosos
     * 5) Endereço todos tem//criar depois
     * 6) Telefone, para profissionais é o próprio, para alunos menores, do
     * responsável, alunos maiores o próprio (if idade<18)
     * 7) Email todos podem ter pois pode ser Institucional •->
     * SenaiEscola%nome%códgioaleatorio%@senai.com
     * 8) Login poderia utilizar o proprio email?
     * 9) Senha todos tem
     */

    // •--==> CONSTRUTOR

    // •--==> METODOS
    public abstract void imprimePessoa();

    // •--==> GETTERs SETTERs
    public void setPessoa(EnumOcupacao ocupacaoPessoa) {
        this.ocupacaoPessoa = ocupacaoPessoa;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id + contadorId;
        contadorId++;

    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Pessoa.contadorId = contadorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = ("S!" + ((((this.getId() * 53) - 1) / 7) * 9) + "_" + senha);
    }

    public void setSenhaNova(String senha) {
        this.senha = (senha);
    }

}
