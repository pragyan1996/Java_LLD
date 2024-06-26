package prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private double psp;
    private String batchName;
    private double avgBatchPsp;

    Student(){};
    public Student(Student student){
        this.avgBatchPsp = student.avgBatchPsp;
        this.batchName = student.batchName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void display(){
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.psp);
        System.out.println(this.batchName);
        System.out.println(this.avgBatchPsp);

    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
