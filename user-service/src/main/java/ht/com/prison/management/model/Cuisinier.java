package ht.com.prison.management.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cuisinier")
@Builder
public class Cuisinier extends UsuarioGeral {
}
