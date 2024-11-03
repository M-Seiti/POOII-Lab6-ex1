public class MainQuestao1 {
    public static void main(String[] args) {
        CentralEstacaoTempo cet = new CentralEstacaoTempo();

        ObservadorUmidade defesaCivil = new ObservadorUmidade();
        ObservadorRajadasVento aeroporto = new ObservadorRajadasVento();

        cet.adicionarObserver(defesaCivil);
        cet.adicionarObserver(aeroporto);

        cet.setDados(25.0f, 25.0f, 60.0f); // Alerta de baixa umidade e fortes rajadas de vento
    }
}
