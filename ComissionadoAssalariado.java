package Projetos.Trabalho220525;

public class ComissionadoAssalariado extends Funcionario {
    // Atributos:
    private double vendas;
    private double porcentagem;
    private double bonus;
    private double salarioBase;

    // Construtor:
    public ComissionadoAssalariado() {
        super();
        this.vendas = 0;
        this.porcentagem = 0.05;
        this.bonus = 0.10;
    }

    // Métodos utilizados:
    public String getTipo(){
        return "Funcionário Comissionado/Assalariado";
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        if(vendas > 0){
            this.vendas = vendas;
        }else{
            this.vendas = 0;
            System.out.println("O valor das vendas não podem ser menor ou igual a 0");
        }
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salario) {
        // Bônus de 10% no salário base;
        this.salarioBase = salario + (0.10 * salarioBase);
    }

    public double receberPagamento(){
        return this.salarioBase + (this.porcentagem * this.vendas);
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\n"
                + "Sobrenome: " + this.getSobrenome() + "\n"
                + "Cpf: " + this.getCpf() + "\n"
                + "Tipo: " + this.getTipo() + "\n"
                + "Vendas: " + this.getVendas() + "\n"
                + "Porcentagem: " + this.getPorcentagem() + "\n"
                + "Bonus: " + this.getBonus() + "\n"
                + "Salario Base: " + this.getSalarioBase() + "\n"
                + "Salario Final: " + this.receberPagamento();
    }
}