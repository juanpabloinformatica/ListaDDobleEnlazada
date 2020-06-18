package com.JuanPablo;

public class Main {

    public static void main(String[] args) {
	Lista l = new Lista();
	int i=5;
	while(i!=0){
        l.crearListaDoblementeEnlazada();
        i--;
    }
	l.recorrerLista();
	System.out.println("\n");

	//l.eliminarNodoPos(5);
	//l.eliminarNodos(1);
    l.insertarDespuesPos(1);
    l.recorrerLista();
    }
}
