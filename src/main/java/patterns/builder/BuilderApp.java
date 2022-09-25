package patterns.builder;

public class BuilderApp {
    public static void main(String[] args) {

        Employee.Builder  employeeBuilder = new Employee.Builder();

        //Nos permite construir un objeto paso por paso
        Employee employee = employeeBuilder
                .setName("Ramon")
                .setAge(30)
                .setDepartment("Software")
                .build();

        System.out.println(employee);
    }
}
