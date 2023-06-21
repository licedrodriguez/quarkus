package com.bt.p2p.infrastructure.services.impl;

import com.bt.p2p.infrastructure.dto.FruitDto;
import com.bt.p2p.infrastructure.entity.FruitEntity;
import com.bt.p2p.infrastructure.repository.FruitRepository;
import com.bt.p2p.infrastructure.services.IFruitService;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class FruitService implements IFruitService {

    @Inject
    FruitRepository fruitRepository;

    @Override
    public Uni<Boolean> addFruit(FruitDto fruitDto) {
        FruitEntity fruit = new FruitEntity(fruitDto.getIdFruit(), fruitDto.getName());
        return fruitRepository.addFruit(fruit).map(fruitEntity -> true);
    }
}
