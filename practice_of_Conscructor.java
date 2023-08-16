package hello.com;
class Myhello{
    private int id;

    private String name;
    private int salary;
    public Myhello(String helloname, int myid, int mysalary){
        name = helloname;
        id = myid;
        salary = mysalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
public class practice_of_Conscructor {
    public static void main(String[] args) {
        Myhello name = new Myhello("Raja", 1, 10000);
        name.getId();
        name.getId();
        name.getSalary();
        System.out.println("The id of the Employee is : " + name.getId());
        System.out.println("The name of the Employee is : " + name.getName());
        System.out.println("The Salary of the Employee is : " + name.getSalary());
    }
}
