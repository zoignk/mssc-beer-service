package zoig.springframwork.msscbeerservice.services.inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zoig.springframwork.msscbeerservice.bootstrap.BeerLoader;

import static org.junit.jupiter.api.Assertions.*;

@Disabled // utility for manual testing
@SpringBootTest
class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @BeforeEach
    void setUp() {

    }

    @Test
    void getOnhandInventory() {
//        Integer qoh = beerInventoryService.getOnhandInventory(BeerLoader.BEER_1_UUID);
//        System.out.println(qoh);
    }
}