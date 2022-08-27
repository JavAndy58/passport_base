package passport_base.repositort;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PreDestroy;
import java.util.Collections;
import java.util.List;

@Repository
public class TrackerApiStore implements PassportRepository {

    @Value("${url}")
    private String url;
    private final RestTemplate client;

    public TrackerApiStore(RestTemplate client) {
        this.client = client;
    }


}
