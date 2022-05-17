package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "entregador")
public class Entregador extends Funcionario {
	@Column(name = "numero")
	@NotNull
	private int numero;
	
	@Column(name = "cnh")
	private char cnh;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getCnh() {
		return cnh;
	}

	public void setCnh(char cnh) {
		this.cnh = cnh;
	}

	@Override
	public String toString() {
		return "Entregador [numero=" + numero + ", cnh=" + cnh + "]";
	}
	
}
