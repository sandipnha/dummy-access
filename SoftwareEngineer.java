package proj;

import java.util.Comparator;

public class SoftwareEngineer implements Comparable<SoftwareEngineer>,
		Comparator<SoftwareEngineer> {

	String name;
	int age;
	int salary;
	String areaOfIntertest;
	public SoftwareEngineer(String name, int age, int salary,
			String areaOfIntertest) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.areaOfIntertest = areaOfIntertest;
	}
	public int compare(SoftwareEngineer s1, SoftwareEngineer s2) {
		if (s1.age > s2.age)
			return 1;
		if (s1.age < s2.age)
			return -1;
		else
			return 0;
	}

	public int compareTo(SoftwareEngineer s) {
		return this.name.compareTo(s.name);
	}
	
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", age=" + age + ", salary="
				+ salary + ", areaOfIntertest=" + areaOfIntertest + "]";
	}

}
