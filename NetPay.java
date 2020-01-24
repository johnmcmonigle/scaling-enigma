/*
 * NetPay.java
 * Author: John McMonigle
 * Submission Date:  01/22/2020
 *
 * Purpose: After inputting your number of hours per week, this program will tell you your gross and net income,
   as well as the deductions that came from it.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		
		// This section opens the keyboard and defines all variables
		Scanner keyboard = new Scanner(System.in);
		double hoursPerWeek, payRate, grossPay, netPay;
		double deductions, deductionsFederal, deductionsState, deductionsSocialSecurity, deductionsMedicare;
		
		// User inputs hours per week
		System.out.print("Hours Per Week:\t\t");
		hoursPerWeek = keyboard.nextDouble();
		
		// Initializes payRate and grossPay
		payRate = 7.25;
		grossPay = (hoursPerWeek * payRate);
		
		// Defines all deductions for net pay
		deductionsFederal = (grossPay * .10);
		deductionsState = (grossPay * .045);
		deductionsSocialSecurity = (grossPay * .062);
		deductionsMedicare = (grossPay * 0.0145);
		deductions = (deductionsFederal + deductionsState + deductionsSocialSecurity + deductionsMedicare);
		
		// Defines net pay
		netPay = (grossPay - deductions);
		
		// Prints full output to user using all doubles defined above
		System.out.println("Gross Pay:\t\t" + grossPay);
		System.out.println("Net Pay:\t\t" + netPay);
		System.out.println();
		System.out.println("Deductions");
		System.out.println("Federal:\t\t" + deductionsFederal);
		System.out.println("State:\t\t\t" + deductionsState);
		System.out.println("Social Security:\t" + deductionsSocialSecurity);
		System.out.println("Medicare:\t\t" + deductionsMedicare);
		
		keyboard.close();
	}
	
}