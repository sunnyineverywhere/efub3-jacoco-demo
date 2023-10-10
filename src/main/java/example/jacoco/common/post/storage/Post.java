package example.jacoco.common.post.storage;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            columnDefinition = "varchar(36)"
    )
    private String author;

    @Column(
            columnDefinition = "varchar(256)"
    )
    private String title;

    @Column(
            columnDefinition = "text"
    )
    private String contents;

    @Builder
    public Post(String author, String title, String contents) {
        this.author = author;
        this.title = title;
        this.contents = contents;
    }
}
