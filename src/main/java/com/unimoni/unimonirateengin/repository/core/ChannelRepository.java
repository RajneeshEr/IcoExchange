package com.unimoni.unimonirateengin.repository.core;

import com.unimoni.unimonirateengin.entity.core.Channel;
import com.unimoni.unimonirateengin.model.core.projection.ChannelProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource
public interface ChannelRepository extends JpaRepository<Channel,Long> {
    List<ChannelProjection> findAllProjectedBy();
}