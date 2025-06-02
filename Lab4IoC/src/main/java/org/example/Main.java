package org.example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        List<Employee> employees = List.of(
                context.getBean("administratorBean", Employee.class),
                context.getBean("managerBean", Employee.class),
                context.getBean("programmerBean", Employee.class)
        );

        Company company = new Company(employees);
        company.showJobTitles();
        context.close();
    }
}