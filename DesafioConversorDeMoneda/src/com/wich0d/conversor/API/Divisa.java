package com.wich0d.conversor.API;

import java.util.ArrayList;
import java.util.List;

public record Divisa(
        String base_code,
        ConversionRates conversion_rates
) {

}
