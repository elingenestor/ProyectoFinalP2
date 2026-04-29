package com.uqvirtual.edu.co.proyectop2.patterns.behavioral.observer;

public interface Observable {
    void agregarObserver(Observer observer);
    void removerObserver(Observer observer);
    void notificarObserver();
}
