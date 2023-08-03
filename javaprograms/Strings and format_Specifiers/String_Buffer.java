class String_Buffer{
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("java");//in StringBuider class String object is mutable where as String class is immutable
        System.out.println(a);
        //String buffer methods
        System.out.println(a.append(" programming"));
        System.out.println(a.insert(3,"programming"));
        System.out.println(a.replace(3,14,""));
        System.out.println(a.delete(4,16));
        System.out.println(a.length());
        System.out.println(a.reverse());
        System.out.println(a.reverse());
        System.out.println(a.deleteCharAt(0));
        a.setLength(100);
        System.out.println(a.length());
        System.out.println(a.capacity());
        a.ensureCapacity(200);
        System.out.println(a.capacity());

    }
}