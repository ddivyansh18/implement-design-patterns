package templatemethod.sort;

public class Duck implements Comparable<Duck>{
    String name;
    int weight;
    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString() {
        return name + " weight " + weight;
    }
    public int compareTo(Duck o) {
        return Integer.compare(this.weight, o.weight);
    }
}
