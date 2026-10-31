package test_31102026_section_1;

public class AbstractImplements extends Abstract {

	String name;
	double marks;
	
	@Override
	public void Studentdetails(String name, double marks) {
		this.name = name;
		this.marks = marks;
		
	}

	@Override
	public void Show() {
		System.out.println("Student Name:"+this.name);
		System.out.println("Student Marks:"+this.marks);
		
	}
	
	public static void main(String []args) {
		AbstractImplements abstractImplements = new AbstractImplements();
		abstractImplements.Studentdetails("Natheem", 4567.78);
		abstractImplements.Show();
	}

}
