package adapter.internum;

import java.util.*;
public class EnumerationIterator implements Iterator<Object>{
    Enumeration<?> enumeration;
    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }
    public boolean hasNext() {
        return this.enumeration.hasMoreElements();
    }

    public Object next() {
        return this.enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
