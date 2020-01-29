package com.binart.binartcommon.domain.events;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DomainEvent<T> {
    /**
     * cloud events spec version
     */
    @JSONField(name = "specversion")
    private String specVersion = "0.3";
    /**
     * event ID
     */
    @JSONField(name = "id")
    private String id = UUID.randomUUID().toString();
    /**
     * event type: com.example.someevent
     */
    @JSONField(name = "type")
    private String type;
    /**
     * additional metadata
     */
    @JSONField(name = "extensions")
    private Map<String, Object> extensions = new HashMap<>();
    /**
     * event producer
     */
    @JSONField(name = "source")
    private URI source;
    /**
     * indicates which resource the event is about
     */
    private String subject;
    /**
     * content type for data, such as text/plain, application/json
     */
    @JSONField(name = "datacontenttype")
    private String dataContentType;
    /**
     * The event payload
     */
    @JSONField(name = "data")
    private T data;
    /**
     * A link to the schema that the data attribute adheres to
     */
    @JSONField(name = "schemaurl")
    private URI schemaURL;
    /**
     * Timestamp of when the event happened
     */
    @JSONField(name = "time", format = "yyyy-MM-dd'T'HH:mm:ssZ")
    private Date time = new Date();

    public Object getExtension(String name) {
        return extensions == null ? null : extensions.get(name);
    }

    public void setExtension(String name, Object value) {
        this.extensions.put(name, value);
    }
}
