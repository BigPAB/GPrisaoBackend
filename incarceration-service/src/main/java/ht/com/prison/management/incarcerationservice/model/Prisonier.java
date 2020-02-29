package ht.com.prison.management.incarcerationservice.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "prisonier")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Prisonier extends UsuarioGeral {
	@Column (name = "metier_prisonier")
	private String metier;
	@OneToOne (mappedBy = "prisonier", targetEntity = Room.class, cascade =CascadeType.ALL)
	private Room room;
	@OneToMany (mappedBy = "prisonier", targetEntity = Crime.class, cascade =CascadeType.ALL)
	private List<Crime> crime;
	@OneToMany (mappedBy = "prisonier", targetEntity = Incarceration.class, cascade =CascadeType.ALL)
	private List<Incarceration> incarceration;
	@OneToOne (mappedBy = "prisonier", targetEntity = JuridicCase.class, cascade =CascadeType.ALL)
	private JuridicCase juridicCase;
	@OneToOne (mappedBy = "prisonier", targetEntity = Activity.class, cascade =CascadeType.ALL)
	private Activity activity;

}