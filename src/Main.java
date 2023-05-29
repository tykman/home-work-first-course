public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10]; {
        Employee employee1 = new Employee("Мария Светлая", 1, 105000);
        Employee employee2 = new Employee("Нюша Анюшева", 2, 203340);
        Employee employee3 = new Employee("Оля Ольгина", 3, 350880);
        Employee employee4 = new Employee("Юлия Белая",4, 321987);
        Employee employee5 = new Employee("Батыров Урал",5,237732);
        Employee employee6 = new Employee("Мира Мирова",5,969522);
        Employee employee7 = new Employee("Дарья Нарышкина",4,789457);
        Employee employee8 = new Employee("Данил Юсупов",3,720190);
        Employee employee9 = new Employee("Григорий Победоносец",2,675000);
        Employee employee10 = new Employee("Сапсан Орланов",1,12345);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;
        }

        printAll(employees);
        System.out.println("Суммарная з/п : " + getTotalPayday(employees));
        System.out.println("Сотрудник с мин. з/п : " + getEmployeeWithMinPayday(employees));
        System.out.println("Сотрудник с макс. з/п : " + getEmployeeWithMaxPayday(employees));
        System.out.println("Средняя з/п : " + getAvgPayday(employees));
        printAllaFullName(employees);
        Employee employee10 = new Employee("Сапсан Орланов" ,1, 12345);
        employee10.setDepartment(5);
        employee10.setPayday(123456);

        System.out.println( "Сотрудник - " + employee10.getFullName() + " переведен в отдел № " + employee10.getDepartment()+ " с повышением з/п : " + employee10.getPayday() + " руб.");

    }

    public static void printAll(Employee[] employees){
            for (Employee e : employees) {
            System.out.println(e);
            }
        }

    public static int getTotalPayday(Employee[] employees) {
        int result = 0;
        for (Employee e : employees) {
            result += e.getPayday();
        }
        return result;
    }


    public static Employee getEmployeeWithMinPayday(Employee[] employees) {
        Employee employeeWithMinPayday = employees[0];
        for (Employee e : employees) {
            if (employeeWithMinPayday.getPayday() > e.getPayday()) {
                employeeWithMinPayday = e;
            }
        }
        return employeeWithMinPayday;
    }

    public static Employee getEmployeeWithMaxPayday(Employee[] employees) {
        Employee employeeWithMaxPayday = employees[0];
        for (Employee e : employees) {
            if (employeeWithMaxPayday.getPayday() < e.getPayday()) {
                employeeWithMaxPayday = e;
            }
        }
        return employeeWithMaxPayday;
    }

    public static double getAvgPayday(Employee[] employees){
        return (double) getTotalPayday(employees) / employees.length;
    }

    public static void printAllaFullName(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.getFullName());
        }
    }
}