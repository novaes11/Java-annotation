package BoasPraticas.DesignPatterns.factory;

import BoasPraticas.DesignPatterns.model.Produto;
import BoasPraticas.DesignPatterns.model.ProdutoAlimenticio;
import BoasPraticas.DesignPatterns.model.ProdutoEletronico;
import BoasPraticas.DesignPatterns.strategy.DescontoAlimenticio;
import BoasPraticas.DesignPatterns.strategy.DescontoEletronico;

public class ProdutoFactory {
    public static Produto criar(String tipo, String cod, String desc, double preco, String info) {
        if (tipo.equalsIgnoreCase("E")) {
            return new ProdutoEletronico(cod, desc, preco, Integer.parseInt(info), new DescontoEletronico());
        } else if (tipo.equalsIgnoreCase("A")) {
            return new ProdutoAlimenticio(cod, desc, preco, info, new DescontoAlimenticio());
        }
        throw new IllegalArgumentException("Tipo inválido");
    }
}