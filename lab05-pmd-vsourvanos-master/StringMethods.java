public class StringMethods{

    public static boolean appearsIn(String string,char character){

        for (int i = 0; i<string.length(); i++){
            if (character == string.charAt(i)) return true;
        }
        return false;
    }

    public static int countOccurences(String string,char character){
        for (int i = 0; i< string.length(); i++)
            if(character == string.toLowerCase().charAt(i)) counter++;
        return counter;
    }

    public static void displayManyTimes(String string,int numOfTimes){
        for (int i = 0; i< numOfTimes; i++){
            System.out.println(string);
        } else return '0';
    }

    public static char middleChar(String string){
        if(string.length()% 2 == 1){
           return string.charAt(string.length()/2);
        }
    }
    public static int countVowels(String string){
        int counter = 0;
        for (int i = 0; i < string.length(); i++)
            String lowerCaseString.charAt(i);
            char ch = string.charAt(i):
        if(ch == 'i')||(ch == 'o')||(ch == 'y')||(ch == 'a')||(ch == 'u')||(ch == 'e')
            counter++;
        }
        return counter;
    public static void main(String[] args){
        char character = 'a';
        int integer = 2;
        String string = "Vasilis";
        //System.out.println("Character "+character+" is found in string "+string+" :"+appearsIn(string, character));
        //System.out.println("There are "+countOccurences(string, character)+" occurences of char "+character+"in String "+String);
        //displayManyTimes(string);
        System.out.println("Vowel occurences in string "+string+" : "+countVowels(string));
    }

    
}