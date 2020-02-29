package ht.com.prison.management.incarcerationservice.model;

import lombok.*;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "usuario_geral")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class UsuarioGeral {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	protected int id;
	@Column (name = "nome_usuario")
	protected String nom;
	@Column (name = "sobrenome_usuario")
	protected String prenom;
	@Column (name = "data_nasc_usuario")
	protected String age;
	@Column (name = "rg_cpf_usuario")
	protected String identite;
	@Column (name = "nom_mere")
	protected String nomMere;
	@Column (name = "nom_pere")
	protected String nomPere;
	@OneToMany (mappedBy = "usuario", targetEntity = Address.class, cascade =CascadeType.ALL)
	private List<Address> address;
}
