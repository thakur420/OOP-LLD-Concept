package Builder;

public class Client {
    public static void main(String[] args) {
        Student student1 = Student.builder()
                            .id(1)
                            .name("ravi")
                            .email("ravi@java.com")
                            .phoneNumber(123456)
                            .gradYear(2023)
                            .age(23)
                            .build();

        System.out.println(student1);

        Student student2 = Student.builder()
                            .id(2)
                            .name("raj")
                            .age(25)
                            .build();
        System.out.println(student2);
    }
}
