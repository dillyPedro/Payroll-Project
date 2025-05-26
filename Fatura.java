package Projetos.Trabalho220525;

public class Fatura implements Pagamento{
    // Fatura == invoice;

    //Atributos:
    private String numeroPeca; // partNumber;
    private String descricaoPeca; // partDescription;
    private int quantidade; // quantity;
    private double precoPorItem; // priceperitem;

    // Construtor:
    public Fatura(String numeroPeca, String descricaoPeca, int quantidade, double precoPorItem){
        this.numeroPeca = numeroPeca;
        this.descricaoPeca = descricaoPeca;
        this.quantidade = quantidade;
        this.precoPorItem = precoPorItem;
    }

    // Métodos:
    public String getNumeroPeca() {
        return numeroPeca;
    }

    public void setNumeroPeca(String numeroPeca) {
        this.numeroPeca = numeroPeca;
    }

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0) {
            this.quantidade = quantidade;
        }else{
            if(quantidade <= 0) {
                throw new ArithmeticException("O valor deve ser maior que zero");
            }
        }
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        if(precoPorItem > 0) {
            this.precoPorItem = precoPorItem;
        }else{
            throw new ArithmeticException("O valor por item deve ser maior que zero");
        }
    }

    public double receberPagamento() {
        return this.getQuantidade() * this.precoPorItem;
    }

    public String toString(){
        return "Número da Peça: " + getNumeroPeca() + "\n" +
                "Descrição: " + getDescricaoPeca() + "\n" +
                "Quantidade: " + getQuantidade() + "\n" +
                "Preço por Item: " + getPrecoPorItem() + "\n" +
                "Valor a Pagar: " + receberPagamento();
    }
}
