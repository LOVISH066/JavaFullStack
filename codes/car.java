class car {

    String type = "sedan"; // propeerties or we can say attribute of class
    String name = "virtus";
    static String numPlate = "PB19XX0001";

    public static void main(String[] arg){ //method

        // obejct
        car c = new car(); // c variable is a type of car 
        // System.out.println(numPlate);
        // System.out.println(c.numPlate);
        // System.out.println(c.name);
        // System.out.println(c.type);

        c.sum(); //method calling

    }

    public void sum(){ //non staic are 
        int a = 93;
        int b = 423;
        int sum = a + b;
        System.out.println(numPlate);
        System.out.println(sum);
    }




    
}
