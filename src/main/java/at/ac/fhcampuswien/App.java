package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
Scanner scanner = new Scanner(System.in);
    //todo Task 1
    public void largestNumber(){
        // input your solution here
        double num;
        double bigNum = 0;
        int counter=1;
        DecimalFormat f = new DecimalFormat("#0.00");
        do
        {
            System.out.print("Number "+ counter + ": ");
            num = scanner.nextDouble();
            if(num <=0 && counter==1 )
            {
                System.out.println("No number entered.");
            }
            if(num >= bigNum){
                bigNum = num;
            }

            counter++;
        } while(num >0);
        if(bigNum>0)
        {
            System.out.println("The largest number is " + f.format(bigNum));
        }
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        int num;
        int counter =1;
        System.out.print("n: ");
        num = scanner.nextInt();
        if(num <=0){
            System.out.println("Invalid number!");
        }
        for (int stufe = 1;stufe<=num;stufe++)
        {
            for(int zahl = 1;zahl<=num;zahl++)
            {
                if(stufe>=zahl) {

                    System.out.print(counter++ + " ");
                }
            }
            System.out.println();

        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        final int max = 6;
        for(int i=1;i<=max;i++)
        {
            for(int j=1;j<=max-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        int h;
        char c;
        System.out.print("h: ");
        h= scanner.nextInt();
        System.out.print("c: ");
        c= scanner.next().charAt(0);
        if(h%2==0)
        {
            System.out.println("Invalid number!");
            return;
        }
        for(int i=0; i<=h/2;i++) //obere for-schleife(breiter werden)
        {
            for(int j= 0; j<((h+1) / 2 - i - 1);j++)
            {
                System.out.print(" ");
            }
            for(int k = i; k>=0;k--)
            {
                System.out.print((char) (c-k));
            }
            for(int l =1;l<=i;l++)
            {
                System.out.print((char) (c-l));
            }
            System.out.println();
        }
         for(int i =h/2-1; i >=0;i--) //untere for schleife(schmaller werden)
        {
            for(int j= 0; j<((h+1) / 2 - i - 1);j++)
            {
                System.out.print(" ");
            }
            for(int k = i; k>=0;k--)
            {
                System.out.print((char) (c-k));
            }
            for(int l =1;l<=i;l++)
            {
                System.out.print((char) (c-l));
            }
            System.out.println();
        }
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        int mark;
        int counter = 1;
        int marksCounter=0;
        int negMarks=0;
        double sum=0;
        double average;
        DecimalFormat f = new DecimalFormat("#0.00");
        do
        {
            System.out.print("Mark "+counter+": ");
            mark=scanner.nextInt();
            if(mark>5)
            {
                System.out.println("Invalid mark!");
                counter--;
                marksCounter--;
                sum=sum-mark;
            }
            if(mark == 5){
                negMarks++;
            }
            if(mark<=0){
                marksCounter--;
                counter--;
            }
            sum = sum + mark;
            counter++;
            marksCounter++;
        }while(mark!=0);
        if (sum==0){
            System.out.println("Average: 0.00");
        }
        else {
            average = sum / marksCounter;
            System.out.println("Average: " + f.format(average));
        }
        System.out.println("Negative marks: "+negMarks);
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        int num;
        int newNum;
        int sum = 0;
        System.out.print("n: ");
        num = scanner.nextInt();
        while (num>9)
        {
            while (num>0)
            {
                newNum= num %10;
                sum = sum+(newNum*newNum);
                num = num /10;
            }
            num = sum;
            sum=0;
        }
        if(num==1){
            System.out.println("Happy number!");
        }
        else {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}