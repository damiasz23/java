package domowe.zadanie8;

import java.util.Scanner;

/**
 * Created by olaIdamian on 8/23/2017.
 */
public class Cos {

    public static int sizeOfFirure(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wielkość figury");
        int size = in.nextInt();
        return size;
    }

    public static void cheesborad(int size) {
        char[][] chees = new char[size][size];
        char temp = '*';
        for (int i = 0; i < chees.length; i++) {
            for (int j = 1; j < chees.length; j++) {
                chees[i][j] = temp;
                System.out.print(temp + " ");
            }
            System.out.println(temp);
        }
    }
    public static void printTopTriangle(int size) {
        char[][] chees = new char[size][size];
        char temp = '*';
        for (int i = 0; i < chees.length; i++) {
            for (int j = 0; j < i; j++) {
                chees[i][j] = temp;
                System.out.print(temp + " ");
            }
            System.out.println(temp);
        }
    }
    public static void printDownTrinangle(int size){
        char[][] chees = new char[size][size];
        char temp = '*';
        for (int i = 0; i < chees.length; i++) {
            for (int j = i; j < chees.length-1; j++) {
                chees[i][j] = temp;
                System.out.print(temp + " ");
            }
            System.out.println(temp);
        }
    }
    public static void printPiramide(int size){
        char[][] chees = new char[size][size];
        char temp = '*';
        for(int i =0;i < chees.length;i++){
            for(int j = 0;j < i;j++){
                chees[i][j] = temp;
                System.out.print(temp + " ");
            }
            System.out.println(temp);
        }
        for (int i = 1;i < chees.length;i++){
            for(int j = i;j < chees.length-1;j++){
                System.out.print(temp + " ");
            }
            System.out.println(temp);
        }
    }


    public static void main(String[] args) {

//        Cos1.addNameToFile();

        Cos.cheesborad(sizeOfFirure());
        System.out.println();

        Cos.printTopTriangle(sizeOfFirure());
        Cos.printDownTrinangle(sizeOfFirure());
        System.out.println();
        Cos.printPiramide(sizeOfFirure());



    }
}
