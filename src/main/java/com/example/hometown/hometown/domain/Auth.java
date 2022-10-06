package com.example.hometown.hometown.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "auth")
public class Auth {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

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
