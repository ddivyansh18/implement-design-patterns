package singleton.enumS;

// notice it is a enum. not a class
public enum Singleton {
    UNIQUE_INSTANCE;

    public String getDescription() {
        return "I'm a thread safe singleton!";
    }
}
