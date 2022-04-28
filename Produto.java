public class Produto {
    String produto;
    Integer quantidadeNoEstoque;
    public Produto(String produto, Integer quantidadeNoEstoque) {
        this.produto = produto;
        this.quantidadeNoEstoque = quantidadeNoEstoque;
        }
        public  boolean temEstoque(){
        if (this.quantidadeNoEstoque >= 10){
            return true;
        }
        return false;
        }
}
