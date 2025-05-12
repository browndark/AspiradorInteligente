package Composicao;

public class Ambiente {
    private boolean[] salas = {true, true}; // Duas salas sujas por padrão

    public boolean estaSujo(int sala) {
        return salas[sala];
    }

    public void limparSala(int sala) {
        salas[sala] = false;
    }

    public int getQtdSalas() {
        return salas.length;
    }

    public void mostrarEstado() {
        for (int i = 0; i < salas.length; i++) {
            System.out.println("Sala " + i + ": " + (salas[i] ? "Suja" : "Limpa"));
        }
    }
}
