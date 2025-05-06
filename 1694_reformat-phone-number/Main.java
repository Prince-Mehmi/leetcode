public class Main {

    public static String reformatNumber(String number) {
        char[] array = number.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : array) {
            if (c != ' ' && c != '-') {
                sb.append(c);
            }
        }
        int remains = sb.length() % 3;
        if (remains == 1) {
            String start = sb.substring(0, sb.length() - 4);
            String last = sb.substring(start.length(), sb.length());
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            char[] startArray = start.toCharArray();
            char[] lastArray = last.toCharArray();
            for (int i = 0; i < start.length(); i++) {
                if (i != 0 && (i % 3) == 0) {
                    sb1.append('-');
                }
                sb1.append(startArray[i]);
            }
            for (int i = 0; i < last.length(); i++) {
                if (i != 0 && (i % 2) == 0) {
                    sb2.append('-');
                }
                sb2.append(lastArray[i]);
            }
            if (sb1.length() > 0) {
                return sb1.toString() + '-' + sb2.toString();
            } else {
                return sb2.toString();
            }

        } else {
            StringBuilder sb1 = new StringBuilder();
            String sdf = sb.toString();
            for (int i = 0; i < sdf.length(); i++) {
                if (i != 0 && (i % 3) == 0) {
                    sb1.append('-');
                }
                sb1.append(sb.charAt(i));
            }
            return sb1.toString();
        }
    }
    
    public static void main(String[] var0) {
        System.out.println(reformatNumber("1-23-45 6"));
        System.out.println(reformatNumber("123 4-567"));
        System.out.println(reformatNumber("123 4-5678"));
    }
}
