package org.example;

public class Main {

        private static int totalNumberOfEmployees;
        private String badgeIdCode;
        public Employee employee;

        private static void keepTrackOfEmployeesNumber() {
            totalNumberOfEmployees++;
        }


        private String generateBadgeIdCode() {
            String randomCode1 = "XYZ";
            String randomCode2 = "ZYX";
            return randomCode1 + employee.getName() + employee.getSurname() + randomCode2;
        }

        public void showBadgeDetails() {
            keepTrackOfEmployeesNumber();
            badgeIdCode = generateBadgeIdCode();
            System.out.println(employee.getEmployeeDetails());
            System.out.println("The badge Code is : " + badgeIdCode);

        }


    }
