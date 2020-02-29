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
@Table (name = "activity")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Activity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String id;
	@Column (name = "nome_activity")
	private String nome;
	@Column (name = "duration_activity")
	private String duration;
	@Column (name = "descricao_activity")
	private String descricao;
	@OneToOne @JoinColumn (name = "id_usuario")
	private Prisonier prisonier;
	
}
