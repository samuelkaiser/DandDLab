package com.company;

import java.util.Scanner;

/**
 *
 * @author Sam Kaiser
 */
public class Main {

    public static void main(String[] args) {
        boolean stillPlaying = true;
        Scanner keyboard = new Scanner(System.in);
        int nextMove;
        String name;
        Character basicCharacter;
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        basicCharacter = new BasicCharacter(name);
        boolean keepPlaying = true;
        do{
            System.out.println("Would you like to add a (1) Spear, (2) Sword, (3) Shield, or (4) skip a meal? or 5 to exit.");
            nextMove = keyboard.nextInt();
            switch(nextMove){
                case 1: basicCharacter = new Spear(basicCharacter); break;
                case 2: basicCharacter = new Sword(basicCharacter); break;
                case 3: basicCharacter = new Shield(basicCharacter); break;
                case 4: basicCharacter = new Starving(basicCharacter); break;
                case 5: keepPlaying = false;
                default:
                    System.out.println("bro..."); break;
            }

            System.out.println("Name: " + basicCharacter.getName());
            System.out.println("Health: " +
                    basicCharacter.getHealth());
        }while((basicCharacter.getHealth() >= 0) && (keepPlaying == true));





        /*basicCharacter = new Spear(new Sword(new Shield(new Starving((new
                BasicCharacter("Bilbo"))))));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Health: " +
                basicCharacter.getHealth());


                        boolean stillPlaying = true;
        Scanner keyboard = new Scanner(System.in);
        int nextMove;
        String name;
        Character basicCharacter;

        basicCharacter = new Spear(new Sword(new Shield(new Starving((new
                BasicCharacter("Bilbo"))))));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Health: " +
                basicCharacter.getHealth());

        System.out.println("You've met a farmer named Joe with a gold necklace.\n Would you like to steal his necklace?" +
                "\n (y)");
        String response = keyboard.nextLine();
        if(response.toLowerCase() == "y"){

        }

    */

    }

    public void makeMove(int nextMove){

    }
}
