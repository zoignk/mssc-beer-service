package zoig.springframwork.msscbeerservice.services;

import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import zoig.springframwork.msscbeerservice.web.model.BeerDto;
import zoig.springframwork.msscbeerservice.web.model.BeerPagedList;
import zoig.springframwork.msscbeerservice.web.model.BeerStyleEnum;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId, Boolean showInventoryOnHand);

    public BeerDto saveNewBeer(BeerDto beerDto);

    public BeerDto updateBeerById(UUID beerId, BeerDto beerDto);

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);
}
