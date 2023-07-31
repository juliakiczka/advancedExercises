package org.example.typWyliczeniowy.zadanie2;

public enum PackageSize {
    SMALL(40, 90), MEDIUM(90, 140), LARGE(140, 250), UNKNOWN(0, 0);
    protected int minSize;
    protected int maxSize;

    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public static PackageSize getPackageSize(int minSize, int maxSize) {
        for (PackageSize packageSize : values()) {
            if (minSize >= packageSize.minSize && maxSize < packageSize.maxSize){
                return packageSize;
            }
        }
        return UNKNOWN;
    }
}
