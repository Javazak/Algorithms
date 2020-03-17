package com.company;

public class ForExtending {


    void selectSorting (int array []){

        int size = array.length;
        for (int step = 0; step <size-1 ; step++) {

            int min_index = step;

            for (int i = step+1; i <size ; i++) {

                if (array[i]<array[min_index]){

                    min_index = i;
                }
            }
            int temp = array[step];
            array[step] = array[min_index];
            array[min_index] = temp;


        }
        for (int i = 0; i <size ; i++) {
            System.out.println(array[i]);
        }
    }

    }


