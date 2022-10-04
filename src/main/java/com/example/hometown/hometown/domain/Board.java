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
@Table(name = "board")
public class Board {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "title", nullable = false, columnDefinition = "text default = null")
	private String title;

	@Column(name = "content", nullable = false, columnDefinition = "mediumtext default = null")
	private String content;

	@Column(name = "viewCount", columnDefinition = "mediumint(8) UNSIGNED default = 0")
	private Integer viewCount;

	@Column(name = "likeCount", columnDefinition = "int(10) UNSIGNED default = 0")
	private Integer likeCount;

	@Column(name = "commentCount", columnDefinition = "smallint(5) UNSIGNED default = 0")
	private Integer commentCount;

	@CreatedDate
	private LocalDateTime createdAt;

	@LastModifiedDate
	private LocalDateTime updatedAt;


}
