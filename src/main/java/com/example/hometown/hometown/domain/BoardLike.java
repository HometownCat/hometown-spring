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
@Table(name = "boardLike")
public class BoardLike {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

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
