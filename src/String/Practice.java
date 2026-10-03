package String;

public class Practice {

    static void name(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.println("->" + ch);
        }
    }

    static void length(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
        }
        System.out.println("Length of the string is: " + i);
    }

    static void stringLength(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        System.out.println(len);
    }

    static int countVowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch =='U' ) {
                count++;
            }
        }
        System.out.print("The number of vowels are: ");
        return count;
    }

    static void reverseString(String str){
        String reverse ="";
        for (int i=str.length()-1; i>=0;i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
            System.out.print(reverse);
    }


    static void palindrome(String str){
        String reverse = "";
        for (int i= str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            reverse+=ch;
        }

        if(str.equals(reverse)){
            System.out.println("Palindrome hai...");
        }
        else {
            System.out.println("Palindrome nahi hai...");
        }
    }

    static void main() {
//        String str = "Tanushree";
//        char[] crr = str.toCharArray();
//
//        for (char ch:crr){
//            System.out.println("Value of name: "+ch);
//        }

//        name("Tanushree");
//        length("Tanushree");
//        stringLength("Tanushree");
//        countVowel("Pradeep");


//        int result = countVowel("Pradeep");
//        System.out.println(result);


//        reverseString("Jay");


        palindrome("NooN");



    }
}
