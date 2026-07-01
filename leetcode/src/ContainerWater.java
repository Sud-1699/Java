public class ContainerWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(water(height));
    }

    static int water(int[] height) {
        int l = 0, h = height.length - 1;

        while(l < h) {
            if(height[l] < height[h]) {
                l++;
            }

            if(height[l] > height[h]) {
                return height[h] * height[h];
            } else {
                return height[l] * height[l];
            }
        }

        return 0;
    }
}
