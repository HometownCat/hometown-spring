package com.example.hometown.hometown.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name = "boardComment")
public class BoardComment {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column
	private String comment;

	@Column
	private LocalDateTime createdAt;

	@Column
	private LocalDateTime updatedAt;
}
