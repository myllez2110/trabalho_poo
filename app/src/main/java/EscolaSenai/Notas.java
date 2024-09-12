package EscolaSenai;

public class Notas{//Classe Ent. Associativa Aluno-Disciplina -> Vai escoar os dados para o sistema
    // •--==> ATRITUBTOS
    private static float idContNota=1.53241f;
    private String idNota; 
    private Aluno aluno;
    private Disciplina disciplina;
    private Professor professor;
    private int qtdAvFeitas=0;
    private double notaFinal;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    private int trabalho1;
    private int trabalho2;
    private String dataFechamentoBoletim;
    private String dataProva1;
    private String dataProva2;
    private String dataProva3;
    private String dataProva4;
    private String dataTrabalho1;
    private String dataTrabalho2;

    // •--==> CONSTRUTOR
    public Notas(Aluno alunoAv, Disciplina disciplinaAv, Professor professorAv){
        this.aluno = alunoAv;
        this.disciplina = disciplinaAv;
        this.professor = professorAv;
        this.idNota = idContNota+"-ID";
        idContNota+=1d;
        //this.alunoAv = aluno;
        
    }
    //System.out.println("Matricula:"+getAlunoMatricula);
    
    // •--==> METODOS  
    public void aplicarAvaliacao(Aluno alunoAv, Disciplina disciplinaAv, Professor professorAv, int opcaoAvNumero, String dataAv, int resultadoAv){
        this.aluno = alunoAv;
        this.disciplina = disciplinaAv;
        this.professor = professorAv;
        this.getIdNota();

        if(opcaoAvNumero>6||opcaoAvNumero<0){
            System.out.println("Opção de Avaliação inválida. Escolha uma das avaliações digitando de 1 a 6.");
            return;
        }
        else if(opcaoAvNumero==1){
            dataProva1 = dataAv;
            nota1 = resultadoAv;
            qtdAvFeitas++;
            return;
        }
        else if(opcaoAvNumero==2){
            dataProva2 = dataAv;
            nota2 = resultadoAv;
            qtdAvFeitas++;
            return;
        }
        else if(opcaoAvNumero==3){
            dataProva3 = dataAv;
            nota3 = resultadoAv;
            qtdAvFeitas++;
            return;
        }
        else if(opcaoAvNumero==4){
            dataProva4 = dataAv;
            nota4 = resultadoAv;
            qtdAvFeitas++;
            return;
        }
        else if(opcaoAvNumero==5){
            dataTrabalho1 = dataAv;
            trabalho1 = resultadoAv;
            qtdAvFeitas++;
            return;
        }
        else if(opcaoAvNumero==6){
            dataTrabalho2 = dataAv;
            trabalho2 = resultadoAv;
            qtdAvFeitas++;
            return;
        }
        else{
            System.out.println("Opção de Avaliação inválida. Escolha uma das avaliações digitando de 1 a 6.");
        }
    }

    public void imprimeBoletim(){
        System.out.println("•====================•");
        System.out.println("|      BOLETIM       |");
        System.out.println("•====================•");
        System.out.println("Id Nota: "+this.idNota);
        System.out.println("Aluno: "+this.getAluno().getNome());
        System.out.println("Curso: "+this.getDisciplina().getDisciplinaCurso());
        System.out.println("Disciplina: "+this.getDisciplina().getDisciplinaNome());
        System.out.println("Professor: "+this.getProfessor().getNome());
        System.out.println("Avaliações realizadas: "+this.qtdAvFeitas);
        System.out.println("Nota 1: "+this.nota1);
        System.out.println("Nota 2: "+this.nota2);
        System.out.println("Nota 3: "+this.nota3);
        System.out.println("Nota 4: "+this.nota4);
        System.out.println("Trabalho 1: "+this.trabalho1);
        System.out.println("Trabalho 2: "+this.trabalho2);
        this.notaFinal=((this.nota1+this.nota2+this.nota3+this.nota4+this.trabalho1+this.trabalho2)/qtdAvFeitas);
        System.out.println("NOTA FINAL: "+this.notaFinal);
        if(notaFinal>=6){System.out.println("APROVADO");}
        else{System.out.println("REPROVADO");}
        System.out.println("•====================•");
    }
    //nota é do aluno na discliplina
    //-nota1 nota2 nota3 nota4 
    //boletim é como o imprimir ficha
    //aprovado reprovado
    // avaliação seria um método não uma classe específica 


    // •--==> GETTERs SETTERs
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getIdNota() {
        return idNota;
    }

    public void setIdNota(String idNota) {
        this.idNota = idNota;
    }

    public float getIdContNota() {
        return idContNota;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public int getTrabalho1() {
        return trabalho1;
    }

    public void setTrabalho1(int trabalho1) {
        this.trabalho1 = trabalho1;
    }

    public int getTrabalho2() {
        return trabalho2;
    }

    public void setTrabalho2(int trabalho2) {
        this.trabalho2 = trabalho2;
    }

    public String getDataFechamentoBoletim() {
        return dataFechamentoBoletim;
    }

    public void setDataFechamentoBoletim(String dataFechamentoBoletim) {
        this.dataFechamentoBoletim = dataFechamentoBoletim;
    }

    public String getDataProva1() {
        return dataProva1;
    }

    public void setDataProva1(String dataProva1) {
        this.dataProva1 = dataProva1;
    }

    public String getDataProva2() {
        return dataProva2;
    }

    public void setDataProva2(String dataProva2) {
        this.dataProva2 = dataProva2;
    }

    public String getDataProva3() {
        return dataProva3;
    }

    public void setDataProva3(String dataProva3) {
        this.dataProva3 = dataProva3;
    }

    public String getDataProva4() {
        return dataProva4;
    }

    public void setDataProva4(String dataProva4) {
        this.dataProva4 = dataProva4;
    }

    public String getDataTrabalho1() {
        return dataTrabalho1;
    }

    public void setDataTrabalho1(String dataTrabalho1) {
        this.dataTrabalho1 = dataTrabalho1;
    }

    public String getDataTrabalho2() {
        return dataTrabalho2;
    }

    public void setDataTrabalho2(String dataTrabalho2) {
        this.dataTrabalho2 = dataTrabalho2;
    }
    
    
    
    
    
    //o aluno faz avaliacao de uma ou mais disciplinas e recebe nota    | Aluno -> 1-1 Avaliação -> 1-n Disciplina
    //o aluno é avaliado por um professor em uma ou mais disciplinas    | Aluno -> 1-1 Professor -> 1-n Disciplina
    //
    //a disciplina avalia um ou mais alunos e atribui nota              | Disciplina -> 1-1 Avaliação -> 1-n Aluno
    //o aluno é avaliado por um professor em uma ou mais disciplinas    | Disciplina -> 1-1 Professor -> 1-n Aluno
    
}
