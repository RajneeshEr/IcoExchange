package com.unimoni.unimonirateengin.service.coreimpl;

import com.unimoni.unimonirateengin.entity.core.Currency;
import com.unimoni.unimonirateengin.model.core.request.CurrencyRequestUI;
import com.unimoni.unimonirateengin.model.core.response.CurrencyResponseUI;
import com.unimoni.unimonirateengin.repository.core.CurrencyRepository;
import com.unimoni.unimonirateengin.service.core.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    public List<Currency> getAll() {
        List list= currencyRepository.findAll();
        return list;
    }

    @Override
    public CurrencyResponseUI save(CurrencyRequestUI currencyRequestUI) {
        Currency currency=new Currency(currencyRequestUI);
        CurrencyResponseUI currencyResponseUI=new CurrencyResponseUI(currencyRepository.save(currency));
        return currencyResponseUI;
    }

    @Override
    public CurrencyResponseUI update(CurrencyResponseUI currencyResponseUI) {
        Currency currency=new Currency(currencyResponseUI);
        CurrencyResponseUI currencyResponseUI1=new CurrencyResponseUI(currencyRepository.save(currency));
        get();
        return currencyResponseUI1;
    }

    public void get() {
        System.out.println("hello");
        String hiii = "Hiii";
        System.out.println(hiii);
    }

    @Override
    public void Delete(long id) {
        currencyRepository.deleteById(id);
    }


}
