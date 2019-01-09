package Aufgabe1;

import javax.swing.*;
import java.util.Random;

public class Array
{
public static void main (String []args) {
    int x = Integer.parseInt(JOptionPane.showInputDialog("Wie groß soll das Aufgabe1.Array sein?")); //Größe eingeben, string wird in Int umgewandelt.
    int[] array1 = new int[x];

    for (int i = 0; i < x; i++) {
        Random zahl = new Random();
        array1[i] = zahl.nextInt(1000);
    }

    for(int i=array1.length -1; i >=0;i--)
    {
        System.out.println(array1[i]);
    }
}
}
