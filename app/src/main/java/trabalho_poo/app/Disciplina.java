package EscolaSenai;

public class Disciplina {//Classe base das Disciplinas Lecionadas pelos professores para os alunos
    // •--==> ATRITUBTOS
    private static int idDisciplinaContador=1000;
    private String disciplinaId; 
    private String disciplinaCurso;
    private String disciplinaNome;
    private EnumTurno disciplinaTurno; //ENUM
    private String disciplinaInicio; //localdate
    private String disciplinaFinal;

    // •--==> CONSTRUTOR
    public Disciplina(String disciplinaCurso, String dNome, EnumTurno dTurno, String dInicio, String dFinal){
        this.disciplinaId = (disciplinaCurso+"."+getIdDisciplinaContador()+"-"+dNome);
        idDisciplinaContador++;
        this.disciplinaCurso=disciplinaCurso;
        this.disciplinaNome=dNome;
        this.disciplinaTurno=dTurno;
        this.disciplinaInicio=dInicio;
        this.disciplinaFinal=dFinal;
    }
    // •--==> METODOS
    public void imprimeDisciplina(){
        System.out.println("•====================•");
        System.out.println("|     DISCIPLINA     |");
        System.out.println("•====================•");
        System.out.println("Id da Disciplina:"+getDisciplinaId());
        System.out.println("Curso: "+getDisciplinaCurso());
        System.out.println("Nome: "+getDisciplinaNome());
        System.out.println("Turno: "+getDisciplinaTurno().getEscolhaTurnoEnum());
        System.out.println("Inicio das aulas: "+getDisciplinaInicio());
        System.out.println("Término das aulas: "+getDisciplinaFinal());
        System.out.println("•====================•");
    }

    // •--==> GETTERs SETTERs
    public static int getIdDisciplinaContador() {
        return idDisciplinaContador;
    }

    public static void setIdDisciplinaContador(int idDisciplinaContador) {
        Disciplina.idDisciplinaContador = idDisciplinaContador;
    }

    public String getDisciplinaId() {
        return disciplinaId;
    }    

    public String getDisciplinaCurso() {
        return disciplinaCurso;
    }

    public void setDisciplinaCurso(String disciplinaCurso) {
        this.disciplinaCurso = disciplinaCurso;
    }

    public String getDisciplinaNome() {
        return disciplinaNome;
    }

    public void setDisciplinaNome(String disciplinaNome) {
        this.disciplinaNome = disciplinaNome;
    }

    public EnumTurno getDisciplinaTurno() {
        return disciplinaTurno;
    }

    public void setDisciplinaTurno(EnumTurno disciplinaTurno) {
        this.disciplinaTurno = disciplinaTurno;
    }

    public String getDisciplinaInicio() {
        return disciplinaInicio;
    }

    public void setDisciplinaInicio(String disciplinaInicio) {
        this.disciplinaInicio = disciplinaInicio;
    }

    public String getDisciplinaFinal() {
        return disciplinaFinal;
    }

    public void setDisciplinaFinal(String disciplinaFinal) {
        this.disciplinaFinal = disciplinaFinal;
    }


//a disciplina tem muitos alunos
//a disciplina tem um professor

}
