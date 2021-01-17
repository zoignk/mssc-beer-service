package zoig.springframwork.msscbeerservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import zoig.springframwork.msscbeerservice.domain.Beer;
import zoig.springframwork.msscbeerservice.repositories.BeerRepository;
import zoig.springframwork.msscbeerservice.web.controller.NotFoundException;
import zoig.springframwork.msscbeerservice.web.mappers.BeerMapper;
import zoig.springframwork.msscbeerservice.web.model.BeerDto;

import java.util.UUID;
@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return beerMapper.beerToBeerDto(
                beerRepository.findById(beerId).orElseThrow(NotFoundException::new));
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerMapper.beerToBeerDto(beerRepository.save(beerMapper.beerDtoToBeer(beerDto)));
    }

    @Override
    public BeerDto updateBeerById(UUID beerId, BeerDto beerDto) {
        Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundException::new);

        beer.setBeerName(beerDto.getBeerName());
        beer.setBeerStyle(beerDto.getBeerStyle().name());
        beer.setPrice(beerDto.getPrice());
        beer.setUpc(beerDto.getUpc());

        return beerMapper.beerToBeerDto(beerRepository.save(beer));
    }
}
