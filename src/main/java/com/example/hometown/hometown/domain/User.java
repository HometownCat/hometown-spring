package com.example.hometown.hometown.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "username", nullable = false, columnDefinition = "varchar(20) default = null")
	private String username;

	@Column(name = "email", nullable = false, columnDefinition = "mediumtext default = null")
	private String email;

	@Column(name = "password", nullable = false, columnDefinition = "varchar(20) default = null")
	private String password;

	@Column(name = "address", nullable = false, columnDefinition = "mediumtext default = null")
	private String address;

	@Column(name = "phoneNumber", nullable = false, columnDefinition = "varchar(15) default = null")
	private String phoneNumber;

	@Column(name = "profileImage", columnDefinition = "text default = null")
	private String profileImage;

	@Column(name = "userIp", columnDefinition = "varchar(15) default = null")
	private String userIp;

	@Column(name = "status", columnDefinition = "tinyint(4) default = 0")
	private Integer status;

	@CreatedDate
	private LocalDateTime createdAt;

	@LastModifiedDate
	private LocalDateTime updatedAt;

	@OneToMany
	private List<Board> boards = new ArrayList<>();

	@OneToMany
	private List<BoardLike> boardLikes = new ArrayList<>();

	@OneToOne
	private Auth auth;
}