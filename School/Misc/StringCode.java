class StringCode {
    public static void main(String[] args) {
        String name1 = "dave";
        String name2 = "edde";
        boolean val = name1.equals(name2);
        int a = name1.compareTo(name2);
        int b = name2.compareTo(name1);

        if (a > 0){
            System.out.println("val: " + val);
            System.out.println("a: " + a);
            System.out.println("b: " + b);
        }
    }
}
