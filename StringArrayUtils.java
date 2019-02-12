import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length -1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2 ];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean retVal = false;
        for(int i = 0; i < array.length; i++){
            if( array[i] == value ){
                return true;
            }
        }
        return retVal ;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO

    public static String[] reverse(String[] array) {
        //String[] reversed= new String[array.length];
        //setting the string to a temporary position
        String temp ="";
        //loop through the arrary and cut it in half increment by 1
        for(int i = 0 ; i < array.length / 2; i++){
            // set temporary string to the index of the array
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        // for(int i =string.array.length -1; i >=0; i++)
        //temp+=stringarray[i]
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for(int i = 0; i < array.length / 2; i++){

            if(!array[i].equals(array[array.length -1 -i])){
                return false;
            }

        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String temp = "";
        for(int i = 0; i < array.length; i++){
            temp += array[i];

        } 
        final String str ="abcdefghijklmnopqrstuvwxyz";
        temp = temp.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(!temp.contains(str.charAt(i)+"" )){
                return false;
            }

        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(value.equals(array[i])){
                count++; 
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        // this says array list of string
        ArrayList <String> list = new ArrayList <String>(); 

        for(int i = 0; i < array.length; i++){
            if(!array[i].equals(valueToRemove)) {
                list.add(array[i]);
            }
        }
        String[] array2 = new String[list.size()];
        array2 = list.toArray(array2); 
        return array2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String compR ="";
        ArrayList < String > list = new ArrayList <String>();
        for(int i = 0; i < array.length; i++){
            if(!array[i].equals(compR) ){
                list.add(array[i]);
                compR = array[i];

            }

        }
        //String[] array2 = new String[list.size()];
        //array2 = list.toArray(array2); 
        //return array2;
        String[] array2  = new String[list.size()]; 
        array2 = list.toArray(array2);

        return array2;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int size = 1;
        
        for(int currentIndex = 0; currentIndex < array.length - 1;currentIndex++){
            if(array[currentIndex] != array[currentIndex + 1 ]) size++; {
                
            }
        
        }
         String [] answer =new String[size];
         String temp = array[0];
         int placeHolder= 0;
         for(int currentIndex=1; currentIndex < array.length; currentIndex++){
             if (array[currentIndex] == array[currentIndex -1]){
                 temp = temp + array[currentIndex];
                }
                    else {
                        answer[placeHolder++] = temp;
                        temp = array[currentIndex];
                    }
            }
            answer[answer.length-1] = temp;
            return answer;
    }

}
