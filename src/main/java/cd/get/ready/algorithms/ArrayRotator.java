package cd.get.ready.algorithms;
import java.util.*;
public class ArrayRotator {

    public int[] rotateLeft(int[] arr, int shift)
    {
        int size = arr.length;
        int[] temp = new int[size];

        int i = 0;
        int rotate_i = shift;
        while(rotate_i < size)
        {
            temp[i] = arr[i];
            i++;
            rotate_i++;
        }

        rotate_i = 0;
        while (rotate_i < shift)
        {
            temp[i] = arr[i];
            i++;
            rotate_i++;
        }
        return temp;
    }


}
