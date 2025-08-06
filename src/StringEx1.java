public class StringEx1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.concat("world");
        System.out.println(str3);

        System.out.println(str1 + str2);
        System.out.println(str1.length());
        System.out.println(str1.charAt(4));
        System.out.println(str1.substring(0,3));

        String str4 = "Hello ,welcome to, java";
        String[] sp = str4.split(",");
        for(String a : sp){
            System.out.println(a);
        }

        String str6 = "         Hiii        ";
        System.out.println(str6);
        System.out.println(str6.trim());
    }
}
