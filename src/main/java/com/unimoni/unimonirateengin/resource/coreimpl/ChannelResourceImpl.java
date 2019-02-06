package com.unimoni.unimonirateengin.resource.coreimpl;

import com.unimoni.unimonirateengin.model.core.request.ChannelReqUI;
import com.unimoni.unimonirateengin.model.core.response.ChannelResUI;
import com.unimoni.unimonirateengin.resource.core.ChannelResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChannelResourceImpl implements ChannelResource {
    @Override
    public List<ChannelResUI> getAll() {
        List<ChannelResUI> channelResUIS=new ArrayList<>();
        return null;
    }

    @Override
    public ChannelResUI save(ChannelReqUI channelReqUI) {
        ChannelResUI channelResUI=new ChannelResUI();
        return channelResUI;
    }

    @Override
    public ChannelResUI update(ChannelReqUI channelReqUI) {
        ChannelResUI channelResUI=new ChannelResUI();
        return channelResUI;
    }

    @Override
    public String delete(ChannelReqUI channelReqUI) {
        return "true";
    }
}
