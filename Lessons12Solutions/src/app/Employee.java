package app;

public class Employee {

    private String name;
    private String profession;
    private String email;
    private Long phone;
    private Integer age;

    public Employee(String name, String profession, String email, Long phone, Integer age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }
}
