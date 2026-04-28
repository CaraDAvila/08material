public abstract class Empregado {
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    //superclasse | classe abstrata NÃO GERA OBJETO
    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }

    //public String getDados(){

    //}
}
