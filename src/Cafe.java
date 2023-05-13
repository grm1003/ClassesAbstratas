public class Cafe implements Produto {
    private String id, categoria;
    private  int anoProducao,unidadeVend;
    private double preco;

    public Cafe(String id, String categoria, int anoProducao, int unidadeVend, double preco) {
        this.id = id;
        this.categoria = categoria;
        this.anoProducao = anoProducao;
        this.unidadeVend = unidadeVend;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "cafe{" +
                "id='" + id + "\n" +
                ", categoria='" + categoria +"\n" +
                ", anoProducao=" + anoProducao +"\n" +
                ", unidadeVend=" + unidadeVend + "\n" +
                ", preco=" + preco + "\n" +
                '}';
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public Integer anoProducao() {
        return anoProducao;
    }

    @Override
    public Integer unidadeVenda() {
        return unidadeVend;
    }

    @Override
    public String categoria() {
        return categoria;
    }

    @Override
    public String mostraDados() {
        return this.toString();
    }

    @Override
    public double preco() {
        return preco;
    }
}
