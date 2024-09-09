package trabalho_poo.app;

public class Aluno extends Pessoa{ //Classe base dos alunos da instituição

// •--==> ATRITUBTOS
private int alunoId=0;
private String alunoMatricula; //Primary Key
private String alunoDataAdmissao;
private String alunoStatus; //ativo, trancado, suspenso, concluído

// •--==> CONSTRUTOR
public Aluno(String nomeAl){        
    this.setId(alunoId);
    this.alunoMatricula=("A-"+this.getId());
    this.alunoDataAdmissao="Setembro";
    this.alunoStatus="Ativo";
    this.setNome(nomeAl);
    this.setDataNascimento("2007");
    this.setEmail("SenaiEscola."+nomeAl+"."+this.getAlunoMatricula()+".alunos@senai.com");
    this.setSenha(this.alunoMatricula);

}

// •--==> METODOS
@Override
public void imprimePessoa(){ //Metodo da Superclasse Pessoa ele liga o extends Pessoa no aluno
    //Dados da Pessoa
    System.out.println("•====================•");
    System.out.println("| DADOS   DE   ALUNO |");
    System.out.println("•====================•");
    System.out.println("Id:"+getId());
    System.out.println("Nome: "+getNome());
    System.out.println("Data Nascimento: "+getDataNascimento());
    System.out.println("Email: "+getEmail());
    System.out.println("Senha: "+getSenha());//temporario para debug

    //Dados de Aluno
    System.out.println("Matricula: "+getAlunoMatricula());
    System.out.println("Data da Admissao: "+getAlunoDataAdmissao());
    System.out.println("Situação: "+getAlunoStatus());
    System.out.println("•====================•");
    
}

// •--==> GETTERs SETTERs
public String getAlunoMatricula() {
    return alunoMatricula;
}


public String getAlunoDataAdmissao() {
    return alunoDataAdmissao;
}

public void setAlunoDataAdmissao(String alunoDataAdmissao) {
    this.alunoDataAdmissao = alunoDataAdmissao;
}

public String getAlunoStatus() {
    return alunoStatus;
}

public void setAlunoStatus(String alunoStatus) {
    this.alunoStatus = alunoStatus;
}


}
