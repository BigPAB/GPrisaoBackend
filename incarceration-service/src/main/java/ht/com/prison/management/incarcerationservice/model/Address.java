package ht.com.prison.management.incarcerationservice.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "pays")
	private String pays;
	@Column(name = "state")
	private String state;
	@Column(name = "ville")
	private String ville;
	@Column(name = "rua")
	private String rua;
	@Column(name = "numero")
	private String numero;
	@ManyToOne @JoinColumn (name = "id_usuario")
	private UsuarioGeral usuario;
}
