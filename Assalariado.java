package Projetos.Trabalho220525;

public class Assalariado extends Funcionario{
    // Atributos:
    private double salarioSemanal;

    // Construtor:
    public Assalariado() {
        super();
    }

    // Métodos utilizados:
    public String getTipo(){
        return "Funcionário Assalariado";
    }

    public double getSalarioSemanal() {
        return this.salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    // Retornará o salário recebido;
    public double receberPagamento() {
        return this.salarioSemanal;
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\n" +
                "Sobrenome: " + this.getSobrenome() + "\n" +
                "Cpf: " + this.getCpf() + "\n" +
                "Tipo: " + this.getTipo() + "\n" +
                "Salario Semanal: " + this.receberPagamento();
    }
}