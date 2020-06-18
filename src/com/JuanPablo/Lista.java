package com.JuanPablo;

import javax.swing.*;

public class Lista {
    Nodo cabeza,temp;
    void crearListaDoblementeEnlazada(){
        Nodo nuevoNodo= new Nodo();
        int num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        nuevoNodo.num=num;
        if(cabeza==null){
            cabeza=nuevoNodo;
            temp=cabeza;

        }else{
            temp.rlink=nuevoNodo;
            nuevoNodo.llink=temp;
            temp=nuevoNodo;
        }

    }
    void recorrerLista(){
        Nodo puntero = cabeza;
        while(puntero!=null){
            System.out.println(puntero.num);
            puntero=puntero.rlink;
        }
        System.out.println("\n");
       /* recorrerAtras();*/
    }
/*    Nodo ultimoNodo(){
        Nodo puntero=cabeza;
        while(puntero.rlink!=null){
            puntero=puntero.rlink;
        }
        return puntero;
    }
    void recorrerAtras(){
        Nodo puntero = ultimoNodo();
        while(puntero!=null){
            System.out.println(puntero.num);
            puntero=puntero.llink;
        }
    }*/
    void eliminarNodoPos(int pos){
        Nodo puntero = cabeza;
        int cont=1;
        while(puntero!=null&&cont!=pos){
            cont++;
            puntero=puntero.rlink;
        }
        if(cont==pos){
            if(puntero!=cabeza&&puntero.rlink!=null){
                puntero.llink.rlink=puntero.rlink;
                puntero.rlink.llink=puntero.llink;
            }else if(puntero.rlink==null){
                puntero.llink.rlink=null;
                puntero.llink=null;
            }else{
                cabeza=cabeza.rlink;
                cabeza.llink=null;
            }

        }else{
            System.out.println("No se pudo eliminar");
        }


    }
    void eliminarNodos(int elem){
        Nodo puntero = cabeza;
        while(puntero!=null){
            if(puntero.num==elem){
                if(puntero!=cabeza&&puntero.rlink!=null){
                    puntero.llink.rlink=puntero.rlink;
                    puntero.rlink.llink=puntero.llink;
                }else if(puntero.rlink==null){
                    puntero.llink.rlink=null;
                    puntero.llink=null;
                }else{
                    cabeza=cabeza.rlink;
                    cabeza.llink=null;
                }

            }
            puntero=puntero.rlink;
            }
        }
        void insertarDespuesPos(int pos){
        Nodo puntero = cabeza;
        int cont =1;
        while(puntero!=null&&cont!=pos){
            cont++;
            puntero=puntero.rlink;
        }
        if(cont==pos){
            Nodo nuevoNodo = new Nodo();
            nuevoNodo.num=100;
            if(puntero.rlink==null){
                nuevoNodo.rlink=null;
                puntero.rlink=nuevoNodo;
                nuevoNodo.llink=puntero;
            }else{
                nuevoNodo.rlink=puntero.rlink;
                puntero.rlink=nuevoNodo;
                puntero.rlink.llink=nuevoNodo;
                nuevoNodo.llink=puntero;
            }
        }
        }
    }


