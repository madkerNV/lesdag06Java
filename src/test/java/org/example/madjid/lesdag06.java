package org.example.madjid;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class lesdag06 {

@Test
void printDriehoekMetPuntNaarBoven() {
    Scanner invul = new Scanner(System.in);

    System.out.println("Voer het aantal rijen in dat je wilt hebben ");

    int aantalRijen = invul.nextInt();

    for (int index = 1; index <= aantalRijen; index++) {
        for (int ruimteIndex = index; ruimteIndex < aantalRijen; ruimteIndex++) {
            System.out.print(" ");
        }
        for (int printXIndex = 1; printXIndex <= (2 * index - 1); printXIndex++) {
            if (printXIndex == 1 || index == aantalRijen || printXIndex == (2 * index - 1)) {
                System.out.print("X");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    invul.close();
}

@Test
    void printDriehoekMetPuntNaarBenenden() {
    Scanner invul = new Scanner(System.in);
    System.out.println("Voer het aantal rijen in dat je wilt hebben ");

    int aantalRijen = invul.nextInt();
    for (int index=aantalRijen; index>= 1 ; index--)
    {
        for (int ruimteIndex = index; ruimteIndex < aantalRijen ; ruimteIndex++) {
            System.out.print(" ");
        }
        for (int printXIndex = 1; printXIndex <= (2*index -1) ;printXIndex++) {
            if( printXIndex==1 || index == aantalRijen || printXIndex==(2*index-1)) {
                System.out.print("X");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    invul.close();
}


    @Test
    void rechterDriehoek() {
        int size = 5;
        printAt();
        System.out.println();
        for (int i = 0; i < size; i++) {
            rechterDriehoekOpbouwen(i);
            System.out.println();
        }
        for (int i = 0; i < size-1; i++) { //hier zat het probleem
            rechterDriehoekAfbouwen(i, size-1);
            System.out.println();
        }
        printAt();
    }

    void rechterDriehoekOpbouwen(int i) {
        printAt();
        for (int j = 0; j <= i; j++) {
            printStar();
        }
        printAt();
    }
    void rechterDriehoekAfbouwen(int i, int size) {
        printAt();
        for (int j = size; i < j; j = j -1){
            printStar();
        }
        printAt();
    }

    void printStar() {
        System.out.print("* ");
    }
    void printAt() {
        System.out.print("@");
    }


}


