public class Main {

    public static int lengthOfLastWord(String s) {
        char[] array = s.toCharArray();
       int workLength = 0;
       boolean space = false;
       for(int i = array.length-1;i>=0;i--){
           if(array[i]!=' '){
               space = true;
               workLength++;
           } else if(space && array[i]==' '){
               return workLength;
           }
       }
       return workLength;
   }
    
    public static void main(String[] var0) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
