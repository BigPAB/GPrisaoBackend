package ht.com.prison.management.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gestionneur")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Gestionneur extends UsuarioGeral {
	
	@Column (name = "badge_number")
	private String numeroBadge;
	
}
