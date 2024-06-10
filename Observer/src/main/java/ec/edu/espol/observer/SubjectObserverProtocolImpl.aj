package main.java.ec.edu.espol.observer;

aspect SubjectObserverProtocolImpl extends SubjectObserverProtocol {

    declare parents: BotonCustom implements Subject;
    public Object BotonCustom.getData() { return this; }

    declare parents: PanelCustom implements Observer;
    public void PanelCustom.update() {
        Subject notifier = this.getSubject();
        //System.out.println(notifier);
        //System.out.println(((ButtonSubject) notifier).getText());
        changeColor(((BotonCustom) notifier).getText());
    }

    pointcut stateChanges(Subject s):
        target(s) &&
        call(void BotonCustom.click());
}
