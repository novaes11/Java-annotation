package Listas.ListaDuplamenteEncadeada;

import java.util.Objects;

public class ListaDuplamenteEncadeada {
    private NoDuplamenteEncadeado inicio;
    private NoDuplamenteEncadeado fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionar(Integer conteudo){
        NoDuplamenteEncadeado aux = this.inicio;
        NoDuplamenteEncadeado newNo = new NoDuplamenteEncadeado(conteudo);
        if(!existeInicio()){
            this.fim = this.inicio = newNo;
            System.out.println("Item " +conteudo+ " adicionado com sucesso!");
            return;
        }else if(existeInicio() && this.inicio.getProx() == null){
            this.inicio.setProx(newNo);
            newNo.setAnt(inicio);
            System.out.println("Item " +conteudo+ " adicionado com sucesso!");
            return;
        }

        while (aux.getProx() != null){
            aux = aux.getProx();
        }
        aux.setProx(newNo);
        newNo.setAnt(aux);
        this.fim = newNo;
        System.out.println("Item " +conteudo+ " adicionado com sucesso!");
    }

    public void remover(Integer conteudo){
        NoDuplamenteEncadeado aux = inicio;
        if (existeInicio()) {
            if (Objects.equals(this.fim.getConteudo(), conteudo)) {
                fim.getAnt().setProx(null);
                this.fim = fim.getAnt();
                System.out.println("Item " + conteudo + " removido com sucesso!");
                return;
            }
            if (Objects.equals(this.inicio.getConteudo(), conteudo)) {
                inicio.getProx().setAnt(null);
                this.inicio = inicio.getProx();
                System.out.println("Item " + conteudo + " com sucesso!");
                return;
            }

            while (aux.getProx() != null) {
                if (aux.getConteudo().equals(conteudo)) {

                    aux.getAnt().setProx(aux.getProx());
                    aux.getProx().setAnt(aux.getAnt());
                    System.out.println("Item " + conteudo + " com sucesso!");

                }
                aux = aux.getProx();
            }
        }
        System.out.println("Lista está vazia!");

    }

    public boolean existeInicio(){
        return this.inicio != null;
    }

    public boolean existeFim(){
        return this.fim != null;
    }

    public void exibirDiretamente(){
        NoDuplamenteEncadeado aux = this.inicio;
        if (!existeInicio()){
            System.out.println("Lista está vazia");
            return;
        }
        System.out.println("--Inicio--");
        System.out.println(aux.getConteudo());
        while (aux.getProx() != null){
            aux = aux.getProx();
            System.out.println(aux.getConteudo());
        }
        System.out.println("--Fim--");
    }

    public void exibirInversamente(){
        NoDuplamenteEncadeado aux = this.fim;
        if (!existeFim()){
            System.out.println("Lista está vazia");
            return;
        }
        System.out.println("--Fim--");
        System.out.println(aux.getConteudo());
        while (aux.getAnt() != null){
            aux = aux.getAnt();
            System.out.println(aux.getConteudo());
        }
        System.out.println("--Inicio--");
    }
}
