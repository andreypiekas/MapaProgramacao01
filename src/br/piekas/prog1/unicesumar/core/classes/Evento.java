package br.piekas.prog1.unicesumar.core.classes;

/**
 *
 * @author Andrey Gheno Piekas <andreypiekas at https://github.com/andreypiekas>
 */
public class Evento {

    private String nomeEvento;
    private String data;
    private double valorUnico;
    private int capacidadeMAX;
    private int ingressosVendidos;
    protected Evento[] eventos = new Evento[1];
    protected String[] listaVendidos = new String[3];

    public Evento() {
    }

    public Evento(String nomeEvento, String data, double valorUnico, int capacidadeMAX, int ingressosVendidos) {
        this.nomeEvento = nomeEvento;
        this.data = data;
        this.valorUnico = valorUnico;
        this.capacidadeMAX = capacidadeMAX;
        this.ingressosVendidos = ingressosVendidos;
    }

    public String getNomeEvento() {
        return nomeEvento;//
    }

    public String getData() {
        return data;//
    }

    public double getValorUnico() {
        return valorUnico;//
    }

    public int getCapacidadeMAX() {
        return capacidadeMAX;//
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;//
    }

    public String[] getListaVendidos() {
        return listaVendidos;//
    }

    public void setListaVendidos(String[] listaVendidos) {
        this.listaVendidos = listaVendidos;//
    }

    public String resumo() {
        String resumo = "\n";
        resumo += "-----------------------------------------------\n";
        resumo += "Nome do Evento: " + this.nomeEvento + "\n";
        resumo += "Data do Evento: " + this.data + "\n";
        resumo += "Valor Unico sem taxas: " + this.valorUnico + "\n";
        resumo += "Capacidade Maxima: " + this.capacidadeMAX + "\n";
        resumo += "-----------------------------------------------\n";
        return resumo;

    }

    public void vender() {
        this.capacidadeMAX--;
        this.ingressosVendidos++;

    }

    public String quantidade() {

        String quantidade = "-----------------------------------------------\n";
        quantidade += "Quantidade de ingressos vendidos: " + getIngressosVendidos() + "\n";

        quantidade += "-----------------------------------------------\n";
        quantidade += "Quantidade de ingressos disponíveis: " + getCapacidadeMAX() + "\n";
        quantidade += "-----------------------------------------------\n";
        return quantidade;

    }

}
