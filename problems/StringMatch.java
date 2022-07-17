package problems;

public class StringMatch {
    public static void main(String[] args) {
        String one = "1807";
        String two = "1820";
        int match = 0;
        int same=0;
        for(int i=0;i<one.length();i++){
            char letr = one.charAt(i);
//            boolean letter = two.contains("one".charAt(i));
            if(one.charAt(i)==two.charAt(i)){
                match++;
            }
//            else if(letter==true){
//                same++;
//            }

        }
        System.out.println(match+"P"+same+"R");
    }
}
