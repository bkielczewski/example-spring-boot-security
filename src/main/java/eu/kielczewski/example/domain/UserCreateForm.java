package eu.kielczewski.example.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class UserCreateForm {

    @NotEmpty
    private String email = "";

    @NotEmpty
    private String password = "";

    @NotEmpty
    private String passwordRepeated = "";

    @NotNull
    private Role role = Role.USER;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordRepeated() {
        return passwordRepeated;
    }

    public void setPasswordRepeated(String passwordRepeated) {
        this.passwordRepeated = passwordRepeated;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserCreateForm{" +
                "email='" + email.replaceFirst("@.+", "@***") + '\'' +
                ", password=***" + '\'' +
                ", passwordRepeated=***" + '\'' +
                ", role=" + role +
                '}';
    }

}
