package com.example.observer_pattern;

public interface Subject {
    public void registerObserver(com.example.observer_pattern.Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
