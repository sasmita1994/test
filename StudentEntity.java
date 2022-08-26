


package Entity;

	

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	public class StudentEntity {
		
		@Id
		@GeneratedValue
		private int student_id;
		private int roll_no;
		private int marks;
		private String name;
		public int getStudent_id() {
			return student_id;
		}
		public void setStudent_id(int student_id) {
			this.student_id = student_id;
		}
		public int getRoll_no() {
			return roll_no;
		}
		public StudentEntity() {
			super();
		}
		public StudentEntity(int student_id, int roll_no, int marks, String name) {
			super();
			this.student_id = student_id;
			this.roll_no = roll_no;
			this.marks = marks;
			this.name = name;
		}
		public void setRoll_no(int roll_no) {
			this.roll_no = roll_no;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

	}



