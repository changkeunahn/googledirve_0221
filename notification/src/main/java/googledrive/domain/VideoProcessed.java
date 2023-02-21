package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String url;
    private String fileKey;
}


