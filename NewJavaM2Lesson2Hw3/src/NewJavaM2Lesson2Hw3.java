public class NewJavaM2Lesson2Hw3 {
    private Integer idNumber;
    private String name;
    private String surname;
    private Integer salary;

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        NewJavaM2Lesson2Hw3 Employee = new NewJavaM2Lesson2Hw3();
        Employee.setIdNumber(23454);
        Employee.setName("Azizov");
        Employee.setSurname("Elmurod");
        Employee.setSalary(600);
        System.out.println(Employee.getName());
        System.out.println(Employee.getSurname());
        System.out.println(Employee.getIdNumber());
        System.out.println("$"+Employee.getSalary());
    }
}
