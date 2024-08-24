/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.switchstatement;

import java.util.Scanner;

/**
 *
 * @author kennsoft
 */
public class SwitchStatement {

    public static void main(String[] args) {
        Scanner myGrade = new Scanner(System.in);
        int score;
        int unitcode;

        System.out.println("Enter the unitcode :");
        unitcode = myGrade.nextInt();

        System.out.println("Enter the marks :");
        score = myGrade.nextInt();

        switch (unitcode) {
            case 1:
                if (score >= 70) {
                    System.out.println("Excellent !");
                } else if (score >= 60) {
                    System.out.println("Very good");
                } else if (score >= 50) {
                    System.out.println("Good");
                } else if (score >= 40) {
                    System.out.println("Fair");
                } else {
                    System.out.println("Try again");
                }
                System.out.println("Java");
                break;
            case 2:
                if (score >= 70) {
                    System.out.println("Excellent !");
                } else if (score >= 60) {
                    System.out.println("Very good");
                } else if (score >= 50) {
                    System.out.println("Good");
                } else if (score >= 40) {
                    System.out.println("Fair");
                } else {
                    System.out.println("Try again");
                }
                System.out.println("C");

                break;
            case 3:
                if (score >= 70) {
                    System.out.println("Excellent !");
                } else if (score >= 60) {
                    System.out.println("Very good");
                } else if (score >= 50) {
                    System.out.println("Good");
                } else if (score >= 40) {
                    System.out.println("Fair");
                } else {
                    System.out.println("Try again");
                }
                System.out.println("Maths");

                break;
            case 4:
                if (score >= 70) {
                    System.out.println("Excellent !");
                } else if (score >= 60) {
                    System.out.println("Very good");
                } else if (score >= 50) {
                    System.out.println("Good");
                } else if (score >= 40) {
                    System.out.println("Fair");
                } else {
                    System.out.println("Try again");
                }
                System.out.println("Networks");

                break;
            default:
                System.out.println("You Scored Bellow");
        }
        System.out.println("Your grade is " + score);
    }
}


























