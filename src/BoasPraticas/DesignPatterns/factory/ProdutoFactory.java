package src.BoasPraticas.DesignPatterns.factory;

import src.BoasPraticas.DesignPatterns.model.Produto;
import src.BoasPraticas.DesignPatterns.model.ProdutoAlimenticio;
import src.BoasPraticas.DesignPatterns.model.ProdutoEletronico;
import src.BoasPraticas.DesignPatterns.strategy.DescontoAlimenticio;
import src.BoasPraticas.DesignPatterns.strategy.DescontoEletronico;

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