package Projetos.Trabalho220525;

public class Comissionado extends Funcionario{
    // Atributos:
    private double porcentagem;
    private double vendas;

    // Construtor:
    public Comissionado() {
        super();
        this.porcentagem = 0.10;
        this.vendas = 0;
    }

    // Métodos utilizados:
    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        if(vendas > 0){
            this.vendas = vendas;
        }else{
            this.vendas = 0;
            System.out.println("O valor das vendas não podem ser zero");
        }
    }

    public double receberPagamento() {
        return this.vendas * this.porcentagem;
    }

    // Retirei os métodos "getSalario()" e "setSalario()";

    public String getTipo(){
        return "Funcionário Comissionado";
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\n"
                + "Sobrenome: " + this.getSobrenome() + "\n"
                + "Cpf: " + this.getCpf() + "\n"
                + "Tipo: " + this.getTipo() + "\n"
                + "Porcentagem: " + this.getPorcentagem() + "\n"
                + "Vendas: " + this.getVendas() + "\n"
                + "Salario: " + this.receberPagamento();
    }
}