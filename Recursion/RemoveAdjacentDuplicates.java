package Recursion;

/*public class RemoveAdjacentDuplicates {

    public static String removeAdjDuplicates(String s) {
        // Base case: if string is empty or has one character
        if (s.length() <= 1) return s;

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            // Check for a block of adjacent duplicates
            int j = i;
            while (j + 1 < s.length() && s.charAt(i) == s.charAt(j + 1)) {
                j++;
            }

            // If no adjacent duplicates were found, keep the character
            if (i == j) {
                result.append(s.charAt(i));
            }

            // Move to the next non-duplicate character
            i = j + 1;
        }

        // Recurse until no more changes
        String reduced = result.toString();
        if (reduced.length() == s.length()) {
            return reduced;
        }

        // Continue recursion if any reduction happened
        return removeAdjDuplicates(reduced);
    }

    public static void main(String[] args) {
        String s = "azxxzy";
        String result = removeAdjDuplicates(s);
        System.out.println("Result: " + result);  // Output: "ay"
    }
}*/

public class RemoveAdjacentDuplicates{
    public static void main(String[] args) {
        String s="aabbcd";
        System.out.println(1);
        System.out.println(removeDuplicates(s));
        System.out.println(2);
    }

    public static String removeDuplicates(String s){
        if(s.length()<=1){
            return s;
        }

        int i=0;
        StringBuilder result=new StringBuilder();
        while(i<s.length()){
            int j=i;

            while(j+1 < s.length() && s.charAt(i)==s.charAt(j+1)){
                j++;
            }

            if(i==j){
                result.append(s.charAt(i));
            }

            j=i+1;
        }
        String reduced=result.toString();
        if(reduced.length()==s.length()){
            return reduced;
        }
        return removeDuplicates(reduced);
    }
}

