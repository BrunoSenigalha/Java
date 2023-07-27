package entities;

public class Students {
    private String aluno;
    private double nota_1;
    private double nota_2;
    private final double mediaAluno;

    public Students(String aluno, double nota_1, double nota_2){
        this.aluno = aluno;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.mediaAluno = (this.nota_1 + this.nota_2) / 2;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public double getNota_1() {
        return nota_1;
    }

    public void setNota_1(double nota_1) {
        this.nota_1 = nota_1;
    }

    public double getNota_2() {
        return nota_2;
    }

    public void setNota_2(double nota_2) {
        this.nota_2 = nota_2;
    }
    public double getMediaAluno() {
        return mediaAluno;
    }
}
