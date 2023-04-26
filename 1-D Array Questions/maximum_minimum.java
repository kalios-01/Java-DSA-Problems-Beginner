// find maximum and minimum in given array ; 
public class maximum_minimum {
    int num [] = {1,8,6,3,7,2,8};
    int max =0;
    int mini =0;

    for(int i=0;i<num.length;i++){
        if (num[i]<max) {
            max =i;
        }
    }

    System.out.println(max);
}
