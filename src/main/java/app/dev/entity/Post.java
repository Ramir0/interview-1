package app.dev.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;

import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @JdbcTypeCode(java.sql.Types.VARCHAR)
    private UUID id;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private LocalDateTime createdAt;
}
