package com.cpe.wongnai_server.entity;
import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
@Table(name="Member")
public class Member{
  @Id
	@SequenceGenerator(name="member_seq",sequenceName="member_seq")
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="member_seq")
	@Column(name="memberId",unique = true, nullable = true)
	private @NonNull Long mid;
	private @NonNull String username;
	private @NonNull String password;
	private @NonNull String email;
  private @NonNull String memberOf;
    

   
}
