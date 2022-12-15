package Student_Portal;

public abstract class Student {
    private String name, id , password;
    public String Dept;
    public Student(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;

    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract String getDept();

    public void display(){
        System.out.println("****Student Portal****"+"\t\t\t\t\t"+name + "(" + id + ")");
        System.out.println("----------------------------------------------------------------------");
    }

}
