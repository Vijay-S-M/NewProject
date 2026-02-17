import java.util.*;
public class ArrayEx1{
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println("Pos "+(i+1)+" : "+arr[i]);
        }

        sc.close();
    }
}