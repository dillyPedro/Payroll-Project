package Projetos.Trabalho220525;

public class TestandoFuncionario {
    public static void main(String[] args) {

        // Criando o objeto do tipo "Assalariado":
        Assalariado a1 = new Assalariado();
        a1.setNome("Pedro");
        a1.setSobrenome("Dilly");
        a1.setCpf("123.456.789");
        a1.setSalarioSemanal(1500);
        // System.out.println(a1); // Irá retornar o "toString";

        System.out.println("\n");

        // Criando o objeto do tipo "Hora":
        Hora h1 = new Hora();
        h1.setNome("Claudia");
        h1.setSobrenome("Santos");
        h1.setCpf("111.111.111-11");
        h1.setSalarioPorHora(500);
        try {
            h1.setHorasTrabalhadas(55);
        } catch (HorasExtrasException erro) {
            System.out.println("Erro na folha de pagamento do trabalhador");
            System.out.println("Horas extras: " + erro.getHorasExcedidas());
            // getHorasExcedidas == horasExtrasSemanais - 10;
        }
        // System.out.println(h1);  // Irá retornar o "toString";

        System.out.println("\n");

        // Criando o objeto do tipo "Comissionado":
        Comissionado c1 = new Comissionado();
        c1.setNome("Osvaldo");
        c1.setSobrenome("Santos");
        c1.setCpf("222.222.222-22");
        c1.setVendas(1000);
        // System.out.println(c1); // Irá retornar o "toString";

        System.out.println("\n");

        // Criando o objeto do tipo "Comissionado/Assalariado":
        ComissionadoAssalariado ca1 = new ComissionadoAssalariado();
        ca1.setNome("Fátima");
        ca1.setSobrenome("Santos");
        ca1.setCpf("333.333.333-33");
        ca1.setSalarioBase(5000);
        ca1.setVendas(15000);
        // System.out.println(ca1); // Irá retornar o "toString";

        System.out.println("\n");

        // Criando um objeto do tipo "Fatura":
        Fatura fatura = new Fatura("1111", "Computador", 12, 82.00);

        // Retornando o valor total a ser pago:
        Pagamento[] pagamentos = new Pagamento[5]; // ArrayList para retornar todos os pagamentos que estão conectados a interface;
        pagamentos[0] = a1;
        pagamentos[1] = h1;
        pagamentos[2] = c1;
        pagamentos[3] = ca1;
        pagamentos[4] = fatura;

        int i = 0;
        for(i = 0; i < pagamentos.length; i++) {
            System.out.println(pagamentos[i].toString());
            System.out.println("Valor a pagar: " + pagamentos[i].receberPagamento());
            System.out.println("\n");
        }
    }
}