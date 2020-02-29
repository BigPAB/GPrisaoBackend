package ht.com.prison.management.incarcerationservice.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "judge")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Judge extends UsuarioGeral {
	
	@OneToOne @JoinColumn (name = "id_case")
	private JuridicCase juridicCase;

}
