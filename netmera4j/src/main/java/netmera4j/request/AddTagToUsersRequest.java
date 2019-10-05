package netmera4j.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import netmera4j.util.NotEmpty;

import java.util.List;

/**
 * @author Murat Karagözgil
 */
@Getter
@ToString
@AllArgsConstructor
public class AddTagToUsersRequest {
    @NotEmpty
    private String tag;
    @NotEmpty
    private List<String> extIds;
}
