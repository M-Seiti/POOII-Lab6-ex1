public interface Observer {
    void atualizar(float valor);
}

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservers(float valor) {
        for (Observer observer : observers) {
            observer.atualizar(valor);
        }
    }
}