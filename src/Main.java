import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Scanner;
class MyException extends Exception {
    private int detail;
    MyException(int a) {
        detail = a;
    }
    public String toString() {
        return "MyException[" + detail + "]";
    }
}

class Gen<T extends Comparable>{
    T ob;
    Gen(T v){
        ob=v;
    }
    int Search(T[] a,T key){
       try{
           for(int i=0;i<a.length;i++)
               if(a[i]==key) {
                   return i;
               }
           throw new Exception();
       } catch (Exception e){
           System.out.println("valoarea data nu se afla in sir");
           return -1;
       }

    }
    public void permutari(T[] a,int p, int n)
    {
        //Trebuie ca n sa fie mai mare sau egal cu 1 si p>=0
       try{ if(n<1)
            throw new MyException(n);
        if (p == n) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        else
        {
            for (int i = p; i <= n; i++) {
                T aux = a[p];
                a[p] = a[i];
                a[i] = aux;
                permutari(a, p + 1, n);
                aux = a[p];
                a[p] = a[i];
                a[i] = aux;
            }
        }
    }catch (MyException e){
           System.out.println("n trebuie sa fie mai mare sau egal cu 1");
       }
       catch (IndexOutOfBoundsException e){
           System.out.println("IndexOutofBounds");
       }
    }



}
class Myclass {
    public static void main(String args[]) {
        Integer[] valori = {3, 6, 2, 8, 4};
        Gen<Integer> s = new Gen<Integer>(1);
       System.out.println( s.Search(valori, 4));
        System.out.println( s.Search(valori, 7));
       Pair<Integer> per1=new Pair<Integer>(2,3);
        per1.Afisare();
        per1.Swap();
        per1.Afisare();
        per1.PairUtil(valori).Afisare();
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
       try {
           s.permutari(a, 0, n - 1);
       }catch (IndexOutOfBoundsException e)
       {
           System.out.println("Array index oob: " + e);
       }
    }
}
