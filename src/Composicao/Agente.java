package Composicao;

public class Agente {
    private int posicao = 0;

    public void agir(Ambiente ambiente) {
        if (ambiente.estaSujo(posicao)) {
            System.out.println("Agente limpando sala " + posicao);
            ambiente.limparSala(posicao);
        } else {
            System.out.println("Sala " + posicao + " já está limpa.");
        }

        posicao = (posicao + 1) % ambiente.getQtdSalas();
    }
}
