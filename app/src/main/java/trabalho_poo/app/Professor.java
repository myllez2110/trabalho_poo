package EscolaSenai;

public class Professor extends Funcionario {
    // •--==> ATRITUBTOS
    private int professorId=0;
    private String professorMatricula; //Primary Key

    // •--==> CONSTRUTOR
    public Professor(String nomeProf, String dataContratacao){        
        this.setId(professorId);
        this.professorMatricula=("P-"+this.getId());
        this.setFuncDataContratacao(dataContratacao);
        this.setFuncStatus("Ativo");
        this.setNome(nomeProf);
        //this.setDataNascimento("1990");
        this.setEmail("SenaiEscola."+nomeProf+"."+this.getProfessorMatricula()+".professores@senai.com");
        this.setSenha(this.professorMatricula);
        
    }
    
    // •--==> METODOS
    public void imprimePessoa(){ //Metodo da Superclasse Pessoa ele liga o extends Pessoa no aluno
        //Dados da Pessoa
        System.out.println("•====================•");
        System.out.println("| DADOS DE PROFESSOR |");
        System.out.println("•====================•");
        System.out.println("Id:"+getId());
        System.out.println("Nome: "+getNome());
       // System.out.println("Data Nascimento: "+getDataNascimento());
        System.out.println("Email: "+getEmail());
        System.out.println("Senha: "+getSenha());//temporario para debug
    
        //Dados de Professor
        System.out.println("Matricula: "+getProfessorMatricula());
        System.out.println("Data da Admissao: "+getFuncDataContratacao());
        System.out.println("Situação: "+getFuncStatus());
        System.out.println("•====================•");
        
    }
    
    // •--==> GETTERs SETTERs
    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getProfessorMatricula() {
        return professorMatricula;
    }

    public void setProfessorMatricula(String professorMatricula) {
        this.professorMatricula = professorMatricula;
    }


//o professor avalia varios alunos em cada disciplina
}
