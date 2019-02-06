package com.unimoni.unimonirateengin.resource.core;

import com.unimoni.unimonirateengin.entity.core.Currency;
import com.unimoni.unimonirateengin.model.core.request.CurrencyRequestUI;
import com.unimoni.unimonirateengin.model.core.response.CurrencyResponseUI;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/currency")
public interface CurrencyResource {

    @GetMapping()
    List<Currency> getAll();

    @PostMapping()
    CurrencyResponseUI save(@RequestBody CurrencyRequestUI currencyRequestUI);

    @PutMapping()
    CurrencyResponseUI update(@RequestBody CurrencyResponseUI currencyResponseUI);

    @DeleteMapping
    String delete(@RequestBody long id);
}
