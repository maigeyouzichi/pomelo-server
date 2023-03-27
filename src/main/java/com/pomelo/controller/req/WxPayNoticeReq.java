package com.pomelo.controller.req;

import java.io.Serializable;
import lombok.Data;

/**
 * @author lihao on 2023/3/25
 */
@Data
public class WxPayNoticeReq implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
//    @JsonProperty("create_time")
    private String create_time;
//    @JsonProperty("resource_type")
    private String resource_type;
//    @JsonProperty("event_type")
    private String event_type;
    private String summary;
    private Resource resource;

}
