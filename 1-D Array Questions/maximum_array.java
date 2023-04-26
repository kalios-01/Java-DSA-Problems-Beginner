// Print Maximum and Minimum element of array.
public class maximum_array {
    public static void main(String[] args) {
        int max =0;
        int mini =0;
        int num [] = {6,78,6,3,7,2,8};

        for (int i =0;i<num.length;i++){
            if (num[i]>max) {
                max=num[i];
            }
            else if(num[i]<mini){
                mini=num[i];
            }
        }
        System.out.println("The maximum element in array is :"+max);
        System.out.println("The minimum element in array is: "+mini);

    }
}
