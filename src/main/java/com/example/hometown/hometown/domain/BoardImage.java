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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "image", columnDefinition = "text default = null")
	private String image;

	@Column(name = "jpeg", columnDefinition = "text default = null")
	private String jpeg;

	@Column(name = "webp", columnDefinition = "text default = null")
	private String webp;

	@Column(name = "original", columnDefinition = "text default = null")
	private String original;

	@Column(name = "jpegBucket", columnDefinition = "text default = null")
	private String jpegBucket;

	@Column(name = "webpBucket", columnDefinition = "text default = null")
	private String webpBucket;

	@Column(name = "originalBucket", columnDefinition = "text default = null")
	private String originalBucket;

	@Column(name = "width", columnDefinition = "mediumint(9) default = null")
	private Integer width;

	@Column(name = "height", columnDefinition = "mediumint(9) default = null")
	private Integer height;

	@Column(name = "filesizeJpeg", columnDefinition = "mediumint(9) default = null")
	private Integer filesizeJpeg;

	@Column(name = "filesizeWebp", columnDefinition = "mediumint(9) default = null")
	private Integer filesizeWebp;

	@Column(name = "order", columnDefinition = "tinyint(4) default = null")
	private Integer order;

	@CreatedDate
	private LocalDateTime createdAt;

	@LastModifiedDate
	private LocalDateTime updatedAt;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "boardId", referencedColumnName = "id")
	private Board board;

}
