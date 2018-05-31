package com.ogcg.polymorphism;

public class PolyTest {

    public int add(int x, int y) {
    	System.out.println("Llamada 1");
    	return x+y;
    }

    public int add(int x, int y, int z) {
    	System.out.println("Llamada 2");
    	return x+y+z;
    }

    // Se puede cambiar el valor de retorno
    public double add(double x, int y) {
    	System.out.println("Llamada 3");
    	return x+y;
    }

    public int add(int x, double y) {
    	System.out.println("Llamada 4");
    	return x+(int)y;
    }
}
