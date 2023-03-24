package com.pomelo.controller.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * @author lihao on 2023/3/25
 */
@Data
public class WxPayNoticeReq implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @JsonProperty("create_time")
    private String createTime;
    @JsonProperty("resource_type")
    private String resourceType;
    @JsonProperty("event_type")
    private String eventType;
    private String summary;
    private Resource resource;

}
