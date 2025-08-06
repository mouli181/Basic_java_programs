public class StringEx {
    public static void main(String[] args) {
        String s1 = "java"; //literal
        String s2 = new String("java"); //using new keyword

//        System.out.println(s1);
//        System.out.println(s2);
//
//        String s3 = s1.concat(" programming");
//        System.out.println(s3);
//        System.out.println(s1 + s2);
//        System.out.println(s1.length());
//        System.out.println(s1.charAt(1));
//        System.out.println(s3.substring(5,12));

        String str = "Hello,world,welcome,to java";
        String[] s = str.split(",");
        for(String my : s){
            System.out.println(my);
        }

        String str1 = "      Hello          ";
        System.out.println(str1);
        System.out.println(str1.trim());
    }
}
