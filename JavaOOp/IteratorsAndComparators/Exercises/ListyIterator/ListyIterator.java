package JavaOOp.IteratorsAndComparators.Exercises.ListyIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListyIterator {
    private List<String> elements;
    private int count=0;

    public ListyIterator(String... items) {
        this.elements = new ArrayList<>( Arrays.asList(items));
    }

    public boolean Move() {
        if (count == this.elements.size()) {
            return false;
        }
        count++;
        return true;
    }

    public void Print() {
        if (this.elements.isEmpty()) {
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(this.elements.get(count));
        }
    }

    public boolean HasNext() {
        return count != this.elements.size()-1;

    }

}
