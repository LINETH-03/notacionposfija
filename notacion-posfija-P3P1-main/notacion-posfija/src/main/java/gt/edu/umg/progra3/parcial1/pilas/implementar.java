package gt.edu.umg.progra3.parcial1.pilas;

import java.util.ArrayList;
import java.util.List;

public class implementar implements Pila{
    List<String>stacck= new ArrayList<>();

    @Override
    public void push(String item) {
        stacck.add(item);


    }

    @Override
    public String pop() {


        return stacck.remove(stacck.size()-1);
    }

    @Override
    public String peek() {

        return stacck.get(stacck.size()-1);
    }

    @Override
    public int size() {

        return stacck.size();
    }

    @Override
    public boolean isEmpty() {

        return stacck.isEmpty();
    }
}
