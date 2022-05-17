package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "atendente")
public class Atendente extends Funcionario {
	@Column(name = "horaEntrada", length = 5)
	private String horaEntrada;
	
	@Column(name = "horaSaida", length = 5)
	private String horaSaida;
	
	@Column(name = "emailInsitucional", length = 50)
	@NotNull
	private String emailInstitucional;

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public String getEmailInstitucional() {
		return emailInstitucional;
	}

	public void setEmailInstitucional(String emailInstitucional) {
		this.emailInstitucional = emailInstitucional;
	}

	@Override
	public String toString() {
		return "Atendente [horaEntrada=" + horaEntrada + ", horaSaida=" + horaSaida + ", emailInstitucional="
				+ emailInstitucional + "]";
	}
	
}
