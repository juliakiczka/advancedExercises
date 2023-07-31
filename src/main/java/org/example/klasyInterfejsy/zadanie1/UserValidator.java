package org.example.klasyInterfejsy.zadanie1;

public class UserValidator {
    public String[] validateEmails(String email, String alternativeEmail) {
        class Email {
            private String email;

            public Email(String email) {
                if (email.isEmpty() || email == null || !validate(email)) {
                    this.email = "unknown";
                } else {
                    this.email = email;
                }
            }

        }
        Email email1 = new Email(email);
        Email email2 = new Email(alternativeEmail);
        return new String[]{email1.email, email2.email};
    }

    public static boolean validate(String email) {
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\n");
    }

    public static void main(String[] args) {
        final UserValidator validator = new UserValidator();
        final String[] strings = validator.validateEmails("julja12@wp.pl", "@yahoo.com");
        System.out.println(strings[0]);
        System.out.println(strings[1]);
    }
}
