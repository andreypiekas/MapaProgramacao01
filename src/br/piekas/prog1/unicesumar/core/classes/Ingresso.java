package br.piekas.prog1.unicesumar.core.classes;

/**
 *
 * @author Andrey Gheno Piekas <andreypiekas at https://github.com/andreypiekas>
 */
public class Ingresso extends Evento {

    private String tipoLocal;
    private String nomeCliente;
    private String cpf;
    private Double categoria;
    protected Ingresso[] ingresso = new Ingresso[3];

    public Ingresso() {
    }

    public Ingresso(String tipoLocal, String cpf, String nomeCliente, String nomeEvento, String data, double valorUnico, int capacidadeMAX, int ingressosVendidos) {
        super(nomeEvento, data, valorUnico, capacidadeMAX, ingressosVendidos);
        this.tipoLocal = tipoLocal;
        this.cpf = cpf;
        this.nomeCliente = nomeCliente;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public String getCpf() {
        return cpf;
    }

    private double valorIngresso(String tipoLocal) {

        if (tipoLocal == "CAMAROTE") {
            this.categoria = getValorUnico() * 1.60;
        } else if (tipoLocal == "PISTA") {
            this.categoria = getValorUnico() * 1.30;
        } else {
            this.categoria = getValorUnico();

        }
        return this.categoria;
    }

    public String getValorIngresso(double valor) {
        String valor01 = "\n";
        valor01 += "-----------------------------------------------\n";
        valor01 += "CAMAROTE: " + (valor * 1.60) + "\n";
        valor01 += "VIP: " + (valor * 1.30) + "\n";
        valor01 += "PISTA " + valor + "\n";
        valor01 += "-----------------------------------------------\n";
        return valor01;

    }

    public String impressaoIngresso(String tipoLocal) {
        String dados = "\n";
        dados += "-----------------------------------------------\n";
        dados += "Evento Ingresso: " + getNomeEvento() + " " + getData() + "\n";
        dados += "Ingresso: " + tipoLocal;
        dados += "Valor do Ingresso: R$ " + valorIngresso(tipoLocal);
        return dados;
    }

    public String resumoIngresso() {
        String resumo = "\n";
        resumo += "-----------------------------------------------\n";
        resumo += "Resumo Bilheteria\n";
        resumo += "Nome do Evento: " + getNomeEvento() + " " + getData() + "\n";
        resumo += "Nome: " + this.nomeCliente + "\n";
        resumo += "Tipo Local: " + this.tipoLocal + "\n";
        resumo += "CPF: " + this.cpf + "\n";
        resumo += "Valor: R$" + valorIngresso(tipoLocal) + "\n";
        resumo += quantidade() + "\n";
        return resumo;
    }
}
