package Builder;

public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private int phoneNumber;
    private int gradYear;

    private Student(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.gradYear = builder.gradYear;
    }
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gradYear=" + gradYear +
                '}';
    }

    public static class Builder{
        private int id;
        private String name;
        private int age;
        private String email;
        private int phoneNumber;
        private int gradYear;
        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build(){
            //Validate all value
            return new Student(this);
        }
    }
}
