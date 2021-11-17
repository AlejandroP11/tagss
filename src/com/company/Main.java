package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String nombreP= JOptionPane.showInputDialog("Introduce el nombre del producto");
        float ventasA=Integer.parseInt(JOptionPane.showInputDialog("Introduce las ventas anuales"));
        if (ventasA<=100)
            System.out.println(nombreP+" es un producto de bajo consumo");
        else
        if(ventasA<=500)
            System.out.println(nombreP+" es un producto de consumo medio");
        else
        if(ventasA<=1000)
            System.out.println(nombreP+" es un producto de alto consumo");
        else
            System.out.println(nombreP+" es un producto de primera necesidad");
    }
    }

