package Projetos.Trabalho220525;

public abstract class Funcionario implements Pagamento{
    // Atributos:
    private String nome;
    private String sobrenome;
    private String cpf;
    private double salario;

    // Construtor:
    public Funcionario() {
        super();
    }

    // Métodos utilizados:
    public abstract String getTipo();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract double receberPagamento();

    /*
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    */

    public String toString() {
        return this.nome + "\n"
                + this.sobrenome + "\n"
                + this.cpf + "\n"
                + this.salario;
    }
}