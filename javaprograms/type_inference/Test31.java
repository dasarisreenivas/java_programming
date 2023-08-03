package type_inference;
class Test31{
    static {
        System.out.println("static block");
    }
    {
        System.out.println("non static block");
    }
    public Test31(){
        System.out.println("construccter ");
    }
    public static void main(String[] args) {
        System.out.println("block");//block are the initilizers
    }

}
