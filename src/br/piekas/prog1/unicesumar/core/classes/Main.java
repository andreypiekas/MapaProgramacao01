package br.piekas.prog1.unicesumar.core.classes;

import br.piekas.prog1.unicesumar.core.classes.*;
import java.util.Random;

/**
 *
 * @author Andrey Gheno Piekas <andreypiekas at https://github.com/andreypiekas>
 */
public class Main {

    public static void main(String[] args) {

        Evento nEvento = new Evento();
        Ingresso nIngresso = new Ingresso();
        String namesFake[] = {"Andre", "Joao", "Josue", "Gabriela", "Joana", "Adriana"};
        //Criar evento
        nEvento.eventos[0] = new Evento("Evento 01", "01/02/2022", 120.00, 100, 0);

        for (Evento evento : nEvento.eventos) {
            System.out.println(evento.resumo());
            System.out.println(nIngresso.getValorIngresso(evento.getValorUnico()));
        }

        //vender ingresso
        nEvento.eventos[0].vender();
        nIngresso.ingresso[0] = new Ingresso("CAMAROTE", "12345678930", namesFake[new Random().nextInt(namesFake.length)], nEvento.eventos[0].getNomeEvento(), nEvento.eventos[0].getData(), nEvento.eventos[0].getValorUnico(), nEvento.eventos[0].getCapacidadeMAX(), nEvento.eventos[0].getIngressosVendidos());
        nEvento.eventos[0].listaVendidos[0] = nIngresso.ingresso[0].resumoIngresso();
        nEvento.eventos[0].vender();
        nIngresso.ingresso[1] = new Ingresso("VIP", "12345678930", namesFake[new Random().nextInt(namesFake.length)], nEvento.eventos[0].getNomeEvento(), nEvento.eventos[0].getData(), nEvento.eventos[0].getValorUnico(), nEvento.eventos[0].getCapacidadeMAX(), nEvento.eventos[0].getIngressosVendidos());
        nEvento.eventos[0].listaVendidos[1] = nIngresso.ingresso[1].resumoIngresso();
        nEvento.eventos[0].vender();
        nIngresso.ingresso[2] = new Ingresso("PISTA", "12345678930", namesFake[new Random().nextInt(namesFake.length)], nEvento.eventos[0].getNomeEvento(), nEvento.eventos[0].getData(), nEvento.eventos[0].getValorUnico(), nEvento.eventos[0].getCapacidadeMAX(), nEvento.eventos[0].getIngressosVendidos());

        nEvento.eventos[0].listaVendidos[2] = nIngresso.ingresso[2].resumoIngresso();

        for (Evento evento : nEvento.eventos) {
            for (String listaVendidos : evento.listaVendidos) {
                System.out.println(listaVendidos);
            }
        }
    }

}
