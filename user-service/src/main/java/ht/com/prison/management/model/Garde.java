package ht.com.prison.management.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "garde")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Garde extends UsuarioGeral {
	@Column (name = "badge_number")
	private String numeroBadge;
	
}
