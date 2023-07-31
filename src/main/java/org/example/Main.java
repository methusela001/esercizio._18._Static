package org.example;

class Main {
    static void main(String[] args) {
        Employee employee1 = new Employee("Methu", "Sela", "Via Paravia");
        Employee employee2 = new Employee("Methu", "Sela", "Via Paravia");

        Badge badge1 = new Badge();
        badge1.employee = employee1;
        badge1.showBadgeDetails();

        Badge badge2 = new Badge();
        badge2.employee = employee2;
        badge2.showBadgeDetails();
    }
}
