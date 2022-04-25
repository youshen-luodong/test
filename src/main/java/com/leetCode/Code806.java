package com.leetCode;

public class Code806 {
    public int[] numberOfLines(int[] widths, String s) {
        int width = 0;
        int h = 0;
        for (int i =  0; i < s.length(); i++) {
            int k = widths[s.charAt(i) - 'a'];
            width +=k;
            if (width > 100) {
                width = k;
                h++;
            }
        }
        return new int[]{h, width};

    }
}
