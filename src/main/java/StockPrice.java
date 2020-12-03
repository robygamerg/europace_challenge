class StockPrice {
    private long date;
    private float open;
    private float high;
    private float low;
    private float close;
    private int volume;
    private float adjclose;

    public StockPrice(long date, float open, float high, float low, float close, int volume, float adjclose) {
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.adjclose = adjclose;
    }

    public long getDate() {
        return date;
    }

    public float getOpen() {
        return open;
    }

    public float getHigh() {
        return high;
    }

    public float getLow() {
        return low;
    }

    public float getClose() {
        return close;
    }

    public int getVolume() {
        return volume;
    }

    public float getAdjclose() {
        return adjclose;
    }
}
