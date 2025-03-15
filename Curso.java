public class Curso {
    private int idCurso;
    private String nomeCurso;
    private int duracao; // Duração em horas
    private float preco;

    public Curso(int idCurso, String nomeCurso, int duracao, float preco) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.duracao = duracao;
        this.preco = preco;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getDuracao() {
        return duracao;
    }

    public float getPreco() {
        return preco;
    }

    public String toString() {
        return "Curso [ID: " + idCurso + ", Nome: " + nomeCurso + ", Duração: " + duracao + " horas, Preço: R$" + preco + " ]";
    }
}
