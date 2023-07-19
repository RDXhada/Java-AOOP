public class Problem3 {
    //function to check whether a string is a palindrome
    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        // Input string
        String str = "abba";
        //Convert the string to lowercase
        str = str.toLowerCase();
        if (isPalindrome(str)) {
            System.out.print("Its a palindrome!");
        }
        else {
            System.out.print("Its not a palindrome :(");
        }
    }
}