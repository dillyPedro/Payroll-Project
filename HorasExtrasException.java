package Projetos.Trabalho220525;

public class HorasExtrasException extends Exception {
    // Criando a exceção para verificar as horas extras:

    // Atributos:
    private double horasExcedidas;

    // Construtor:
    public HorasExtrasException(String message, double horasExcedidas) {
        super(message);
        this.horasExcedidas = horasExcedidas;
    }

    public double getHorasExcedidas() {
        return horasExcedidas;
    }
}