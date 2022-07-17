package string;

public class Source {
    public static void main(String[] args) {
        String s = "java";
        String s1 = new String("java").intern();
        String s2 = new String("java");
        String s3 = "JAVA";
//        int a = 1111;
//        System.out.println(s.replaceAll("a","o"));
//        System.out.println(s.equals(s2));
        System.out.println(s==s3);
        //charAt()
        //isEmpty()
        //s.equals(s2)
        //s.equalsIgnoreCase(s2)
        //char[] charArray = s.toCharArray()
        //
    }

}
