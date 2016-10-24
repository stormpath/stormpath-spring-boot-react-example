package tutorial;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Employee {

	private @Id @GeneratedValue Long id;
	private String name;
	private int age;
	private int years;

	private Employee() {}

	public Employee(String name, int age, int years) {
		this.name = name;
		this.age = age;
		this.years = years;
	}
}