package DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard {
	@Id
	private int id;
	private String p_name;
	@OneToOne
	private Person person;

	public int getId() {
		return id;
	}

	public String getP_name() {
		return p_name;
	}

	public Person getPerson() {
		return person;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Pancard [id=" + id + ", p_name=" + p_name + ", person=" + person + "]";
	}

}
