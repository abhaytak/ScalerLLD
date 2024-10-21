package generics;

//generic types on a class level
public class Pair <V, S>{
    V first;
    S second;

    public void setSecond(V x) {
        this.first = x;
    }

    public S getSecond() {
        return second;
    }
}
