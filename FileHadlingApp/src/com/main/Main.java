/*
program:write a java program to create menu driven program.
 case 1: create a new file.
 case 2: store some data.
 case 3: copy that file into another file
 case 4: convert all data into uppercase
 case 5: count all vowels.
 case 6: count all words.
 case 7: search specific word from file.
 case 8: search specific word and replace all matching words into another word.
 */
package com.main;

import java.util.*;

import com.repository.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for create a new file.");
        System.out.println("enter 2 for store some data.");
        System.out.println("enter 3 for copy that file into another file.");
        System.out.println("enter 4 for covert all data into uppercase.");
        System.out.println("enter 5 for count all vowels.");
        System.out.println("enter 6 for count all words.");
        System.out.println("enter 7 for search specific word from file");
        System.out.println("search specific word and replace all matching words into another word.");
        System.out.println("enter your choice:");
        int choice;
        choice = sc.nextInt();
        Repository rp = new Repository();
        switch (choice) {
            case 1:
                rp.toCreateNewFile();
                break;
            case 2:
                rp.toStoreData();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("Invalid Input.");
        }
    }
}