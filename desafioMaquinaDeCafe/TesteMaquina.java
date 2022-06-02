package desafioMaquinaDeCafe;

public class TesteMaquina {
    public static void main(String[] args) {
        MaquinaCafe maquinaCafe = new MaquinaCafe();
        maquinaCafe.acucarDisponivel = 30;
        maquinaCafe.fazercafe(30);
        maquinaCafe.fazercafe(45);
    }
}
