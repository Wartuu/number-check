package json;

import com.google.gson.annotations.SerializedName;

public class Number {
    @SerializedName("value")
    public int number;

    @SerializedName("prime")
    public boolean isPrime;

    @SerializedName("perfect")
    public boolean isPerfect;

    @SerializedName("fibb")
    public boolean isFib;
}
