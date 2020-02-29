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
@Table(name = "crime")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Crime {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "numero_crime")
	private String numeroCrime;
	@Column(name = "violated_law")
	private String ViolatedLaw;
	@Column(name = "jail_time")
	private String jailTime4ViolatedLaw;
	@Column(name = "bail")
	private boolean bail= false;
	@Column(name = "bail_price")
	private double bailPrice;
	@ManyToOne @JoinColumn (name = "id_usuario")
	private Prisonier prisonier;
	@ManyToOne @JoinColumn (name = "id_incarceration")
	private Incarceration incarceration;
}
