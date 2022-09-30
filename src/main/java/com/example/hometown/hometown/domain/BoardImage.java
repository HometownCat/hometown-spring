package com.example.hometown.hometown.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@Table(name = "boardImage")
public class BoardImage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column
	private String image;

	@Column
	private String jpeg;

	@Column
	private String webp;

	@Column
	private String original;

	@Column
	private String jpegBucket;

	@Column
	private String webpBucket;

	@Column
	private String originalBucket;

	@Column
	private Integer width;

	@Column
	private Integer height;

	@Column
	private Integer filesizeJpeg;

	@Column
	private Integer filesizeWebp;

	@Column
	private Integer order;

	@CreatedDate
	private LocalDateTime createdAt;

	@LastModifiedDate
	private LocalDateTime updatedAt;

}
