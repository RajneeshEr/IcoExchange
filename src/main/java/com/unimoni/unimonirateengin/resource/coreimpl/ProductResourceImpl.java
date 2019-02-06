package com.unimoni.unimonirateengin.resource.coreimpl;

import com.unimoni.unimonirateengin.model.core.request.ProductReqUI;
import com.unimoni.unimonirateengin.model.core.response.ProductResUI;
import com.unimoni.unimonirateengin.resource.core.ProductResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductResourceImpl implements ProductResource {
    @Override
    public List<ProductResUI> getAll() {
        List<ProductResUI> productResUIS=new ArrayList<>();
        return productResUIS;
    }

    @Override
    public ProductResUI save(ProductReqUI productReqUI) {
        ProductResUI productResUI=new ProductResUI();
        return productResUI;
    }

    @Override
    public ProductResUI update(ProductReqUI productReqUI) {
        ProductResUI productResUI=new ProductResUI();
        return productResUI;
    }

    @Override
    public String delete(ProductReqUI productReqUI) {
        return "true";
    }
}
