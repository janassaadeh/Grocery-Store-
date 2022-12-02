public class Employee {

     String fName,lName;
     int id, salary;

    public Employee() {
    }

    public Employee(String fName, String lName, int id, int salary) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
        this.salary = salary;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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

    @Override
    public String toString() {
        return "{" +
                fName + " " + lName +
                ", id: " + id +
                ", salary: " + salary + "$" + '\'' +
                '}';
    }

}
