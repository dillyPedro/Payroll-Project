package Projetos.Trabalho220525;

public class Hora extends Funcionario{
    // Atributos:
    private double salarioPorHora;
    private double horasTrabalhadas;
    private boolean temHoraExtra;

    // Construtor:
    public Hora() {
        super();
        this.salarioPorHora = 0;
        this.horasTrabalhadas = 0;
        this.temHoraExtra = false;
    }

    // Métodos utilizados:
    public String getTipo(){
        return "Funcionário por Hora";
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) throws HorasExtrasException {
        this.horasTrabalhadas = horasTrabalhadas;
        double horasExtrasSemanais = horasTrabalhadas - 40;
        if (horasExtrasSemanais > 10) {
            this.setTemHoraExtra(true); // Marcar como problema trabalhista;
            throw new HorasExtrasException(
                    "O Trabalhador " + this.getNome() + " excedeu o limite de horas extras diárias.",
                    horasExtrasSemanais - 10);
                    // "O Trabalhador " + this.getNome() + " excedeu o limite de horas extras diárias." == message;
                    // horasExtrasSemanais - 10 == horasExcedidas;
        } else {
            this.setTemHoraExtra(false); // Caso não tenha hora extra;
        }
    }

    public void setTemHoraExtra(boolean temHoraExtra) {
        this.temHoraExtra = temHoraExtra;
    }

    public boolean getTemHoraExtra() {
        return temHoraExtra;
    }

    // receberPagamento() == getSalario();
    public double receberPagamento(){
        double pagamento = 0; // valor inicial do pagamento;
        if(this.horasTrabalhadas <= 40){
            pagamento = salarioPorHora * horasTrabalhadas;
        } else {
            double horasRegulares = 40;
            double horasExtras = horasTrabalhadas - horasRegulares;
            pagamento = (salarioPorHora * horasRegulares) + (1.5 * (salarioPorHora * horasExtras));
            // pagamento = salarioSemanal + bônus;
        }
        return pagamento; // retornar o pagamento final;
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\n"
                + "Sobrenome: " + this.getSobrenome() + "\n"
                + "Cpf: " + this.getCpf() + "\n"
                + "Tipo: " + this.getTipo() + "\n"
                + "Salario por Hora: " + this.getSalarioPorHora() + "\n"
                + "Horas Trabalhadas: " + this.getHorasTrabalhadas() + "\n"
                + "SalarioSemanal: " + this.receberPagamento() + "\n"
                + "Problema Trabalhista: " + this.getTemHoraExtra();
    }
}