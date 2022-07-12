package oscarblancarte.ipd.builder;

import oscarblancarte.ipd.builder.dto.Employee;

/**
 * @author oblancarte
 */
public class BuilderMain {

    public static void main(String[] args) {
        Employee emp = new Employee.EmployeeBuilder()
                .setName("Oscar Javier Blancarte Iturralde")
                .setGender("Male")
                .setAge(29)
                .setAdress("Benito " 
                        + "Juarez", "Mexico D.F.", "Mexico", "03400")
                .addContacs("Rene Blancarte", "1122334455", "123", "Casa", 
                        "Chapultepect No. 123 Col. Militar", "Mexico"
                        , "Mexico", "10023")
                .addContacs("Jaime Blancarte", "3344556677", null, "Celular")
                .addPhones("4567890234", null, "Celular")
                .addPhones("7788990099", null, "Casa")
                .setDepartment("Financiero", "Departamento de Finanzas y Contabilidad")
                .build();
        
        Employee emp1 = new Employee.EmployeeBuilder()
                .setName("Luisa Valentina Pauta Valladares")
                .setGender("Femele")
                .setAge(34)
                .setAdress("Circunvalación Sur" 
                        + "Cuenca", "Azuay", "Ecuador", "120983")
                .addContacs("Juan Romo", "0948374823", "432", "Casa", 
                        "Av. Loja", "Cuenca", "Ecuador", "10023")
                .addPhones("0958375847", null, "Celular")
                .addPhones("0932843723", null, "Casa")
                .setDepartment("Ventas", "Departamento de ventas y proovedores")
                .build();
        
        System.out.println("---------- Empleado 1 ----------");
        System.out.println(emp);
        System.out.println("---------- Empleado 2 ----------");
        System.out.println(emp1);
    }
}
