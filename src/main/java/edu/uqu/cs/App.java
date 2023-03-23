package edu.uqu.cs;
import java.util.Scanner;



/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/


public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 20, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
public static void twisters (){
for (int num=1;num<=20;num++){
    if(num%2==0){
    System.out.print("Tweetle");
    if(num%4==0)
    System.out.print("Beetle");
    if(num%6==0)
    System.out.print("Poodle");
    }
else 
    System.out.print(num);
System.out.print(" "); 
}
 }
 
   
         
    



/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
  
    public static void phoneKeypad (String str) {
   String outp="";
    for (int x=0;x<str.length();x++){
        char l=str.toUpperCase().charAt(x);
        switch (l){
            case 'A':
            case 'B':
            case 'C':
                outp+='2';
                break;
            case 'D':
            case 'E':
            case 'F':
                outp+='3';
                break;
            case 'G':
            case 'H':
            case 'I':
                outp+='4';
                break;
            case 'J':
            case 'K':
            case 'L':
                outp+='5';
                break;
            case 'M':
            case 'N':
            case 'O':
                outp+='6';
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                outp+='7';
                break;
            case 'T':
            case 'U':
            case 'V':
                outp+='8';
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                outp+='9';
                break;
    } 
 }
  System.out.print(outp);       
 }

 public static void main(String[] args){
        try (/* Write your code here */
        Scanner kb = new Scanner (System.in)) {
            //call method twisters()
                twisters();
                System.out.println();
               //prompt user to enter a string 
               System.out.println("please enter a string");
               String st=kb.nextLine();
               //call method phoneKeypad(string)
               phoneKeypad (st);
        }

    }
}
