package zoig.springframwork.msscbeerservice.web.mappers;

import org.mapstruct.Mapper;
import zoig.springframwork.msscbeerservice.domain.Beer;
import zoig.springframwork.msscbeerservice.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
