package zoig.springframwork.msscbeerservice.services;

import org.springframework.http.ResponseEntity;
import zoig.springframwork.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    public BeerDto getBeerById(UUID beerId);

    public BeerDto saveNewBeer(BeerDto beerDto);

    public BeerDto updateBeerById(UUID beerId, BeerDto beerDto);
}
