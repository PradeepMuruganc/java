class pradii {
    String name;
    String dept;
    int roll_no;
    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

}
    public class student{
    public static void main(String args[]){
        pradii s=new pradii();
        s.name="pradeep";
        s.dept="CSE";
        s.roll_no=101;
        s.setMark(99);

        System.out.println(s.name+" "+s.dept+" "+s.getMark()+" "+s.roll_no);
    }

}
