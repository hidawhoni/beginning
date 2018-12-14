package com.kosmo.test2222;

public class Test {
    static void change(MyName m) { 
        m = new MyName(“abc123“); 
  }
  public static void main(String[] a) {
  MyName m = new MyName(“abc”);
  change(m);
  System.out.println(m.name);


}
