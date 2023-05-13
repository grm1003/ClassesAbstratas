import java.util.ArrayList;

public class ProdutoMain {
    public static void main(String[] args) {
        double soma = 0;
        ArrayList<Produto> produtos = new ArrayList<>();
        Cafe c = new Cafe("00","bebida", 2022,5, 5.9);
        Cafe p = new Cafe("01","bebida", 2023,8, 9);
        produtos.add(c);
        produtos.add(p);
        Vinho v = new Vinho("02","bebida", 2012,4, 20.5);
        Vinho g = new Vinho("03","bebida", 2006,2, 38.5);
        produtos.add(v);
        produtos.add(g);
        Eletrodomestico e = new Eletrodomestico("04","eletronico", 2012,3, 2000);
        Eletrodomestico l = new Eletrodomestico("05","eletronico", 2022,2, 3000);
        produtos.add(e);
        produtos.add(l);
        //coloca a categoria
        String cat = "bebida";
        int quant = 0;
        double precototal = 0;
        for(int i = 0; i < produtos.size(); i++){
           if(produtos.get(i).categoria() == cat){
              quant +=  produtos.get(i).unidadeVenda();
               precototal +=  produtos.get(i).preco();
           }
            soma += produtos.get(i).preco()*produtos.get(i).unidadeVenda();
        }
        System.out.println(soma);
        System.out.println(quant+ "    "+precototal);
    }
}
