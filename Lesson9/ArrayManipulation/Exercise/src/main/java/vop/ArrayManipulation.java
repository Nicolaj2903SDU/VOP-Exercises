package vop;

import java.util.Arrays;
import java.util.Random;

/**
 * OOP test eksamen f09 opg 1
 * @author erso
 */
public class ArrayManipulation {

//    public int[] evenOdd(int[] array) {
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left < right) {
//            while (array[left] % 2 == 0 && left < right) {
//                left++;
//            }
//
//            while (array[right] % 2 != 0 && left < right) {
//                right--;
//            }
//
//            if (left < right) {
//                int placeholder = array[right]; // Save the right numbers.
//                array[right] = array[left];     // If the left numbers are lower than the right, save the left at the right side.
//                array[left] = placeholder;
//                left++;
//                right--;
//            }
//        }
//        return array;
//    }
//}


    public int[] evenOdd(int[] array, int left, int right) {

        int placeholder;

        if (left > right) {
            return array;

        }
        else if (array[left] % 2 != 0 && array[right] % 2 == 0) { // If the left number is odd and the right is even.

            placeholder = array[left];
            array[left] = array[right];
            array[right] = placeholder;

//            placeholder = array[right];
//            array[right] = array[left];
//            array[left] = placeholder;

            return evenOdd(array, left += 1, right -= 1);

        } else {

            if (array[right] % 2 != 0) { // If the right number is odd.
                return evenOdd(array, left, right -= 1);
            }

            if (array[left] % 2 == 0) { // If the left number is even.
                return evenOdd(array, left += 1, right);
            }
        }
        Arrays.sort(array);
        return array;
    }



    public int [] evenOdd (int [] array) {
        int random1 = 0;
        int random2 = array.length - 1;

        return evenOdd(array, random1, random2);
    }


    private void sort(int [] array, int splitIndex){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

//        if (array[0] < splitIndex == true) {
//
//            for (int i = 0; i < splitIndex; i++) {
//                if (array[i] > array[i++]) {
//                    int placeHolder = array[i++];
//                    array[i] = array[i++];
//                    array[i++] = placeHolder;
//                }
//                else if (array[i] < array[i++]) {
//                    array[i] = array[i];
//                }
//            }
//        }

    }

    public static void main(String [] arg){
        Random generator = new Random(222);
        int[] array = new int [10];
        for(int i = 0; i < array.length; i++){
            array[i] = generator.nextInt(100);
        }
        System.out.println("Input:  "+Arrays.toString(array));

        ArrayManipulation arrMani = new ArrayManipulation();
    
        int[] result = arrMani.evenOdd(array);
        System.out.println("Output: " +Arrays.toString(result));

    }
}

    
