import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Q1
        System.out.println("enter your role:");
        String role = s.nextLine();
        if(role.equals("admin")){
            System.out.println("welcome admin");
        }else if(role.equals("superuser")){
            System.out.println("welcome superuser");
        }else if(role.equals("user")){
            System.out.println("welcome user");
        }else System.out.println("please chose user or superuser or admin");

        //Q2
        System.out.println("please enter first number:");
        int firstNum = s.nextInt();
        System.out.println("please enter second number");
        int secondNum = s.nextInt();
        System.out.println("please enter third number");
        int thirdNum = s.nextInt();
        if(firstNum > secondNum && firstNum >thirdNum){
            System.out.println("the greatest:"+firstNum);
        }else if(secondNum > firstNum && secondNum >thirdNum){
            System.out.println("the greatest:"+secondNum);
        }else System.out.println("the greatest:"+thirdNum);


        //Q3
        Random r = new Random();
        int value = r.nextInt(1+7)+1;
        switch(value){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            default:
                System.out.println("saturday");
        }

        //Q4

        System.out.println("enter your numeric score:");
        int score = s.nextInt();
        if(score >= 90 && score <=100 ){
            System.out.println("letter grade:A");
        }else if (score >= 80){
            System.out.println("letter grade:B");
        }else if (score >= 70 ){
            System.out.println("letter grade:C");
        }else if (score >= 60 ){
            System.out.println("letter grade:D");
        }else if(score >=0){
            System.out.println("letter grade:F");
        }else System.out.println("invalid number");


        //Q5
        System.out.println("enter your age:");
        int age = s.nextInt();
        if(age < 13 && age >= 1 ){
            System.out.println("child");
        }else if(age <= 19 && age >= 13){
            System.out.println("teenager");
        }else if(age >= 20){
            System.out.println("adult");
        }else System.out.println("invalid number");


    }
}