
package ec.edu.espol.observer;

import java.util.Vector;

abstract aspect SubjectObserverProtocol {

    abstract pointcut stateChanges(Subject s);

    before(Subject s): stateChanges(s) {
        //Para saber quien notifico al observador
        for (int i = 0; i < s.getObservers().size(); i++) {
            ((Observer)s.getObservers().elementAt(i)).setSubject(s);
        }
    }
    
    after(Subject s): stateChanges(s) {
    	//Para actualizar al observador
        for (int i = 0; i < s.getObservers().size(); i++) {
            ((Observer)s.getObservers().elementAt(i)).update();
            }
    }

    private Vector Subject.observers = new Vector();
    public void Subject.addObserver(Observer obs) {
        observers.addElement(obs);
        obs.setSubject(this);
    }
    public void Subject.removeObserver(Observer obs) {
        observers.removeElement(obs);
        obs.setSubject(null);
    }
    public Vector Subject.getObservers() { return observers; }

    private Subject Observer.subject = null;
    public void Observer.setSubject(Subject s) { subject = s; }
    public Subject Observer.getSubject() { return subject; }
}
