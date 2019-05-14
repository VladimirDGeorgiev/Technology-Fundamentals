package JavaOOp.Generics.Lab.JarOfT;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> content;

    Jar() {
        this.content = new ArrayDeque<>();
    }

    public void add(T entity){
        this.content.push(entity);
    }
    T remove(){
        if (this.content.size()>0){
            return  this.content.pop();
        }

        return null;
    }
}
