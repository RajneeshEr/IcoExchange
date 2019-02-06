package com.unimoni.unimonirateengin.resource.core;

import com.unimoni.unimonirateengin.model.core.request.ProductReqUI;
import com.unimoni.unimonirateengin.model.core.response.ProductResUI;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public interface ProductResource {

    @GetMapping
    List<ProductResUI> getAll();

    @PostMapping
    ProductResUI save(@RequestBody ProductReqUI productReqUI);

    @PutMapping
    ProductResUI update(@RequestBody ProductReqUI productReqUI);

    @DeleteMapping
    String delete(@RequestBody ProductReqUI productReqUI);
}
