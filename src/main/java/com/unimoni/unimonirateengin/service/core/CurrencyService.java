package com.unimoni.unimonirateengin.service.core;


import com.unimoni.unimonirateengin.entity.core.Currency;
import com.unimoni.unimonirateengin.model.core.request.CurrencyRequestUI;
import com.unimoni.unimonirateengin.model.core.response.CurrencyResponseUI;

import java.util.List;

public interface CurrencyService {
    List<Currency> getAll();
    CurrencyResponseUI save(CurrencyRequestUI currencyRequestUI);
    CurrencyResponseUI update(CurrencyResponseUI currencyResponseUI);
    void Delete(long id);

}
