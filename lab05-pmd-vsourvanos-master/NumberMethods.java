public class NumberMethods{

    public static int minimumInt(int num1,int num2){
      if (num1<=num2){
        return num1;
      }  else{
        return num2;
      }


    }
    public static int maximumInt(int num1,int num2){
        if (num1=>num2){
            return num1;
        } else{
            return num2;
        }

    }

    public static double minimumDouble(double num1,double num2){
        if (num1<=num2){
            return num1;
        } else{
            return num2;
        }

    }

    public static double maximumDouble(double num1,double num2){
        if(num1=>num2){
            return num1;
        } else{
            return num2;
        }

    }

    public static int median(int num1,int num2,int num3){   
        if ((( num1 > num 2) && (num 1< num3))
        || (( num1 < num 2) && (num 1> num3)))
        return num1;
        } else if 
        if ((( num2 > num 1) && (num 2< num3))
            || (( num2 < num 1) && (num 2> num3)))
        return num2;
    }else return num3;
    public static double average (int num1,int num2, int num3,int num4 ,int num5){
        int sum = num1+num2+num3+num4+num5;
        duble result = sum/5d;
        return result;
    }
    public static boolean isEven(int number){
        if (number %2 == 0)
            return true;
        else
            return false;

    }

    public static int sumAllNumbersUpTo(int number){
        

        int sum = 0;
        for(int i = 1; i <=number;i++){
            sum+=i;
        }
        return sum;
    }
    public static int sumEvenNumbersUpTo(int lastNumber){
        int sum = 0;
        for(int i = 1; i <=lastNumber; i++){
            if (isEven(i)) sum +=i;
        }
            return sum;
    }   

    public static double percentage(int num1,int num2){  
      
        return (num2/(double)num1)*100;


    }

    public static double solveEquation(double a,double b){

        return(-1*b)/(double)a;
    }

    public static float squarePerimeter(int sideLength){

    }

    public static double triangleArea(double height,double base){

    }

    public static int sumOfDigits(int number){

    }

    public static int reverseSum(int number){
        
    }
public static void main(String[] args) {
   
}

   