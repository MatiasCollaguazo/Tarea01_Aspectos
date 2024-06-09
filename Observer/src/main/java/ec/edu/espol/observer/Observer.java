package ec.edu.espol.observer;

interface Observer {
    void setSubject(Subject s);
    Subject getSubject();
    void update();
    void update(Object o);
}