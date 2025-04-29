public class Main {

    public static String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] array = s.toCharArray();
        for(char i : array){
            if(i == 'i'){
                sb.reverse();
            }else {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static void main(String[] var0) {
        System.out.println(finalString("string"));
        System.out.println(finalString("poiinter"));
    }
}
