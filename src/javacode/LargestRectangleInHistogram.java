package javacode;

import java.util.Stack;

public class LargestRectangleInHistogram {
	// O(n*n) Time Limit Exceeded
	public int largestRectangleAreaTLE(int[] height) {
        if(height == null || height.length == 0)
            return 0;
        int[][] m = new int[height.length][height.length];
        for(int i = 0; i < height.length; i ++){
            m[i][i] = height[i];
        }
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < height.length; i ++){
            for(int j = i + 1; j < height.length; j ++){
                m[i][j] = Math.min(m[i][j - 1], height[j]);
                maxArea = Math.max(maxArea, m[i][j] * (j - i + 1));
            }
        }
        return maxArea;
    }
	
	// O(n*n) Time Limit Exceeded; without helper matrix
	public int largestRectangleAreaTLE2(int[] height) {
        if(height == null || height.length == 0)
            return 0;

        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < height.length; i ++){
        	int minH = height[i];
            for(int j = i + 1; j < height.length; j ++){
            	minH = Math.min(minH, height[j]);
                maxArea = Math.max(maxArea, minH * (j - i + 1));
            }
        }
        return maxArea;
    }
	
	public int largestRectangleArea(int[] height) {
        if(height == null || height.length == 0)
            return 0;
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);
        int maxArea = Integer.MIN_VALUE;
        for(int i = 1; i < height.length; i ++){
            if(s.empty() || height[i] > height[s.peek()]) 
                s.push(i);
            else{
                int h = height[s.pop()];
                int width = s.empty()? i : i - s.peek() - 1;
                maxArea = Math.max(maxArea, h * width);
                i --;
            }
        }
        // increment array
        while(!s.empty()){
        	int h = height[s.pop()];
        	int width = s.empty()? height.length : height.length - s.peek() - 1;
        	maxArea = Math.max(maxArea, h * width);
        }
        return maxArea;
    }
}
