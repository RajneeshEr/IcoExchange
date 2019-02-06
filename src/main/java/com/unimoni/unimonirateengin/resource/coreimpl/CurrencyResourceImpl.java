package com.unimoni.unimonirateengin.resource.coreimpl;

import com.unimoni.unimonirateengin.entity.core.Currency;
import com.unimoni.unimonirateengin.model.core.request.CurrencyRequestUI;
import com.unimoni.unimonirateengin.model.core.response.CurrencyResponseUI;
import com.unimoni.unimonirateengin.resource.core.CurrencyResource;
import com.unimoni.unimonirateengin.service.core.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CurrencyResourceImpl implements CurrencyResource {

    @Autowired
    private CurrencyService currencyService;

    @Override
    public List<Currency> getAll() {
        List list=currencyService.getAll();
        return list;
    }

    @Override
    public CurrencyResponseUI save(CurrencyRequestUI currencyRequestUI) {
        return currencyService.save(currencyRequestUI);
    }

    @Override
    public CurrencyResponseUI update(CurrencyResponseUI currencyResponseUI) {
        return currencyService.update(currencyResponseUI);
    }

    @Override
    public String delete(long id) {
        //currencyService.de(id);
        return "true";
    }

}