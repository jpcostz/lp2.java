import java.util.ArrayList;
import java.util.List;

public class EstoqueProdutos {
    private List<ProdutoEstoque> produtos;

    public EstoqueProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void adicionaProduto (ProdutoEstoque produto) {
        this.produtos.add(produto);
    }

    public ProdutoEstoque buscarProduto (String nome) {
        for (ProdutoEstoque p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }
}

