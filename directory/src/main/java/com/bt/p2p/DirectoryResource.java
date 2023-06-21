package com.bt.p2p;

import com.bt.p2p.infrastructure.dto.FruitDto;
import com.bt.p2p.infrastructure.services.IFruitService;
import io.quarkus.hibernate.reactive.panache.common.WithSession;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.math.BigInteger;

@Path("/hello")
public class DirectoryResource {

    @Inject
    IFruitService fruitService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @WithSession
    public Uni<String> addFruit() {
        FruitDto dto = new FruitDto();
        dto.setIdFruit(new BigInteger("1"));
        dto.setName("Mango");
        return Uni.createFrom().item("Fruta Creada").call(() -> fruitService.addFruit(dto));
    }
}
