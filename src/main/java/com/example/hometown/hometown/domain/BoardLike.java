package com.example.hometown.hometown.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "boardLike")
public class BoardLike {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "likeStatus", columnDefinition = "tinyint(3) unsigned default = 0")
	private Integer likeStatus;

	@CreatedDate
	private LocalDateTime createdAt;

	@LastModifiedDate
	private LocalDateTime updatedAt;

	@ManyToOne
	@JoinColumn(name = "boardId", referencedColumnName = "id")
	private Board board;

	@ManyToOne
	@JoinColumn(name = "userId", referencedColumnName = "id")
	private User user;
}
