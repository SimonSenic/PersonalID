package sk.kosickaacademic.simon.personalid;

import java.util.Arrays;

public class Task {
    public int Sum(int a, int b) {

        return a+b;
    }

    public boolean isPrimeNumber(int n){
        if(n<2) return false;
        for(int i=2; i<Math.sqrt(n); i++)
            if(n%i==0) return false;

        return true;
    }

    public boolean isRectangularTriangle(int a, int b, int c){
        if(a<=0 || b<=0 || c<=0) return false;
        if(Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)) return true;
        else return false;
    }

    public String reverseText(String text){
        String result="";
        for(int i=text.length()-1; i>=0; i--)
            result+=text.charAt(i);

        return result;
    }

    public boolean areEvenNumbers(int[] array){
        int count=0;
        for(int i=0; i<array.length; i++)
            if(array[i]%2==0) count++;

        if(count==array.length) return true;
        else return false;
    }

    public boolean isPalindromeNumber(int number){
        int x=number, y=0;
        while(x>0){
            y=y+(x%10);
            y=y*10;
            x=x/10;
        }
        y=y/10;

        if(number==y) return true;
        else return false;
    }

    public int countSpaces(String text){
        int count=0;
        for(int i=0; i<text.length(); i++)
            if(text.charAt(i)==' ') count++;

        return count;
    }

    public double termDeposit(int value, double interest, int period, boolean tax){
        if(value<=0 || interest<0 || period<0) return 0;
        if(interest==0 || period==0) return value;
        for(int i=0; i<period; i++){
            double profit = (interest/100.0)*value;
            if(tax) profit*=0.8;
            value+=profit;
        }

        return value;
    }

    public double priceForTransport(int distance, double consumption, double fuel){
        if(distance<=0 || consumption<=0) return 0;
        if(fuel==0) return 0;
        double result;
        result = distance/fuel*consumption;
        result=Math.round(result*100.00)/100.00;

        return result;
    }

    public int max(int[] array){
        if(array==null || array.length==1) return 0;
        int max=array[0], secondmax=0, count=1;
        for(int i=1; i<array.length; i++) if(array[0]==array[i]) count++; if(count==array.length) return 0;
        for(int i=1; i<array.length; i++) if(array[i]>max){ secondmax=max; max=array[i]; }

        return secondmax;
    }
}
