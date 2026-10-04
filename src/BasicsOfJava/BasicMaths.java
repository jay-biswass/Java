package BasicsOfJava;

public class BasicMaths {

    static void printDigits(int n) {
        while (n != 0) {
            int digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }
    }

    static void countDigit(int n) {
        int count = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }

    static void sumOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            sum += digit;
        }
        System.out.println(sum);
    }

    static void reverseNumber(int n) {
        while (n != 0) {
            int digit = n % 10;
            System.out.print(digit);
            n = n / 10;
        }
    }

    static void reverseNumber2(int n) {
        int ans = 0;
        while (n != 0) {
            int digit = n % 10;
            ans = ans * 10 + digit;
            n = n / 10;
        }
        System.out.println(ans);
    }

    static void palindrome(int n) {
        int ans = 0;
        int num = n;
        while (n != 0) {
            int digit = n % 10;
            ans = ans * 10 + digit;
            n = n / 10;
        }
        if (ans == num) {
            System.out.println("Palindrome hai");
        } else {
            System.out.println("Palindroe nahi hai.");
        }
    }

    static boolean prime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    static int GCD(int a, int b) {
//        GCD formula =>  gcd(a,b) = gcd(b,a%b) ☑️

        while (b != 0) {
            int temp_b = b;
            b = a % b;
            a = temp_b;
        }
        int ans = a;
        return ans;
    }


    static int LCM(int a, int b) {
//      LCM formula => (LCM * GCD) = (a * b)
        int gcd = GCD(a, b);
        int prod = a * b;
        int lcm = prod / gcd;
        return lcm;
    }


    static void armstrongNumber(int n) {
        int num = n;
        int ans = 1;
        int arm = 0;
        while (n != 0) {
            int digit = n % 10;
            ans = digit * digit * digit;
            arm = arm + ans;
//            System.out.println(ans);
            n = n / 10;
        }
            System.out.println(arm);

        if(arm == num){
            System.out.println("Armstrong Number hain");
        }else{
            System.out.println("NAHI hai");
        }
    }


    static void main() {

//        printDigits(9845);
//        countDigit(12301);
//        sumOfDigit(37591);
//        reverseNumber(12300);
//        System.out.println();
//        reverseNumber2(12300);
//        palindrome(162261);

//        int n = 11;
//        System.out.println(prime(n));;


//        System.out.println(GCD(18,12));
//        System.out.println(LCM(18,12));

//        System.out.println(armstrongNumber(1234));
        armstrongNumber(1434);


    }
}
