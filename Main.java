package com.company;
import java.util.*;
public class Main {
    public static Scanner redaer = new Scanner(System.in);

    public static void main(String[] args) {
        int randomNum = 1+(int)(Math.random() * 3);
        System.out.println("chose paper/rock/scissors");
        String user=redaer.next();
        String str;
if (randomNum==1){
str="rock";
if (user.equals("paper")){
    System.out.println("you chose "+user);
    System.out.println("i'm chose "+str);
    System.out.println("you win");
}
if (user.equals("rock")){
        System.out.println("you chose "+user);
        System.out.println("i'm chose "+str);
        System.out.println("draw");
}
if (user.equals("scissors")){
        System.out.println("you chose "+user);
        System.out.println("i'm chose "+str);
        System.out.println("you lose");
}
}
if (randomNum==2){
    str="paper";
    if (user.equals("paper")){
        System.out.println("you chose "+user);
        System.out.println("i'm chose "+str);
        System.out.println("draw");
    }
    if (user.equals("rock")){
        System.out.println("you chose "+user);
        System.out.println("i'm chose "+str);
        System.out.println("you lose");
    }
    if (user.equals("scissors")){
        System.out.println("you chose "+user);
        System.out.println("i'm chose "+str);
        System.out.println("you win");
    }
}
if (randomNum==3){
    str="scissors";
    if (user.equals("paper")){
        System.out.println("you chose "+user);
        System.out.println("i'm chose "+str);
        System.out.println("you win");
    }
    if (user.equals("rock")){
        System.out.println("you chose "+user);
        System.out.println("i'm chose "+str);
        System.out.println("you lose");
    }
    if (user.equals("scissors")){
        System.out.println("you chose "+user);
        System.out.println("i'm chose "+str);
        System.out.println("draw");
    }
}
    }
}
