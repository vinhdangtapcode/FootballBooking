package vn.footballfield.entity;

import jakarta.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank
	@Size(max = 50)
	private String name;

	@NotBlank
	@Email
	@Size(max = 50)
	@Column(unique = true)
	private String email;

	@NotBlank
	@Size(max = 255)
	private String password;

	@Size(max = 15)
	private String phone;

	@NotBlank
	@Size(max = 20)
	private String role;

	// Getters and Setters
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }
	public String getRole() { return role; }
	public void setRole(String role) { this.role = role; }
}