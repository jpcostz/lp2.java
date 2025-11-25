public class Item {
    private String nomeProduto;
    private int quantidadeDesejada;

    public Item(String nomeProduto, int quantidadeDesejada) {
        this.nomeProduto = nomeProduto;
        this.quantidadeDesejada = quantidadeDesejada;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidadeDesejada() {
        return quantidadeDesejada;
    }
}