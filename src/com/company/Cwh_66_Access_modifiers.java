/*
 Access Modifiers in java-
 Access Modifiers determine whether other classes can use a perticular field or invoke a particular 
 method can be public, private, protected or default(no modifier).
 
 Modifier       class       Package     Subclass        World
  Public           Y            Y           Y              Y
Protected         Y            Y           Y              N
Defalut(No)       Y            Y           N              N
Private           Y            N           N              N
 
*/
package com.company;
class c1{
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 76;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class Cwh_66_Access_modifiers {
    public static void main(String[] args) {
        c1 c = new c1();
        c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a);    //this line will show an error because 'a'  is modified as private.
    }
}
