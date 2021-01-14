package sk.kosickaacademic.simon.personalid;

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
}
