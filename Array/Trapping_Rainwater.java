package Array;

public class Trapping_Rainwater {
    public static int trappedRainWater(int height[]) {
        //Calcualte left max boundary - array
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //Calculate Right Max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;     // to print waterLevel
        for (int i=0; i<n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater +=  waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main (String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total amount of water = " + trappedRainWater(height));
    }
}
 