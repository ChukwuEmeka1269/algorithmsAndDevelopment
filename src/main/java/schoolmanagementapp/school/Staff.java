package schoolmanagementapp.school;

public class Staff extends Person{
    private Role staffRole;
    private String email;


}

enum Role{
    TEACHER,
    PRINCIPAL,
    CLEANER
}
