package leetcode_in_java;
import apple.laf.JRSUIUtils;

import javax.swing.*;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by bopang on 15/7/28.
 */

public class Solution {

    public int robotSim(int[] commands, int[][] obstacles) {
        return 0;
    }


    public static void main( String args[] ) {
        System.out.println("Hello Leetcode");
        Solution solution = new Solution();
        
        int len = 4;
        ListNode dummy = new ListNode(-1), cur = dummy;
        for (int ind = 0; ind < len; ind ++) {
            ListNode node = new ListNode(ind);
            cur.next = node;
            cur = cur.next;
        }

        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println(duration);
    }
}


