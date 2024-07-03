public class String_2 {
    public static void main(String args[]){
        String str1 = "Syed";
        String str2 = "Musharraf";
        String str3 = new String();
        String s = new String(str1);
        String s1= s+ str2;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(str2.length());
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str2.charAt(5));
        System.out.println(str2.indexOf('d'));
        System.out.println(str3.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(str2.compareTo(s));
        System.out.println(str1.compareTo(s));
        System.out.println(str1.equalsIgnoreCase(s));
        System.out.println(str2.equals(s));
        System.out.println(s1.lastIndexOf('r'));
            }
}
