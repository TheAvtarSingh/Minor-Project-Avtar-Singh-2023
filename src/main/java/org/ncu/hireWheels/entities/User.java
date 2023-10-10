package org.ncu.hireWheels.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	@Column(name = "user_id", precision = 10, scale = 0)
	private Integer userId;

	@Column(name = "first_name", nullable = false, length = 50)
	private String firstName;

	@Column(name = "last_name", length = 50)
	private String lastName;

	@Column(name = "password", nullable = false, length = 50)
	private String password;

	@Column(name = "email", nullable = false, unique = true, length = 50)
	private String email;

	@Column(name = "mobile_no", nullable = false, unique = true, length = 10)
	private String mobileNo;



	@Column(name = "wallet_money", precision = 10, scale = 2, columnDefinition = "NUMERIC(10,2) DEFAULT 10000.00")
	private Double walletMoney;

	@PrePersist
	public void validatePasswordLength() {
		if (password != null && password.length() <= 5) {
			throw new IllegalArgumentException("Password length must be greater than 5 characters.");
		}
	}
	
	
//	Mapped to : 

    @ManyToOne(fetch = FetchType.LAZY ,cascade = {CascadeType.ALL})
	@JoinColumn(name = "role_id", nullable = false)
	private Role userRole;
	
//	MAPPED with : 
	@OneToMany(mappedBy = "bookingUser")
	@JsonBackReference
	
	private List<Booking> user_booking;
	
	
	

	
	


}
