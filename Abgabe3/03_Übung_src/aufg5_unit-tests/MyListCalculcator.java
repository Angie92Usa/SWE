import java.util.ArrayList;
import java.util.List;

/*
This class holds a list of integers with methods to add integers,
to check if the list is empty and to get the list size.

The class has two mathematical operations:
- calcSum: sum over all elements
- calcAverage: average (arithmetic mean value) of all elements

***
NOTE: this class is intentionally NOT error-free. It has two know bugs, to be uncovered by JUnit-testing!
***
 */
public class MyListCalculcator {

    private List<Integer> elements = new ArrayList<Integer>();

    public void addElement(int elem){
        this.elements.add(elem);
    }

    public boolean isEmpty(){
        return this.elements.size() == 0;
    }

    public int getSize(){
        return this.elements.size();
    }

    public int calcSum() {
        int sum = 0;

        for (int i=0; i < elements.size()-1; i++) {
            sum += elements.get(i);
        }

        return sum;
    }

    public double calcAverage() {
        return calcSum() / getSize();
    }
}
