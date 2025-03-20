package application;

import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1,"books");

        Seller seller = new Seller(21,"bob","bob@gmail.com",LocalDate.of(1981,4,25),3000.0,department);

        System.out.println(seller);
    }
}
