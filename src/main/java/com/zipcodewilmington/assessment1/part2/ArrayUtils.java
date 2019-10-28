package com.zipcodewilmington.assessment1.part2;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int res = 0;
        for (int i=0; i < objectArray.length; i++)
            if (objectToCount == objectArray[i])
                res++;
        return res;

    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> arr = new ArrayList();

        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] != objectToRemove) {
                arr.add(objectArray[i]);
            } else {
                continue;
            }
        }
        return arr.toArray(new Integer[arr.size()]);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Integer[] arr = Arrays.copyOf(objectArray, objectArray.length, Integer[].class);
        int count = 1, tempCount;
        Integer popular = arr[0];
        int temp = 0;
        for (int i = 0; i < (arr.length - 1); i++)
        {
            temp = arr[i];
            tempCount = 0;
            for (int j = 1; j < arr.length; j++)
            {
                if (temp == arr[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }



    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Integer[] arr = Arrays.copyOf(objectArray, objectArray.length, Integer[].class);
        Arrays.sort(arr);
        int min_count = arr.length + 1, res = -1;
        int curr_count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else {
                if (curr_count < min_count) {
                    min_count = curr_count;
                    res = arr[i - 1];
                }

                curr_count = 1;
            }
        }
        if (curr_count < min_count)
        {
            min_count = curr_count;
            res = arr[arr.length - 1];
        }

        return res;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int aLen = objectArray.length;
        int bLen = objectArrayToAdd.length;

        @SuppressWarnings("unchecked")
        Object[] c = (Object[]) Array.newInstance(objectArray.getClass().getComponentType(), aLen + bLen);
        System.arraycopy(objectArray, 0, c, 0, aLen);
        System.arraycopy(objectArrayToAdd, 0, c, aLen, bLen);

        return c;
    }
}
