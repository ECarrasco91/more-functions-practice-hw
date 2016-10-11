package com.company;

import java.util.Random;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        System.out.println("Welcome.. to Magic 8 Ball");
        shakeTheBall();
    }

    public static int getRandomNumber(){
        Random ranNum = new Random();
        int num = ranNum.nextInt(9);
        return num;
    }

    public static void shakeTheBall(){
        System.out.println("Think about your question.. \nShaking..");
        int answer = getRandomNumber();
        String response = "";
        switch (answer){
            case 0:
                response = "Without a doubt";
                break;
            case 1:
                response = "Yes, definitely";
                break;
            case 2:
                response = "Most likely";
                break;
            case 3:
                response = "Ask again later";
                break;
            case 4:
                response = "Concentrate and ask again";
                break;
            case 5:
                response = "You don't wanna know";
                break;
            case 6:
                response = "My sources say.. No";
                break;
            case 7:
                response = "Don't count on it";
                break;
            case 8:
                response = "Very doubtful";
                break;
        }
        System.out.println(response);
        shakeAgain();
    }

    public static void shakeAgain(){
        System.out.println("Would you like to try again? \nIf so, enter 'y' \nIf not, enter anything to exit");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String lowerCase = input.toLowerCase();
        if (lowerCase.equals("y")){
            shakeTheBall();
        } else {
            System.out.println("Thanks for shaking.. Magic 8 Ball");
            return;
        }
    }

}