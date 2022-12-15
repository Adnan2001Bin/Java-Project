package Student_Portal;

public class Department extends Student {

    String Dept;

    public Department(String name, String id, String password,String Dept) {
        super(name, id, password);
        this.Dept = Dept;
    }

    public String getDept() {
        return Dept;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\t\t\t\t\t[Department of " + Dept+"]");
    }
}
