package com.helldivers.populate.models.HelldiverAPI;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PlayerResponse {
    List<PlayerData> players;
}
