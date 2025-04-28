class Main {
    public static boolean isPalindrome(int x) {
        String number = Integer.toString(x);
        char[] array = number.toCharArray();
        int i = 0;
        int j = array.length - 1;
        while(i<=j){
            if(array[i]!=array[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] var0) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}