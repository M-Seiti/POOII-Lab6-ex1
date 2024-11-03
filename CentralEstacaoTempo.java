public class CentralEstacaoTempo extends Subject {
    private float temperatura;
    private float umidade;
    private float velocidadeVento;

    public void setDados(float temperatura, float umidade, float velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.velocidadeVento = velocidadeVento;

        notificarObservers(umidade);
        notificarObservers(velocidadeVento);
    }
}