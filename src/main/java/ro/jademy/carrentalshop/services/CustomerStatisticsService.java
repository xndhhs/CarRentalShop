package ro.jademy.carrentalshop.services;

import ro.jademy.carrentalshop.model.user.Client;

import java.util.List;

public interface CustomerStatisticsService {

    int calculateMaxPricePaid(Client client);

    int calculateMaxPricePaid(List<Client> client);

}
