import java.util.Scanner;
import java.util.ArrayList;

public class Reverse_String {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "but"));
    }
//
//        Method 1
       /* Scanner input = new Scanner(System.in);
        StringBuilder sk =new StringBuilder();
        System.out.print("Enter the String : ");
        char[] c=input.nextLine().toCharArray();
        System.out.print("The reversed String is : ");
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }
        String s= "sk";
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(2);
        arr.set(1,4);
        System.out.println(arr);
        char[] ch =s.toCharArray();
        System.out.println("");
        System.out.println(ch[0]);*/

//
//        //Method 2
//
//          Scanner input = new Scanner(System.in);
//          String a = "Santho";
//       String b = " ";
//       for (int i = a.length()-1; i >= 0; i--){
//            b += a.charAt(i);
//        }
//        System.out.println(b);
//
//
//
//        Method-3
//        char[] arr = a.toCharArray();
//        int right=a.length()-1;
//        int left=0;
//
//        while(left<right){
//            char temp=arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//
//            left++;
//            right--;
//        }
//
//        String array = Arrays.toString(arr);
//        System.out.println(array);
//
//
//        method 4
//                String reverse = new StringBuffer(a).reverse().toString();
//                System.out.println(reverse);
//            }
//        }
//
//

    static int strStr(String haystack, String needle) {
        int ans = -1;
       int index=haystack.indexOf(needle);
       if(index!=-1){
           ans=index;
       }

        return ans;
    }
}

