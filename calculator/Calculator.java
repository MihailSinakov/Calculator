package calculator;

import java.util.Scanner;

public class Calculator {
	 
    public static void main(String[] args) {
    	Integer num1 = -1;
    	Integer num2 = -1;
    	Integer rom1 = -1;
    	Integer rom2 = -1;
        Integer i; 
    	String[] rom_num = {"I","II","III","IV","V","VI","VII",
    			"VIII","IX","X","XI","XII","XIII","XIV","VX","XVI","XVII","XVIII","XIX","XX"};
    	
    	System.out.println("Input");
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();

        String[] parts = s.split(" ");

        for (i=0;i<10;i++) {
            if (rom_num[i].equals(parts[0]))  { 
            	rom1 = i + 1;
            } 
    }
        if (rom1 == -1) {
        num1 = Integer.parseInt(parts[0]);
        }

        for (i=0;i<10;i++) {
            if (rom_num[i].equals(parts[2]))  { 
            	rom2 = i + 1;
            } 
    }
        if (rom2 == -1) {
        num2 = Integer.parseInt(parts[2]);
        }

        String oper = parts[1];
        System.out.println("Output");

        if (((num1 >= 0)&&(num1 < 11))&&((num2 >= 0)&&(num2 < 11))) {
            switch (oper) {
            case "+": System.out.println(num1 + num2); break;
            case "-": System.out.println(num1 - num2); break;
            case "*": System.out.println(num1 * num2); break;
            case "/": System.out.println(num1 / num2); break;
            default: System.out.println("Input error");
            }
        	
        }   else if (((rom1 >= 0)&&(rom1 < 11))&&((rom2 >= 0)&&(rom2 < 11))) {
            switch (oper) {
            case "+": System.out.println(rom_num[rom1 + rom2 - 1]); break;
            case "-": System.out.println(rom_num[rom1 - rom2 - 1]); break;
            case "*": System.out.println(rom_num[rom1 * rom2 - 1]); break;
            case "/": System.out.println(rom_num[rom1 / rom2 - 1]); break;
            default: System.out.println("Input error");
            }
        	
        }   else {
            System.out.println("Input error");
        }
        }
}