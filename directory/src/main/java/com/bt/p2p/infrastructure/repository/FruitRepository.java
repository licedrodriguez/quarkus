package com.bt.p2p.infrastructure.repository;

import com.bt.p2p.infrastructure.entity.FruitEntity;
import io.quarkus.hibernate.reactive.panache.Panache;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class FruitRepository implements PanacheRepository<FruitEntity> {
    @Transactional
    public Uni<FruitEntity> addFruit(FruitEntity fruitEntity){
        return Panache.withTransaction(() -> persist(fruitEntity));
    }
}
