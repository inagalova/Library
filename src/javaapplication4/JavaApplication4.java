/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author inapg
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(1);
        zad4(list);
    }

    public static void zad1(LinkedList<Integer> n) {

        Scanner a = new Scanner(System.in);
        int b = a.nextInt();

        if (n.contains(b)) {
            System.out.print("Ima go");
        } else {
            System.out.print("Nqma go");
        }
    }

    public static void zad3(LinkedList<Integer> n) {
        int c = 0;
        int d = 0;
        while (c < n.size()) {
            if (n.get(c) < n.get(c + 1)) {
                d++;
            }
            c++;
        }

        if (d == 3) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static void zad2(LinkedList<Integer> n) {
        int b = 0;
        while (b < n.size()) {
            int a = n.get(b);
            n.remove(b);
            if (n.contains(a)) {
                System.out.print(a);
            }
            b++;
        }
    }

    public static void zad4(LinkedList<Integer> n) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        while ((c-b)/2 != 0) {
            int d = n.get(b);
            int e = n.get(c);
            n.set(b, e);
            n.set(c, d);
            b++;
            c--;
        }
        System.out.print(n);
    }

}
