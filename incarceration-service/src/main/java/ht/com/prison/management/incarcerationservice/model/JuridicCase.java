package ht.com.prison.management.incarcerationservice.model;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "juridic_case")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JuridicCase {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id_case")
	private int id;
	@Column(name = "case_number")
	private String numero;
	@Column(name = "trinubal_name")
	private String tribunalName;
	@OneToOne (mappedBy = "juridicCase", targetEntity = Judge.class, cascade =CascadeType.ALL)
	private Judge jugde;
	@Column(name = "identite_prisonier")
	private String identiteDetenue;
	@Column(name = "verdict_case")
	private String verdict;
	@OneToOne @JoinColumn (name = "id_usuario")
	private Prisonier prisonier;
}
