package problems;

import javax.xml.transform.sax.SAXResult;

public class SiliconLabs {
    public static void main(String[] args) {
        String str = "aaacbbbbcde";
        String str2 = str.charAt(0)+"";
        int n = str2.length();
        int i;
        int x;
        int count = 1;
//        for (int i = 1;i<str.length();i++){
//            if(str2.charAt(str2.length()-1)==str.charAt(i)){
//                str2=str2+count;
//                count++;
////                continue;
//            }else if(count>1){
//                str2=str2+count;
//                count=0;
//            }else {
//                str2=str2+str.charAt(i-1);
//                count=0;
//            }
////            str2=str2+str.charAt(i);
//        }
//        for (i=0;i<str.length()-1;i++){
//            if(str2.charAt(n-1)!=str.charAt(i+1) && count==1){
//                str2=str2+str.charAt(i);
//            }else if(str2.charAt(n-1)==str.charAt(i+1)){
//                count++;
//            }else if(str2.charAt(n-1)!=str.charAt(i+1) && count>1){
//                str2=str2+str.charAt(i)+count;
//                count=1;
//            }
//        }
//        str2=str2+str.charAt(i);
//        if(count>1) {
//            System.out.print(str2);
//            System.out.println(count);
//        }else {
//            System.out.println(str2);
//        }

//        System.out.println(str2);
//        System.out.println(count);


        for (x=0;x<str.length()-1;x++) {
            if (str.charAt(x) != str.charAt(x + 1) && count == 1) {
                System.out.print(str.charAt(x));
//                System.out.print(count);
            } else if (str.charAt(x) == str.charAt(x + 1)) {
                count++;
            } else if (str.charAt(x) != str.charAt(x + 1) && count > 1) {
                System.out.print(str.charAt(x));
                System.out.print(count);
                count = 1;
            }
        }
        if(count>1) {
            System.out.print(str.charAt(x));
            System.out.println(count);
        }else {
            System.out.println(str.charAt(x));
        }
    }
}
