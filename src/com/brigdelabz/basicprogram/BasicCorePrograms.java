package com.brigdelabz.basicprogram;

  import java.util.Scanner;

   public class BasicCorePrograms {
    public static void coinFlip() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of times to flip coin");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            if (Math.random() < 0.5) {
                System.out.println("Tails");
            } else {
                System.out.println("Heads");
            }
        }
    }
    public static void leapYear() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year in four digit");
        int year = scan.nextInt();
        if (year >= 1000) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                System.out.println("Year is Leap year");
            }
            else{
                System.out.println("year is not leap year");
            }
        }
    }
    public static void printTable(int n){
        int i;
        for( i=1;i<=n;i++) {
            if (i <= n && n < 31) {
                System.out.println("2 ^"+n+" = "+2*i);
            }
        }
    }
    public static void harmonicNumber(){
        float sum=0;
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        if(num!=0){
            for(int i=1;i<=num;i++){
              sum+=1/i;
            }
        }
        System.out.println("nth harmonic value is:="+sum);
    }
       public static void primeFactors()
       {
          int n=90;
           while (n%2==0)
           {
               System.out.print(2 + " ");
               n /= 2;
           }
           for (int i = 3; i <= Math.sqrt(n); i+= 2) {
               while (n % i == 0) {
                   System.out.print(i + " ");
                   n /= i;
               }
           }
           if (n > 2)
               System.out.print(n);
       }
       public static void calculateQuotientRemainder(){
       System.out.println("Enter the value of num1 and num2");
       Scanner sc = new Scanner(System.in);
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       int quotient = 0, remainder = 0;
       quotient = num1 / num2;
       remainder = num1 % num2;
       System.out.println("Quotient when " + num1 + "/" + num2 + " is: " + quotient);
       System.out.println("Remainder when " + num1 + " is divided by " + num2 + " is: " + remainder);
   }
   public static void swapingTwoNumber(){
       int first = 10, second = 20;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
       first = first+second;
       second=first-second;
       first=first-second;
       System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
   }


       public static void main(String[] args) {
        System.out.println("core java programs");
        coinFlip();
        leapYear();
        int num=Integer.parseInt(args[0]);
        printTable(num);
        primeFactors();
        calculateQuotientRemainder();
        swapingTwoNumber();
    }
}
