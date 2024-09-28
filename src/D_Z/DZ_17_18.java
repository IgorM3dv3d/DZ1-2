package D_Z;

public class DZ_17_18 {
    public static void main(String[] args) {
        isPalidrome();
        isPalidrome2();
    }

    static void isPalidrome() {
        StringBuilder sb = new StringBuilder("ABOBA");
        System.out.println(sb);

        StringBuilder reverse_str = sb.reverse();
        System.out.println(reverse_str);

        if (("ABOBA".equals(String.valueOf(reverse_str)))) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }

    static void isPalidrome2() {
        String str = "ABOBA";
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(((str.length() - 1) - i))) {
                continue;
            }
            isPalindrome = false;
            break;
        }
        if (isPalindrome) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}




