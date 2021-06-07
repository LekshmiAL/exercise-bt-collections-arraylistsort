package com.stackroute.collections;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    //write logic to sort given list in descending order
    public ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> list) {
    	//sort the given arraylist in the descending order
    	Collections.sort(list,Collections.reverseOrder());
        return list;
    }
}
