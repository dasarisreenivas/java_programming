package variables_and_datatypes;
class simple_variable_program{
    public static void main(String[] args) {
        int egg_baskets,numberofbaskets;//here we are going to declare the varible type,we will discuss the variable type further
        egg_baskets=10;
        numberofbaskets=20;
        //over ridding the variable
        egg_baskets=20;
        System.out.println("no.of eggs in the basket are "+egg_baskets);
        System.out.println("total number of baskets are "+numberofbaskets);
    }
}