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

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	private String comment;

	private LocalDateTime createdAt;

	private LocalDateTime updatedAt;
}
