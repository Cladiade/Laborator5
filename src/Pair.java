import javax.lang.model.type.NullType;

public class Pair<T extends Comparable> {
    public Pair(T firstElement, T secondElement) {
        first = firstElement;
        second = secondElement;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
    public void Afisare()
    {
        try{
        System.out.println("("+first+","+second+")");
    } catch (Exception e){
            System.out.println(e);
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }

    public void Swap()
    {
        try {
            T aux;
            aux = first;
            first = second;
            second = aux;
        }catch (NullPointerException e)
        {
            System.out.println("Null gasit in Swap");
        }
    }
    public Pair<T> PairUtil(T[] a)
{
    try{
    T min=a[0];
    T max=a[0];
    for(int i=1;i<a.length;i++)
    {
        if(a[i].compareTo(min)<0)
            min=a[i];
        if(a[i].compareTo(max)>0)
            max=a[i];
    }
    Pair<T>minmax=new Pair<T>(min,max);
    return minmax;
} catch (NullPointerException e){
        System.out.println("Null gasit in PairUtil");
        return null;
    }
}
    private T first;
    private T second;
}