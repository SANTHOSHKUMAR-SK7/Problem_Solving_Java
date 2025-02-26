import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
//
////        Method 1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        char[] c=input.nextLine().toCharArray();
        System.out.print("The reversed String is : ");
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }
//
//        //Method 2
//
//          Scanner input = new Scanner(System.in);
//          String a = "Santho";
////        String b = " ";
////        for (int i = a.length()-1; i >= 0; i--){
////            b += a.charAt(i);
////        }
////        System.out.println(b);
//
//
//
////        Method-3
////        char[] arr = a.toCharArray();
////        int right=a.length()-1;
////        int left=0;
////
////        while(left<right){
////            char temp=arr[left];
////            arr[left]=arr[right];
////            arr[right]=temp;
////
////            left++;
////            right--;
////        }
////
////        String array = Arrays.toString(arr);
////        System.out.println(array);
//
//
////        method 4
////                String reverse = new StringBuffer(a).reverse().toString();
////                System.out.println(reverse);
//            }
//        }
//
//
    }
}
