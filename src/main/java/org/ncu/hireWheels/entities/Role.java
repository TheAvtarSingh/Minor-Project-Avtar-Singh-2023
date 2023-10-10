package org.ncu.hireWheels.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
	@Id
	@Column(name = "role_id", precision = 10)
	private Integer roleId;

	@Column(name = "role_name", nullable = false,unique = true,length = 50)
	private String roleName;

//	Mapped with
	
	@OneToMany(mappedBy = "userRole")
	@JsonBackReference
	@JsonIgnore
	private List<User> role_user;
	
	
	
}
