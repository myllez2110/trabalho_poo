package EscolaSenai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.ApplicationArguments;

public class Aluno extends Pessoa{ //Classe base dos alunos da instituição

// •--==> ATRITUBTOS
static List<Aluno> listaDeAlunos = new ArrayList<>();
//static List<Aluno> listaDeAlunos;

private int alunoId=0;
private String alunoMatricula; //Primary Key
//private LocalDate alunoDataAdmissao; //localdate
private EnumStatusMatricula alunoStatus; //ENUM --> ativo, trancado, suspenso, concluído
private Endereco endereco; //enum no endereço


// •--==> CONSTRUTOR
//Construtor Base
public Aluno(String nomeAl){
    this.setId(alunoId);
    this.alunoMatricula=("A-"+this.getId());
    //this.alunoDataAdmissao="Setembro"; //localdate
    this.alunoStatus = EnumStatusMatricula.ATIVO;
    this.setNome(nomeAl);
    //this.setDataNascimento(LocalDate.now()); //localdate tem calculo de idade
    this.setEmail("SenaiEscola."+nomeAl+"."+this.getAlunoMatricula()+".alunos@senai.com");
    this.setSenha(this.alunoMatricula);
    listaDeAlunos = new ArrayList<>();


}
//Construtor Add Endereço
public void alunoEndereco(Endereco endereco){
    this.endereco = endereco;
}
//Construtor Add na Lista de Alunos
public void listaGeralDeAlunos(Aluno alunoAddLista){ // A LISTA CONTINUA VAZIA
    
    for (Aluno alunoLogin : listaDeAlunos) {
        alunoLogin = alunoAddLista;
        if (listaDeAlunos.isEmpty()){            
        listaDeAlunos = new ArrayList<>();
        listaDeAlunos.add(alunoAddLista);
        }
    }
}

// •--==> METODOS
//rodar um for para buscar o login senha e retornar true false
public static void checagemLogin(){
    Scanner leiaLogin = new Scanner(System.in);
    Scanner leiaSenha = new Scanner(System.in);
    String loginDigitado;
    String senhaDigitada;
    System.out.println(" •---===ESCOLA SENAI===---•");
    System.out.println("Ambiente Virtual - Alunos(as)");

    System.out.println("Digite seu email institucional:");
    loginDigitado=leiaLogin.nextLine();
    System.out.println("Digite sua senha:");
    senhaDigitada=leiaSenha.nextLine();   
    for (Aluno alunoLogin : listaDeAlunos) {
        if (loginDigitado.equals(alunoLogin.getEmail()) && senhaDigitada.equals(alunoLogin.getSenha())) {
            System.out.println("Login bem sucedido, você está acessando o Ambiente Virtual de Alunos");
            //ambienteVirtual();?
        }
        else {
            System.out.println("Login ou Senha inválidos");
            //_Application.main(null);
        }

    }
}
//Lista de Alunos
public static void imprimeListaDeAlunos(){
    if(listaDeAlunos.isEmpty()){
        System.out.println("Nenhum aluno(a) cadastrado(a) no sistema");
    }
    else{
        for (Aluno aluno : listaDeAlunos) {
            System.out.println("Aluno: "+aluno.getNome()+"");
            System.out.println("Matrícula: "+aluno.getAlunoMatricula()+"");
            System.out.println("Status: "+aluno.getAlunoStatus()+"");
            System.out.println("Email Institucional: "+aluno.getEmail()+"");
            System.out.println("Senha Institucional: "+aluno.getEmail()+"");
        }
    }
}

//conversão date
@Override
public void imprimePessoa(){ //Metodo da Superclasse Pessoa ele liga o extends Pessoa no aluno
    //Dados da Pessoa
    System.out.println("•====================•");
    System.out.println("| DADOS   DE   ALUNO |");
    System.out.println("•====================•");
    System.out.println("Id:"+getId());
    System.out.println("Nome: "+getNome());
    //System.out.println("Data Nascimento: "+getDataNascimento());
    System.out.println("Email: "+getEmail());
    System.out.println("Senha: "+getSenha());//temporario para debug
    
    //Dados de Aluno
    System.out.println("Matricula: "+getAlunoMatricula());
    //System.out.println("Data da Admissao: "+getAlunoDataAdmissao());
    System.out.println("Situação: "+getAlunoStatus());
    System.out.println("•====================•");
    
}

// •--==> GETTERs SETTERs
public static List<Aluno> getListaDeAlunos() {
    return listaDeAlunos;
}
public static void setListaDeAlunos(List<Aluno> listaDeAlunos) {
    Aluno.listaDeAlunos = listaDeAlunos;
}

public String getAlunoMatricula() {
    return alunoMatricula;
}

public Endereco getEndereco() {
    return endereco;
}

public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
}
/*
public String getAlunoDataAdmissao() {
    return alunoDataAdmissao;
    }
    
public void setAlunoDataAdmissao(String alunoDataAdmissao) {
    this.alunoDataAdmissao = alunoDataAdmissao;
}
*/
public EnumStatusMatricula getAlunoStatus() {
    return alunoStatus;
}

public void setAlunoStatus(EnumStatusMatricula alunoStatus) {
    this.alunoStatus = alunoStatus;
}


}
