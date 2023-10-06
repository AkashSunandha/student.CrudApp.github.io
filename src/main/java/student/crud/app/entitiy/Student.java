package student.crud.app.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //to tell spring that the object of this class to be created
public class Student {
	@Id
	String kodId;
	String name,batch;
	
	public Student() {
		super();
	}
	
	public Student(String kodId,String name,String batch) {
		super();
		this.kodId = kodId;
		this.name=name;
		this.batch=batch;
	}
	
	public void setKodId(String kodId) {
		this.kodId = kodId;
	}
	public String getkodId() {
		return kodId;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	
	public void setBatch(String batch) {
		this.batch=batch;
	}
	public String getBatch() {
		return batch;
	}

	@Override
	public String toString() {
		return "Student [kodId=" + kodId + ", name=" + name + ", batch=" + batch + "]";
	}
	
	
	
	
}
