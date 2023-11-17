import java.util.Scanner;

//import javax.crypto.spec.GCMParameterSpec;

public class array_swap {

    static int[] rotate (int[] arr, int k){
    int n = arr.length;
    k = k % n;
    int[] ans = new  int[n];
    int j =0;

    for (int i = n-k; i< n; i++){
        ans[j++] = arr[i];

    }

for (int i= 0; i < n-k; i++){
    ans [j++]= arr[i];

}
return ans;

    }
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter araay size");
      int n = sc.nextInt();
      int [] arr = new int[n];

      System.out.println("Enter " + n + " elements ");
      for(int i= 0; i< n; i++){
      arr[i] = sc.nextInt();
      }

       System.out.println("Enter k: ");
       int k = sc.nextInt();

       System.out.println("Original array ");
       printArray(arr);
       int[] ans = rotate(arr, k );
       System.out.println("Array after rotation");
       printArray(arr);



        // int [] x = {12, 20, 015};
        // for (int i = 0 ; i < x.length; i++){
        //     System.out.println(x[i] + " ");
        // }
    }
}
