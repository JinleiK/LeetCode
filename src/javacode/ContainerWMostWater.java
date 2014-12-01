package javacode;

public class ContainerWMostWater {
	// TLE!
	public int maxAreaDP(int[] height) {
        if(height.length < 2)   return 0;
        int[] water = new int[height.length];
        water[0] = 0;
        for(int i = 1; i < height.length; i ++){
            int max = water[i - 1];
            for(int j = 0; j < i; j ++){
                int area = Math.min(height[j], height[i]) * (i - j);
                if(area > max)
                    max = area;
            }
            water[i] = max;
        }
        return water[height.length - 1];
    }
	// two pointers
	public int maxArea(int[] height) {
        if(height == null || height.length < 2)
            return 0;
        int area = Integer.MIN_VALUE;
        int l = 0;
        int r = height.length - 1;
        while(l < r){
            area = Math.max(area, Math.min(height[l], height[r]) * (r - l));
            if(height[l] < height[r])
                l ++;
            else r --;
        }
        return area;
    }
}
