package main.java.ec.edu.espol.observer;

interface Observer {
    void setSubject(Subject s);
    Subject getSubject();
    void update();
}