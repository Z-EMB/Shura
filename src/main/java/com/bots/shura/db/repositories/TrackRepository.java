package com.bots.shura.db.repositories;

import com.bots.shura.db.entities.Track;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrackRepository extends JpaRepository<Track, Long> {
    List<Track> findAllByGuildId(long guildId);

    List<Track> findAllByNameAndGuildId(String name, long guildId);
}
