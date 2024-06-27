package Builder_Pattern;

public class Student {
    private String name;
    private int age;
    private  double psp;
    private String univName;
    private String batch;
    private long id;
    private int gradYear;
    private String phoneNumber;

    private Student(){}

    //Builder class is the inner class of student class
    //Builder class is kind of attribute of the student class.

    public static class Builder{
        private String name;
        private int age;
        private  double psp;
        private String univName;
        private String batch;
        private long id;
        private int gradYear;
        private String phoneNumber;

        private Builder(){}

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getPsp() {
            return psp;
        }

        public String getUnivName() {
            return univName;
        }

        public String getBatch() {
            return batch;
        }

        public long getId() {
            return id;
        }

        public int getGradYear() {
            return gradYear;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() throws IllegalAccessException {
            if(this.getGradYear() > 2022) throw new IllegalAccessException("Grad year can't be greater than 2022.");
            Student st = new Student();
            st.name = this.getName();
            st.age = this.getAge();
            st.psp = this.getPsp();
            st.gradYear = this.getGradYear();
            st.univName = this.getUnivName();
            st.batch = this.getBatch();
            st.id = this.getId();
            st.phoneNumber = this.getPhoneNumber();

            return st;
        }
    }
    public static Builder getBuilder(){
        return new Builder();
    }

}
