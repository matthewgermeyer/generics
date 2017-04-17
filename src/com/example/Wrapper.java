package com.example;

/**
 *
 * Write a simple Wrapper class with the following methods
 *
 * Only one constructor that takes E
 * Getter and setter

 * getType method that returns the String name of the class of E
 * hashCode, equals and toString
 *
 *
 public class Queue<E> {

 private List<E> qoo = new LinkedList<>();

 public void add(E e) {
 qoo.add(e);
 }

 public E remove() {
 if (qoo.isEmpty()) {
 return null;
 }
 return qoo.remove(0);
 }
 */
public class Wrapper <E> {
    private E e;

    public Wrapper(E e) {
        this.e = e;
    }

    //Set n Get

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    //GetType method:
    public String getType() {
        // get the class of the element e, then get the name of that class.
        return e.getClass().getName();


    }

//    private String getType(Wrapper e) {

//    }

/*
if (i == 0)
{
    a = 10;
    b = 6;
    c = 3;
}
else
{
    a = 5;
    b = 4;
    d = 1;
}
a = *IF i==0 * 10 : *ELSE*
a = (i == 0) ? 10 : 5;
b = (i == 0) ? 6  : 4;
c = (i == 0) ? 3  : 9;
d = (i == 0) ? 12 : 1;


int count = (condition) ? 1 : 0;
is any harder than this:

int count;

if (condition)
{
  count = 1;
}
else
{
  count = 0;
}
 */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wrapper<?> wrapper = (Wrapper<?>) o;

        //return e != null ? e.equals(wrapper.e) : wrapper.e == null;
        //---> If / then / else
        if (e != null){
            return e.equals(wrapper.e);
        } else
            return wrapper.e == null;
    }

    @Override
    public int hashCode() {
        //return e != null ? e.hashCode() : 0;
        // changed to if then else
        if (e != null){
            return e.hashCode();
        } else
            return 0;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "e=" + e +
                '}';
    }
}
