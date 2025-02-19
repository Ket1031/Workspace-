public class Aluno extends Pessoa{
    private String semestre;
    private String curso;

    // get e set semestre

    public String getSemestre(){
        return semestre;
    }
    void setSemestre(String semestre){
        this.semestre = semestre;
    }

    //get e set curso

    public String getCurso(){
        return curso;
    }
    void setCurso(String curso){
        this.curso = curso;
    }
}
