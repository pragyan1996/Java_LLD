package Builder_Pattern;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Student st = Student.getBuilder()
                .setName("Rish")
                .setAge(20)
                .setPsp(90.1)
                .setUnivName("Pune University")
                .setBatch("July 2022")
                .setId(1)
                .setGradYear(2022)
                .setPhoneNumber("9960168177").build();
        System.out.println(st);
    }
}
