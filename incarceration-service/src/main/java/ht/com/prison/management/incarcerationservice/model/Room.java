package ht.com.prison.management.incarcerationservice.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "room")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Room {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id_room")
	private int id;
	@Column(name = "numero_room")
	private String numero;
	@Column(name = "codigo_room")
	private String codigo;
	@Column(name = "etage_room")
	private String etageSalle;
	@Column(name = "secteur_room")
	private String secteur;
	@Column(name = "capacite_room")
	private int capacite;
	@Column(name = "quantite_prisonier")
	private int quantiteDetenue;
	@OneToOne @JoinColumn (name = "id_usuario")
	private Prisonier prisonier;

}
