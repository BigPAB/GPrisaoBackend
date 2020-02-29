package ht.com.prison.management.incarcerationservice.model;

import lombok.*;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "incarceration")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Incarceration {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "identite_prisonier")
	private String numeroIdentiteDetenue;
	@Column(name = "police_badge")
	private String policeBadgeNumber;
	@Column(name = "date_incarceration")
	private Date date;
	@Column(name = "state_crime")
	private String stateCrime;
	@Column(name = "ville_crime")
	private String villeCrime;
	@Column(name = "rua_crime")
	private String ruaCrime;
	@OneToMany (mappedBy = "incarceration", targetEntity = Crime.class, cascade =CascadeType.ALL)
	private List<Crime> crime;
	@ManyToOne @JoinColumn (name = "id_usuario")
	private Prisonier prisonier;
	
}
