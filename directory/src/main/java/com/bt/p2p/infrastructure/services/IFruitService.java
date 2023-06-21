package com.bt.p2p.infrastructure.services;

import com.bt.p2p.infrastructure.dto.FruitDto;
import io.smallrye.mutiny.Uni;

public interface IFruitService {
    Uni<Boolean> addFruit(FruitDto fruitDto);
}
