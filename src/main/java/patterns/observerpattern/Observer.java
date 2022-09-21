package patterns.observerpattern;

public interface Observer {
    void update();
    void setSubject(Subject subject);
}
