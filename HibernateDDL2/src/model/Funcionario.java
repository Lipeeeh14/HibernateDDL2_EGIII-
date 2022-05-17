package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import net.sourceforge.jtds.jdbc.DateTime;

@Entity
@Table(name = "funcionario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "funcionarioId")
	@NotNull
	private int funcionarioId;
	
	@Column(name = "nome", length = 100)
	@NotNull
	private String nome;
	
	@Column(name = "dataNasc")
	private DateTime dataNasc;
	
	@Column(name = "salario")
	@NotNull
	private double salario;
	
	@Column(name = "telefone", length = 11)
	@NotNull
	private String telefone;

	public int getFuncionarioId() {
		return funcionarioId;
	}

	public void setFuncionarioId(int funcionarioId) {
		this.funcionarioId = funcionarioId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DateTime getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(DateTime dataNasc) {
		this.dataNasc = dataNasc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Funcionario [funcionarioId=" + funcionarioId + ", nome=" + nome + ", dataNasc=" + dataNasc
				+ ", salario=" + salario + ", telefone=" + telefone + "]";
	}
	
}
