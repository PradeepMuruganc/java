public class inheritance {
        protected String name="Pradeep";

    public String getName() {
        return name;
    }
}
    class students extends inheritance {
         private String dept="CSE";
        public static void main(String args[]) {
            students p = new students();

            System.out.println(p.getName()+" "+p.dept);
        }

        }



