import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    private EstoqueProdutos estoque;
    private List<Item> itens;

    public CarrinhoCompra(EstoqueProdutos estoque) {
        this.estoque = estoque;
        this.itens = new ArrayList<>();
    }

    public void adicionaItem(Item item) { 
        String nomeProduto = item.getNomeProduto();
        int quantidade = item.getQuantidadeDesejada();

        ProdutoEstoque produto = this.estoque.buscarProduto(nomeProduto);

        if (produto != null) {
            this.itens.add(item); 
            System.out.println(nomeProduto + " (x" + quantidade + ") adicionado ao carrinho.");
        } else {
            System.out.println("Produto '" + nomeProduto + "' não encontrado no estoque.");
        }
    }

    public double calculaTotal() {
        double total = 0.0;
        for (Item item : itens) {

            ProdutoEstoque produtoNoEstoque = this.estoque.buscarProduto(item.getNomeProduto());
            
            if (produtoNoEstoque != null) {
                total += produtoNoEstoque.getValor() * item.getQuantidadeDesejada();
            }
        }
        return total;
    }

    public void finalizaCompra() {
        System.out.println("\n--- Finalizando Compra ---");

        for (Item item : itens) {
            ProdutoEstoque produto = this.estoque.buscarProduto(item.getNomeProduto());
            int quantidade = item.getQuantidadeDesejada();
            
            if (produto != null) {
                produto.baixarEstoque(quantidade); 
            } else {
                 System.out.println("Não foi possível baixar o estoque de: " + item.getNomeProduto() + " (Produto não encontrado).");
            }
        }

        System.out.println("--- Compra Concluída ---");
        //this.itens.clear(); 
    }
}