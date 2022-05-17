package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import net.sourceforge.jtds.jdbc.DateTime;

@Entity
@Table(name = "atendimento")
public class Atendimento {
	@Id
	@ManyToOne(targetEntity = Cliente.class)
	@JoinColumn(name = "cpf")
	@NotNull
	private Cliente cliente;
	
	@Id
	@ManyToOne(targetEntity = Atendente.class)
	@JoinColumn(name = "funcionarioId")
	@NotNull
	private Atendente atendente;
	
	@Column(name = "dataAtendimento")
	private DateTime dataAtendimento;
}
