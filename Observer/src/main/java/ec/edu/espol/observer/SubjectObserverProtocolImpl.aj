package ec.edu.espol.observer;

aspect SubjectObserverProtocolImpl extends SubjectObserverProtocol {

    declare parents: ButtonSubject implements Subject;
    public Object ButtonSubject.getData() { return this; }

    declare parents: GPaneObserver implements Observer;
    public void GPaneObserver.update() {
        Subject notifier = this.getSubject();
        System.out.println(notifier);
        System.out.println(((ButtonSubject) notifier).getText());
        changeColor(((ButtonSubject) notifier).getText());
    }

    pointcut stateChanges(Subject s):
        target(s) &&
        call(void ButtonSubject.click());
    
}
