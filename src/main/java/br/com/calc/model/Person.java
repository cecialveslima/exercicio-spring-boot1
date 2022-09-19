package br.com.calc.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="person")
public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	
	@Column(name = "name", nullable =  false, length = 80)
	private String name;
	
	@Column(nullable =  false, length = 80)
	private String sobrenome;
	
	@Column(nullable =  false, length = 100)
	private String endereco;
	
	@Column(nullable =  false, length = 10)
	private String sexo;
	
	public Person() {
		
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Id, endereco, name, sexo, sobrenome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Id == other.Id && Objects.equals(endereco, other.endereco) && Objects.equals(name, other.name)
				&& Objects.equals(sexo, other.sexo) && Objects.equals(sobrenome, other.sobrenome);
	}

}
