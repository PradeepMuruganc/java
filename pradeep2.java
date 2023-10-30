class pradeep2{
    public static void main(String args[]){
        String a="PRADEEP IS GOOD BOY";
        String b=a.toLowerCase();
        System.out.println(b);
        System.out.println(b.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.substring(0,7));
        System.out.println(a.length());
        System.out.println(a.indexOf("GOOD"));
        System.out.println(a.contains("BAD"));
        System.out.println(a.charAt(2));
        System.out.println(a.replace("GOOD","BAD"));
        System.out.println(a.join("-","PRADEEP","IS","BAD","BOY"));
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        StringBuffer c =new StringBuffer(" Livi ");
        System.out.println(c);
        System.out.println(c.reverse());
        System.out.println(c.insert(1,"pradii"));
        System.out.println(c.delete(0,1));

    }
}