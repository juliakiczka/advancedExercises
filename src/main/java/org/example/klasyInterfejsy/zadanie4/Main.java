package org.example.klasyInterfejsy.zadanie4;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Julia", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        });
        user.setSurname("Kiczka", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && !input.isBlank() && Character.isUpperCase(input.charAt(0));
            }
        });
        user.setAge(20, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input >= 0 && input <= 150;
            }
        });
        user.setLogin("jula123456", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });
        user.setPassword("jula!", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        });
    }
}
