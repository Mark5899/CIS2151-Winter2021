package chapter1.pkg7examples;

import java.util.ArrayList;

public class Chapter17Examples {

    public static void main(String[] args) {
        int numbers[] = new int[10];
        
        for ( int index = 0; index < 10; index++ )
        {
            numbers[index] = index + 1;
        }
        
        for( int number : numbers )
        {
            System.out.println(number);
        }
        
        ArrayList<Integer> fancyNumbers = new ArrayList<Integer>();
        
        for ( int value = 1; value <= 100; value++)
        {
            fancyNumbers.add(value);
        }
        
        for( int number : fancyNumbers )
        {
            System.out.println(number);
        }
        
        ArrayList<ArrayList<Integer>> twoDArray = new ArrayList<ArrayList<Integer>>();
        
        
        for ( int rowIndex = 0; rowIndex < 10; rowIndex++ )
        {
            twoDArray.add(new ArrayList<Integer>());
            for ( int value = 0; value < 10; value++ )
            {
                twoDArray.get(rowIndex).add(value + 10*rowIndex);
            }
        }
        
        for ( ArrayList<Integer> row : twoDArray )
        {
            for ( int value : row )
            {
                System.out.printf("%2d ", value);
            }
            System.out.println("");
        }
    }
    
}
