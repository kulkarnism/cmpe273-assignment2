package edu.sjsu.cmpe.library.config;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;

public class LibraryServiceConfiguration extends Configuration {
    @NotEmpty
    @JsonProperty
    private String stompQueueName;

    @NotEmpty
    @JsonProperty
    private String stompTopicName;
    
    @NotEmpty
    @JsonProperty
    private String apolloUser;

    @NotEmpty
    @JsonProperty
    private String apolloPassword;
    
    @NotEmpty
    @JsonProperty
    private String apolloHost;
    
    @NotEmpty
    @JsonProperty
    private String apolloPort;
    
    public String getapolloUser()
    {
    	return apolloUser;
    }
    
    public String getapolloPassword()
    {
    	return apolloPassword;
    }
    public String getapolloHost()
    {
    	return apolloHost;
    }
    public String getapolloPort()
    {
    	return apolloPort;
    }

    /**
     * @return the stompQueueName
     */
    public String getStompQueueName() {
	return stompQueueName;
    }

    /**
     * @param stompQueueName
     *            the stompQueueName to set
     */
    public void setStompQueueName(String stompQueueName) {
	this.stompQueueName = stompQueueName;
    }

    /**
     * @return the stompTopicName
     */
    public String getStompTopicName() {
	return stompTopicName;
    }

    /**
     * @param stompTopicName
     *            the stompTopicName to set
     */
    public void setStompTopicName(String stompTopicName) {
	this.stompTopicName = stompTopicName;
    }
}
