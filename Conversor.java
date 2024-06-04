import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Conversor {
    @SerializedName("base_code")
    private String baseCode;
    @SerializedName("conversion_rates")
    private Map<String, Double> conversionRates;

    public String getBase_code() {
        return baseCode;
    }

    public void setBase_code(String baseCode) {
        this.baseCode = baseCode;
    }

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }
}


