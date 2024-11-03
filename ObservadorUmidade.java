
public class ObservadorUmidade implements Observer {
    @Override
    public void atualizar(float umidade) {
        if (umidade < 30.0f) {
            System.out.println("Alerta: Umidade baixa! Emitindo alerta da defesa civil.");
        }
    }
}

