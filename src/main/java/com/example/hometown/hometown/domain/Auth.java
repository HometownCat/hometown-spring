package com.example.hometown.hometown.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "auth")
public class Auth {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "accessToken", columnDefinition = "mediumtext default = null")
	private String accessToken;

	@Column(name = "revokeToken", columnDefinition = "longtext default = null")
	private String revokeToken;

	@CreatedDate
	private LocalDateTime createdAt;

	@LastModifiedDate
	private LocalDateTime updatedAt;

	@OneToOne
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private User user;
}
