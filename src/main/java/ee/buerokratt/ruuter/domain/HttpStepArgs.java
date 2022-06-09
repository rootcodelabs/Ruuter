package ee.buerokratt.ruuter.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@NoArgsConstructor
public class HttpStepArgs {
    private String url;
    private HashMap<String, Object> query;
    private HashMap<String, String> headers;
    private HashMap<String, Object> body;
}
