import java.util.ArrayList;

class MyGenerics <T1, T2>{  // Creation of 
    int val;
    private T1 t1;
    private T2 t2;
    
    public MyGenerics(int val, T1 t1, T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public void setVal(int val){
        this.val = val;
    }
    public int getVal(){
        return val;
    }

    public void setT1(T1 t1){
        this.t1 = t1;
    }
    public T1 getT1(){
        return t1;
    }
    public void setT2(T2 t2){
        this.t2 = t2;
    }
    public T2 geT2(){
        return t2;
    }
}

public class Cwh_110_Generics {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();    //If we want to add the integers in the arrarylist then 
                                                            //we supply the type of class type we are to use, this <Integer> is called Generics.
 
       // arrayList.add("Str1");
        arrayList.add(54);
        arrayList.add(643);

        int a = arrayList.get(1);
        // System.out.println(a);
        MyGenerics<String, Integer> g1 = new MyGenerics(25, "MyString is my string.","165");
        String str = g1.getT1();
        System.out.println(str);

        Integer int1 = g1.geT2();
        System.out.println("The value of t2 is: "+int1);

        Integer i = g1.val;
        System.out.println(i);
    }
}
