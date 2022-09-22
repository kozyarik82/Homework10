public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println(" Задача 1 ");

        String firstName = "Ivan";
        firstName = " " + firstName + " ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);

        // Задача 2
        System.out.println(" Задача 2 ");

        String fullName1 = fullName.toUpperCase();
        System.out.println(" Данные ФИО сотрудника для заполнения отчета - " + fullName1);

        // Задача 3
        System.out.println(" Задача 3 ");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(" Данные ФИО сотрудника - " + fullName);

        // Задача повышенной сложности 5
        System.out.println(" Задача повышенной сложности 5 ");

        fullName = "Ivanov Ivan Ivanovich";
        firstName = fullName.substring(7, 11);
        middleName = fullName.substring(12, 21);
        lastName = fullName.substring(0, 7);
        System.out.println(" Имя сотрудника - " + firstName);
        System.out.println(" Фамилия сотрудника - " + lastName);
        System.out.println(" Отчество сотрудника - " + middleName);
        // Задача 6
        System.out.println(" Задача 6 ");




    }
}