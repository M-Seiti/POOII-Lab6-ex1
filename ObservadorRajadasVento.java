public class ObservadorRajadasVento implements Observer {
    @Override
    public void atualizar(float velocidadeVento) {
        if (velocidadeVento > 50.0f) {
            System.out.println("Alerta: Rajadas de vento fortes! Emitindo alerta para o aeroporto.");
        }
    }
}