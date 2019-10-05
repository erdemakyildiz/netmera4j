package netmera4j.request;

import lombok.*;
import netmera4j.model.UserAndProfileAttributeList;
import netmera4j.util.NotEmpty;

import java.util.List;

/**
 * @author Murat Karagözgil
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PushProfileAttributesToUserRequest {
    @NotEmpty
    private List<UserAndProfileAttributeList> userAndProfileAttributeLists;
}
