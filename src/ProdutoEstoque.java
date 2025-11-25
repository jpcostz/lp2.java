public class ProdutoEstoque {
    private String nome;
    private int quantidade;
    private double valor;


    public ProdutoEstoque (String nome, double valor, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void baixarEstoque (int qtdComprada) {
        if (qtdComprada <= this.quantidade) {
            this.quantidade -= qtdComprada;
            System.out.println("Estoque de '" + this.nome + "' baixado em " + qtdComprada + ". Novo estoque: " + this.quantidade);
        } else {
            System.out.println("Erro: Estoque insuficiente para o produto: " +this.nome);
        }
    }
}