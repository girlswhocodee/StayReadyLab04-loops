package com.codedifferently.stayready.lab04;

import java.util.Random;

public class Numbers {

    public String oneToTen(){
    	String output ="oneToTen()\n"
    				   +"*** Output ***";
    	for(int x=1; x<=10; x++){
    		output += "\n"+x;
    	}
        return output;
    }

    public String oddNumbers(){
    	String output = "oddNumbers()\n"
    					+"*** Output ***";
    	for(int x =1; x < 20 ; x+=2){
    		output += "\n"+x;
    	}
    		
        return output;
    }

    public String squares(){
        String  output = "powers()\n" + "***Output***";
        for (int number=1; number <= 12; number++)
        {
            output = number * number;
        }
        return output;
        /*
        int i = 2;
        int square = Math.pow(i, 2);
        return squares;
        */
    }

    public String random4(){
            Random random = new Random();
            for(int i =1; i <=10; i++){
            int value = 10 + random.nextInt(4);
        }
        return value;
    }

    public String even(int n){
        String output = "even()\n" + "***Output***";
        int limit = 20;
        for(int i=1; i <= n; i++){
            if(i % 2 == 0){
                result += "\n" + i;
            }
        }
        return result;
    }

    public String powers(int n){
        String output = "powers()\n" + "*** Output ***";
        for (int i = 1; i <= n; i++) {
            output += "\n" + (int)Math.pow(2, i);
        }
        return output;
    }
    }

}
