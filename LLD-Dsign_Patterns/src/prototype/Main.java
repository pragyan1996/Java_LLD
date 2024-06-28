package prototype;

public class Main {
    public static void fillRegistry(StudentRegistry registry){
        Student mar22  = new Student();
        mar22.setBatchName("Mar22");
        mar22.setAvgBatchPsp(70.7);
        registry.register("mar22", mar22);

        Student sept22  = new Student();
        sept22.setBatchName("Sept22");
        sept22.setAvgBatchPsp(90.7);
        registry.register("sept22", sept22);
    }

    public static void main(String[] args) {
        StudentRegistry register = new StudentRegistry();
        fillRegistry(register);

        Student vipul = register.get("sept22").clone();
        vipul.setName("Vipul");
        vipul.setAge(22);
        vipul.setPsp(99);

        Student Rishi = register.get("mar22").clone();
        Rishi.setName("Rishi");
        Rishi.setAge(27);
        Rishi.setPsp(70);

        vipul.display();
        Rishi.display();
    }
}
