import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Builder
@Getter
public class Empl {

    private String firstName;

    private String lastName;

    private int cash;
}
