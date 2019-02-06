package com.unimoni.unimonirateengin.resource.core;

import com.unimoni.unimonirateengin.model.core.request.ChannelReqUI;
import com.unimoni.unimonirateengin.model.core.response.ChannelResUI;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/channel")
public interface ChannelResource {
    @GetMapping
    List<ChannelResUI> getAll();

    @PostMapping
    ChannelResUI save(@RequestBody ChannelReqUI channelReqUI);

    @PutMapping
    ChannelResUI update(@RequestBody ChannelReqUI channelReqUI);

    @DeleteMapping
    String delete(@RequestBody ChannelReqUI channelReqUI);
}
