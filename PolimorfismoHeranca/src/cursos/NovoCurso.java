package cursos;

public abstract class NovoCurso {
    private int codigoCurso;
    private String nome;
    private int vagas;
    private  double valor;
    private String periodo;
    private boolean matricula;

    public NovoCurso(int codigoCurso, String nome, int vagas, double valor, String periodo, boolean matricula) {
        this.codigoCurso = codigoCurso;
        this.nome = nome;
        this.vagas = vagas;
        this.valor = valor;
        this.periodo = periodo;
        this.matricula = matricula;
    }
    public NovoCurso() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public void visualizar() {
        System.out.println("Código do curso: " + getCodigoCurso() +
                "\nNome do cruso: " + getNome() +
                "\nQuantidade de vagas: " + getVagas() +
                "\nPeriodo do curso: " + getPeriodo() +
                "\nValor: " + getValor() +
                "\nAceita matriculas?: " + isMatricula()
        );
    }
}
