class String_methods{
    public static void main(String[] args) {
        //we can ddeclare String in two ways by using the String literal and by creating the new object
        String str = new String("javasss");
        String a = "java";
        System.out.println(a.length());
        System.out.println(a.trim());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.charAt(3));
        System.out.println(a.substring(1));
        System.out.println(a.substring(1,3));
        System.out.println(a.replace('a','z'));
        System.out.println(a.startsWith("j"));
        System.out.println(a.endsWith("a"));
        System.out.println(a.equals("java"));
        System.out.println(a.indexOf("v"));
        System.out.println(a.indexOf("ja"));//here it will show the index of the String also
        System.out.println(a.indexOf("a",4));
        System.out.println(a.lastIndexOf("a"));
        System.out.println(a.lastIndexOf("a",3));//it will check the index before the number given
        System.out.println(a.compareTo(str));
        System.out.println(a.concat(a));
        System.out.println(a.isEmpty());
    }
}