package com.unimoni.unimonirateengin.model.core.projection;

import com.unimoni.unimonirateengin.entity.core.Channel;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "ChannelProject" , types = Channel.class)
public interface ChannelProjection  {
    String getCode();
    String getId();
}
